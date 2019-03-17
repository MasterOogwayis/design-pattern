package com.zsw.design.observer.my;

import lombok.SneakyThrows;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式
 *
 * @author Shaowei Zhang on 2019/3/18 0:17
 **/
public class TestMyObserver {

    @SneakyThrows
    public static void main(String[] args) {
        Teacher teacher = new Teacher("张老师");

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student("学生" + i);
            students.add(student);
        }
        students.forEach(teacher::addObserver);

        // 模拟订阅事件
        new Thread(() ->{
            try {
                for (int i = 0; i < 1000; i++) {
                    teacher.setHomework("语文");
                    Thread.sleep(1000);
                    if (teacher.countObservers() == 0) {
                        System.err.println("学生都跑完了..................... exit");
                        break;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        // 模拟取消订阅
        new Thread(()->{
            while (true) {
                Student student = students.remove(RandomUtils.nextInt(students.size()));
                teacher.deleteObserver(student);
                System.err.println(student.getName() + " 逃课了 ------------------------------");
                if (CollectionUtils.isEmpty(students)) {
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }).start();


    }

}
