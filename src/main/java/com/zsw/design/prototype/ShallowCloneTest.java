package com.zsw.design.prototype;

/**
 * 浅拷贝，基本类型外的内部属性指向同一个引用
 *
 * @author ZhangShaowei on 2019/03/11 19:28
 **/
public class ShallowCloneTest {


    public static void main(String[] aergs) throws CloneNotSupportedException {


        ChildrenTarget childrenTarget = new ChildrenTarget("childrenTarget");
        CloneTarget cloneTarget = new CloneTarget(childrenTarget);

        System.out.println(cloneTarget + "   " + childrenTarget);

        CloneTarget cloneObject = (CloneTarget) cloneTarget.clone();

        System.err.println(cloneObject + "   " + cloneObject.getChildrenTarget());

        System.out.println(cloneTarget.equals(cloneObject));
        System.out.println(cloneTarget.getChildrenTarget().equals(cloneObject.getChildrenTarget()));
    }

}
