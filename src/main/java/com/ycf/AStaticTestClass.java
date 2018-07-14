package com.ycf;

public class AStaticTestClass {

    private String name;

    private static String staticName;

    public AStaticTestClass(){}

    public AStaticTestClass(String name){
        this.name = name;
    }

    static {
        staticName = "ImStatic";
//        name = "no it's wrong";       //错误，因为这是成员变量，隶属于对象
        System.out.println("in AStaticTestClass static");
    }

    public void doPrint() {
        System.out.println("in normal method!");
        System.out.println("static name is : " + staticName);
        System.out.println("name is :" + name);
    }

    public static void doStaticPrint() {
        System.out.println("in normal method!");
        System.out.println("static name is : " + staticName);
//        System.out.println("name is :" + name);           //错误，因为这是静态方法，不能调用隶属于对象的成员变量
    }
}
