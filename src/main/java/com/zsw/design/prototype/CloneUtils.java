package com.zsw.design.prototype;

import lombok.Cleanup;

import java.io.*;

/**
 * @author ZhangShaowei on 2019/3/12 13:43
 **/
public class CloneUtils {


    @SuppressWarnings("unchecked")
    public static <T> T clone(T t) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        @Cleanup ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(t);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        @Cleanup ObjectInputStream ois = new ObjectInputStream(bais);
        return (T) ois.readObject();
    }

}
