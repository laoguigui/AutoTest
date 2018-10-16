package com.course.testng;

import org.testng.annotations.Test;

public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1执行");
        throw new RuntimeException();
    }
    //test1执行成功才能执行test2
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test1执行");
    }
}
