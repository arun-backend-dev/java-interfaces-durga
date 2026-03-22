package com.arunit.interfaces;

/*
 extends vs implements :
 
  -a class can extend only one class at a time 
  -an interface can extend any no of interfaces simultaneously
    interface A{
    
    }
    
    interface B{
    
    } 
    
    interface c extends A,B{
    
    }
  -Above program is valid  
 =================================================================================================
 -a class can implement any no of interfaces simultaneously
 -a class can extend another class and implement and can implement any no of interfaces simultaneously
 
    class A extends B implements C,D,E{
    
    }
    
     -Above program is valid  
     
 ======================================================================================================
 
 -which of the following is valid?
 1)a class can extend any no of classes at a time (invalid)
 2)a class can implement only 1 interface at a time (invalid)
 3)an interface can extend only 1 interface at a time (invalid)
 4)an interface can implement any no of interfaces simultaneously (invalid)
 5)a class can extend another class or can implement an interface but not both simutaneously (invalid)
 6)None of the above (valid)
 ====================================================================================================
 

1)  X extends Y
    ----------------
    ✔ Valid
    X, Y -> Classes or interfaces


2)  X extends Y, Z
    ----------------
    ❌ Invalid
    ✔ Only possible if:
       X, Y, Z -> Interfaces


3)  X implements Y, Z
    -------------------
    ✔ Valid
    X -> Class
    Y, Z -> Interfaces


4)  X extends Y implements Z
    --------------------------
    ✔ Valid
    X, Y -> Classes
    Z -> Interface


5)  X implements Y extends Z
    --------------------------
    ❌ Compile Time Error (CE)

    Reason:
    In Java syntax:
    extends must come BEFORE implements

    
 **/


public class Introduction_04 {

}
