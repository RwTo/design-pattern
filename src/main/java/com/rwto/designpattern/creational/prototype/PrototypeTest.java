package com.rwto.designpattern.creational.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author renmw
 * @create 2023/11/7 11:02
 **/
@SpringBootTest
public class PrototypeTest {

    /**
     * 浅拷贝
     * 复制一个奖状类
     */
    @Test
    public void ShallowCopy() throws CloneNotSupportedException {
        Citation citation = new Citation("三好学生");
        Citation clone = citation.clone();
        clone.setName("优秀学生");
        citation.show();
        clone.show();
        System.out.println(clone == citation);
    }

    /**
     * 深拷贝
     * 复制一个学生改个名
     */
    @Test
    public void DeepCopy() throws CloneNotSupportedException {
        Student student = new Student();
        student.setName("张三");
        student.setCitation(new Citation("三好学生"));

        Student clone = student.clone();
        clone.setName("李四");
        clone.getCitation().setName("优秀学生");
        System.out.println(student);
        System.out.println(clone);
        System.out.println(student == clone);
    }
}
