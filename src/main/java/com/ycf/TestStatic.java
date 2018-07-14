package com.ycf;

public class TestStatic {

    static {
        System.out.println("in TestStatic static");
    }

    public static void main(String[] args) {
        System.out.println("in main");
        AStaticTestClass.doStaticPrint();
//        AStaticTestClass.doPrint();       // 错误，因为普通方法隶属于对象，不能用类调用
        AStaticTestClass aObject = new AStaticTestClass("ycf");

        aObject.doPrint();
        aObject.doStaticPrint();
    }
}
