package org.Inheritance;

public class Client {
    public static void main(String[] args) {
//        Idemo id=new Idemo();
//        System.out.println(id.sum());System.out.println(id.minius());
//        InheritanceDemo ID=new InheritanceDemo();
//        String z=ID.sum();System.out.println(z);
        Address address=new Address("Patna","8015031");
        Student st=new Student("Rahul",address);//;System.out.println(address.city);
        System.out.println(st.name);System.out.println(st.address.pincode);
    }
}
