package com.rwto.designpattern.creational.prototype;

// 奖状类
class Citation implements Cloneable {
    private String name; // 注意，String为不可变类

    public Citation(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
 
    public String getName() {
        return this.name;
    }
 
    public void show() {
        System.out.println(name);
    }
 
    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    @Override
    public String toString() {
        return "Citation{" +
                "name='" + name + '\'' +
                '}';
    }
}
