package com.rwto.designpattern.creational.prototype;

/**
 * @author renmw
 * @create 2023/11/7 13:08
 **/
public class Student implements Cloneable{
    private String name;

    private Citation citation;

    public void setName(String name) {
        this.name = name;
    }

    public void setCitation(Citation citation) {
        this.citation = citation;
    }

    public Citation getCitation(){
        return citation;
    }
    /**
     * 深拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student clone = (Student) super.clone();
        Citation citation = this.citation.clone();
        clone.setCitation(citation);
        return clone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", citation=" + citation +
                '}';
    }
}
