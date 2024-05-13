package org.Polymorphism;

public class PolymorphismDemo {

    public int sum(int a,int b){
        return a+b;
    }

    public int sum(int a,int b,int c){
        return a+b+c;
    }


}

 class Pd extends PolymorphismDemo{

    public int sum(int a,int b){
        return a+b+100;
    }
 }
