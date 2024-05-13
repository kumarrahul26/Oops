package org.Singleton;

public class Client {
    public static void main(String[] args) {

        Logging  demo = Logging.GetInstance();
        Logging  demo1 = Logging.GetInstance();

    }
}
