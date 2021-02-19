package edu.zxie0018;

public class Test {
    private int age;
    private String name;
    private int testint;

    public Test(int age) {
        this.age = age;
    }

    private Test(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Test(String name) {
        this.name = name;
    }

    public Test() {}
}
