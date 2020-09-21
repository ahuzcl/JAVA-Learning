package com.cunliang.Annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Test01 {

    public static void main(String[] args) {

        test();

    }

    @Deprecated
    public static void test(){
        System.out.println("不推荐使用");
    }


}

@Target({ElementType.TYPE,ElementType.METHOD})
@interface myAnnotation{
    //自定义注解
}

