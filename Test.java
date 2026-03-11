package com.tka.march9;

public class Test {
     public static void main(String args[]) {
    	  Operations obj = new Operations();
       
		      System.out.println("----------------------Arithmetic Operator----------------------");
    		  obj.m1(10,20);
       
    		  System.out.println("----------------------Relational Operator----------------------");
    	    obj.m2(33,55);
       
    		  System.out.println("----------------------Logical Operator-------------------------");
    	    obj.m3(true,false);
       
    	    System.out.println("----------------------Assignment Operator----------------------");
    	    obj.m4(5,20);
       
    	    System.out.println("--–--------------------Unary Operator---------------------------");
    	    obj.m5(3);
       
    	    System.out.println("----------------------Bitwise Operator--------------------------");
    	    obj.m6(4,8);
     }
}
