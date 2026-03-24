package com.arunit.interfaces;

/*
 -every method present inside interface is always public and abstract whether we are declaring or not 
 interface interf{
	void m1();
}

-the reason for that every method is public is to make this method available to evy implementation class and abstract is implementation class is responsible to provide implementation
              hence inside interface the following method declarations are equal inside interface
              void m1();
              public void m1();
              abstract void m1();
              public abstract void m1();
      
-as every method is always public and abstract we cant declae interface method with the following modifiers :
 private,protected,static,native,synchronised,final,strictfp 
 ====================================================================================
 1)which of the method declarations are allowed inside interface?
     a)public void m1();
     b)private void m1();
     c)protected void m1();
     d)static void m1();
     e)public abstract native  void m1();
      f)abstract public void m1();      

 * 
 * */


public class InterfaceMethods_01 {

}
