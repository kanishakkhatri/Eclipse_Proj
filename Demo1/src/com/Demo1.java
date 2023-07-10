package com;
class A{
    A(){
        System.out.println("A class constructor...!");
    }
    void abc() {
        System.out.println("ABC method...!");
    }
}
public class Demo1 {
    public static void main(String args[]) {
        A a=new A();
        a.abc();

    }
}