package org.Singleton;

public class Logging {

    private static Logging instance;

    private Logging(){

    }

    public static Logging GetInstance() {
        if(instance==null){
            System.out.println("Object Created");
            instance=new Logging();
            return instance;
        }else{
            System.out.println("already Created");
            return null;

        }
    }


}
