package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass1 {
    public void Stu1(){
        System.out.println("GroupOnClass1中的stu1111运行");

    }
    public void Stu2(){
        System.out.println("GroupOnClass1中的stu2222运行");

    }
}
