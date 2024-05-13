package org.Exception;

public class ExceptionDemo {

    public void temp(int b){
        int a=50;
        try {

            System.out.println(a / b);
        }catch(Exception e){
            System.out.println(e);
             b=b+1;
            System.out.println(a/b);
       }
       finally{
            System.out.println("I am inside finally");
        }
    }

    public static void main(String[] args) {
        ExceptionDemo demo =new ExceptionDemo();
        demo.temp(0);
    }
}
