package org.Encapsulation;

public class EncapsulationDemo {

    private String data;

    public void setData(String data){
        this.data=data;
    }
    public String getData(){
        return data;
    }
    EncapsulationDemo(String data){
        this.data=data;
    }
}
