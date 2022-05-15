/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package multithreading;

public class RunnableTest implements Runnable{
    @Override
    public void run() {
        run(1);
        System.out.println("Hello from runnable eun method");
    }
    public void run(int a) {
        System.out.println("Hello from overeloaded : "+a);
    }

    public static void main(String[] args) {
        RunnableTest runnableTest = new RunnableTest();

        Thread th = new Thread(runnableTest);
        th.start();
    }
}
