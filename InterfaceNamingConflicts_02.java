package com.arunit.interfaces;

/*
 Interface variable naming conflicts:
 ------------------------------------
 -2 interfaces can contain a variable with same name and there may be a chance of variable naming conflicts.but we can solve this problem by using interface names
 * */
interface left{
	int x=10;
}

interface right{
	int x=20;
}

public class InterfaceNamingConflicts_02 implements left,right{
public static void main(String[] args) {
	//System.out.println(x);//CE:The field x is ambiguous
	System.out.println(left.x);//10
	System.out.println(right.x);//20
}
}
