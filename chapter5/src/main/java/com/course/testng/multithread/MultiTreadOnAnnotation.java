package com.course.testng.multithread;

import org.testng.annotations.Test;

public class MultiTreadOnAnnotation {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test1(){
        System.out.println(1);
        System.out.printf("Thread Id %s%n",Thread.currentThread().getId());
    }

}
