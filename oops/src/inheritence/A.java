package inheritence;

public class A {

    /*
     * Rule 3:
     * */

    /*
    * Keyowrd like final,private,abstract,synchronized related rules
    * */

    // Since display method is private in nature, SO it's not visible to it's child class, So not method overriding will happen
    // SO this mean private method can't be override
    private void display () {
        System.out.println("Method display : In class A");
    }

    public final void m1 () {
        System.out.println("Method m1 : In class A");
    }

    /*-----------------------------------------------------------------------------------------------------------------------------------------*/

    /*
     * Rule 4:
     * */


    /*
    *  Access modifier rules
    * */

    // Here overriding method have public modifier, So scope need not to be reduced in sub-class else will cause compile time exception
    public void m2 () {
    }

    /*-----------------------------------------------------------------------------------------------------------------------------------------*/
    /*
     * Rule 6: Method hiding
     * */

    /*
     * Parent(METHOD)    static        non static        static
     *                     |              |                |
     *                  can't be       can't be          can be (Method hidding it's not method overriding)
     *                     |              |                |
     * Child           non static      static           static
     * (OVERRIDING METHOD) here when both Parent and Child have static method then reference can resolve method at compile time (not at runtime as usually happen in overriding)
     * */

    public static void m3() {
        System.out.println("Mehtod static m3 : in Parent Class");
    }



}
class B extends A{
    /*
     * Rule 3:
     * */


    /*
     * Keyowrd like final,private,abstract,synchronized related rules
     * */


    // Here it's not override method as it's seperate method in class B
    private void display () {
        System.out.println("Method display : In class A");
    }

//    public void m1 () {} 'm1()' cannot override 'm1()' in 'Class A'; overridden method is final


    /*
    * Parent(METHOD)    final       non final   abstract    non abstract    synchronized
    *                     |             |         |               |               |
    *               can't be done      done      done            done            done
    *                     |             |         |               |               |
    * Child             non final     final    non abstract    abstract    non synchronized
    * (OVERRIDING METHOD)
    * */
/*-----------------------------------------------------------------------------------------------------------------------------------------*/
    /*
     * Rule 4:
     * */

    /*
     *  Access modifier rules
     * */

    // it'll give me compile time exception with : 'm2()' in 'Class B' clashes with 'm2()' in ' CLass A'; attempting to assign weaker access privileges ('protected'); was 'public'
    //protected void m2 () {}
    // So it's necessary that while overriding scope of modifier can't be reduced else it'll give me compile time exception. Where as scope os modifier can be increased.

    /*                      private < default < protected < public
     * Parent(METHOD)    public       protected         default                 private
     *                     |             |                  |                       |
     *                  can be         can be             can be               cannot be overridden
     *                     |             |                  |
     * Child             public     protected,public    default,protected,public
     * (OVERRIDING METHOD) -> here we can increase scope of access modifier but we cannot decrease scope.
     * */


    /*-----------------------------------------------------------------------------------------------------------------------------------------*/
    /*
     * Rule 5:
     * */

    // If Child class's overridden method throw checked Exception then compulsory its parent class's overridden should throw same eception or parent of  Child class's overridden method Exception
    // There is no rule for unchecked Exception


    /*-----------------------------------------------------------------------------------------------------------------------------------------*/
    /*
     * Rule 6: Method hiding
     * */

    /*
     * Parent(METHOD)    static        non static        static
     *                     |              |                |
     *                  can't be       can't be          can be (Method hidding it's not method overriding)
     *                     |              |                |
     * Child           non static      static           static
     * (OVERRIDING METHOD) here when both Parent and Child have static method then reference can resolve method at compile time (not at runtime as usually happen in overriding)
     * */

    public static void m3() {
        System.out.println("Mehtod static m3 : in Child Class");
    }
}
