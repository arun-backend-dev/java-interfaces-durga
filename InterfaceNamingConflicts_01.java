package com.arunit.interfaces;

/*
 Method naming conflicts :
 -------------------------
 case 1:
 -if 2 interfaces can contain same method with same signature and same with return type then inthe implementation class we have to provide implementation for only 1 method.
 
 Interface Left
----------------
interface Left {
    public void m1();
}

Interface Right
----------------
interface Right {
    public void m1();
}


Implementation
----------------
class Test implements Left, Right {

    public void m1() {
        // common implementation
        System.out.println("Implementation of m1()");
    }
}
=========================================================================================================

case2:
------------
-if 2 interfaces can contains a method with same name but different argument types then in the imlementation class we have to provide implementation for both methods and these methods acts as overloaded methods.
Interface Left
----------------
interface Left {
    public void m1();
}

Interface Right
----------------
interface Right {
    public void m1(int i);
}


Implementation
----------------
class Test implements Left, Right {

    // method from Left
    public void m1() {
        System.out.println("m1() method");
    }

    // method from Right
    public void m1(int i) {
        System.out.println("m1(int i) method");
    }
}
=========================================================================================================
 case3:
 ---------
 -if 2 interfaces contains a method with same signture but different return types then it is impossible to implement both interfaces simultaeously(if return types are not co-variant)
 
 interface left{
 public void m1();
 }
 
  interface ight{
 public int m1();
 }
 
 -we cannot write any java class which implements both interfaces simultaneously.
 
=========================================================================================================
Q)is a java class can implement any no of interfaces simultaneously?
A)yes..except a particular case .if 2 interfaces contains a method with same signature but different return types then it is impossible to implement both interfaces simultaneously.
 * */



public class InterfaceNamingConflicts_01 {

}
