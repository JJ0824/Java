package Modifier_1.pack2;

import Modifier_1.pack1.A;
public class C {
    public void print() {
        A a = new A();
        System.out.println(a.a + " ");
        //System.out.println(a.b + " "); // protected 외부패키지 read/write불가
        //System.out.println(a.c + " "); // default 외부패키지 read/write불가
        //System.out.println(a.d + " "); // private 외부클래스 read/write불가
        System.out.println();
    }
}
