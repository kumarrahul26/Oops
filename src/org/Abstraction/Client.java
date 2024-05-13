package org.Abstraction;

public class Client {
    public static void main(String[] args) {
        Hdfc h=new Hdfc();
        System.out.println(h.getName());
        Sbi s=new Sbi();
        System.out.println(s.getUpi());
    }
}
