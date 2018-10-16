package com.course.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class dataParameter {
    @Test(dataProvider = "data")
    public void datapara(String name, int age) {
        System.out.println("name=" + name + ";age=" + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"zhangsan", 10},
                {"lisi", 20}
        };
        return o;
    }

    @Test(dataProvider = "dataMethod")
    public void test1(String name, int age) {
        System.out.println("test1中name=" + name + ";age=" + age);
    }

    @Test(dataProvider = "dataMethod")
    public void test2(String name, int age) {
        System.out.println("test2中name=" + name + ";age=" + age);
    }

    @DataProvider(name = "dataMethod")
    public Object[][] dataMethod(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"zhangsan",40}
            };


        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"lisi",60}
            };

        }
        return result;
    }
}

