package com.course.testng.groups;

import org.testng.annotations.Test;

/*

 */
@Test(groups = "stu")
public class GroupClass2 {
    public void Stu1(){
        System.out.println("GroupOnClass2中的stu1111运行");

    }
    public void Stu2(){
        System.out.println("GroupOnClass2中的stu2222运行");

    }
}
