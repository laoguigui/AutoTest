package com.course.testng;

import org.testng.annotations.*;

public class Annotation {
    @Test
    public void test1() {
        System.out.println("Test1这是测试用例1");
    }

    @Test
    public void test2() {
        System.out.println("Test2这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("这是测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("这是测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("这是类之前运行的");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("这是类之后运行的");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("afterSuite");
    }
}

