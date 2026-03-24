package com.arunit.interfaces;
//when ever we are implementing an interface for each and every method of that interface we have to provide implementation other wise we have to declare class as abstract then next level child class is responsible to provide implementation 
//every interface method is always public and abstract whether we are declaring or not hence when we are implementing an interface method compulsory we should declare as public otherwise we will get compile time error


interface interf{
void m1();	
void m2();	
}


abstract public class Introduction_03 implements interf{
	//when ever we are implementing interface we should declare those methods as public
	//we need to implement all those methods or else it will throw error
	//if we dont want to implement methods we can declare this class as abstract so next child class can implement and that is acceptible
 public void m1() {
	 
 }
 public static void main(String[] args) {
	System.out.println("hello");
}
}
 class subClass extends Introduction_03{

    //we need to implement the m2() or else it will throw error
	public void m2() {
		
		
	}
	 
 }