/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package multithreading;

public class TreadTest extends Thread{

    @Override
    public void run() {
        System.out.println("Hello from Thread class output");
        run(1);
    }
    public void run(int a) {
        System.out.println("Hello from overeloaded : "+a);
    }

    public static void main(String[] args) {
        TreadTest treadTest = new TreadTest();
        treadTest.start();
    }
}
