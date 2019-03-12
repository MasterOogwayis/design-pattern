package com.zsw.design.prototype;


/**
 * 深拷贝，将对象序列化 成字节码，然后反序列化
 *
 * @author ZhangShaowei on 2019/03/11 19:28
 **/
public class DeepCloneTest {


    public static void main(String[] args) throws Exception {

        ChildrenTarget childrenTarget = new ChildrenTarget("childrenTarget");
        DeepCloneTarget deepCloneTarget = new DeepCloneTarget(childrenTarget);

        System.out.println(deepCloneTarget + "   " + childrenTarget);

        DeepCloneTarget cloneObject = (DeepCloneTarget) deepCloneTarget.clone();

        System.err.println(cloneObject + "   " + cloneObject.getChildrenTarget());

        System.out.println(deepCloneTarget.equals(cloneObject));
        System.out.println(deepCloneTarget.getChildrenTarget().equals(cloneObject.getChildrenTarget()));

    }

}
