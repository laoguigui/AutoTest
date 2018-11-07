package com.course.testng.multithread;

import org.testng.annotations.Test;

public class MultiTreadOnXml {

    @Test
    public void test1(){
        System.out.printf("Tread Id:%s%n",Thread.currentThread().getId());

    }
    @Test
    public void test2(){
        System.out.printf("Tread Id:%s%n",Thread.currentThread().getId());
    }
    @Test
    public  void test3(){
        System.out.printf("Tread Id: %s%n",Thread.currentThread().getId());
    }
}
