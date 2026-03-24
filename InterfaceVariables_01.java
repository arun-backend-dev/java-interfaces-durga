package com.arunit.interfaces;

/*
 -an interface can contain variables the main purpose of interface variables is to define requirement level constants 
 -every interface variable is always public static final  whether we are declaring or not 
   interface interf{
   int x=10;
    }
 -why x is public is to make this variable available to every implementation class and why final is if one implementation class changes value then remaining implementation classes will be affected to restrict is every interface variable is always final and why static is  without existing objectalso implementation class has to access this variable.
 -hence within the interface the following variable declarations are equal :
 
   int x = 10;
public int x = 10;
static int x = 10;
final int x = 10;

public static int x = 10;
public final int x = 10;
static final int x = 10;

public static final int x = 10; 


-as every interface variable is always public static final we cannot declare with the following modifiers:
  private,protected,transient,volatile
-for interface variables compulsory we should perform initialisation at the time of declaration otherwise we will get compile time error
   interface intrf{
   int x;//CE:= symbol expected
   
   }
   ==============================================================================================
1)inside interface which of the following variable declarations are allowed?
  int x;
  private int x=10;
  protected int x=10;
  volatile int x=10;
  transient int x=10;
  public static int x=10;  (✅)
   ==============================================================================================
-inside implementation class we can access interface varibles but we cannot modify values 
   interface intrf{
   int x=10;
   
   }
Case 1: Using final variable (Error)

class Test implements Intrf {
    public static void main(String[] args) {
        x = 777;          // ❌ Compile-time error
        System.out.println(x);
    }
}

Error:
Cannot assign a value to final variable 'x'


-----------------------------------------------

Case 2: Using local variable (Valid)

class Test implements Intrf {
    public static void main(String[] args) {
        int x = 777;      // ✅ Local variable
        System.out.println(x);  // Output: 777
    }
}
*/
 

public class InterfaceVariables_01 {

}








