/*
 * Copyright (c) 2022.
 * @author : Ankit Raj
 */

package Basic;

import javax.swing.*;

public abstract class AbstractClassTest {

    public abstract void print();

    public int add(int a) {
        return a + 10;
    }

}

class Test extends AbstractClassTest {
    @Override
    public void print() {
        System.out.println("In Test class");
    }

    public static void main(String[] args) {
        AbstractClassTest test = new Test();

        System.out.println(test.add(10));
        test.print();
    }

}


interface Drawable{
    void draw();
    static int cube(int x){return x*x*x;}
}
class Rectangle implements Drawable{
    public void draw(){System.out.println("drawing rectangle");}
}

class TestInterfaceStatic{
    public static void main(String args[]){
        Drawable d=new Rectangle();
        d.draw();
        System.out.println(Drawable.cube(3));
    }}
