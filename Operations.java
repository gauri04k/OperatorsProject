package com.tka.march9;

public class Operations {
  void m1(int n1, int n2) {
    	
    	int result = n1 + n2;
    	System.out.println("Addition of Two   nos: "+result);	
    	
    	int result1 = n1 -n2;
    	System.out.println("Subtraction of Two nos: "+result1);	
    	
    	int result2  = n1 * n2;
    	System.out.println("Multiplication of Two nos: "+result2);	
    	
    	int result3 = n1 / n2;
    	System.out.println("Division of Two nos: "+result3);	
    }
    
 void m2(int n1, int n2) {
    	
	    boolean result = n1 > n2;
		System.out.println("n1 is greater than n2 :"+result);	
    	
		boolean result1 = n1 < n2;
    	System.out.println("n1 is less than n2: "+result1);	
    	
    	boolean result2  = n1 <= n2;
    	System.out.println("n1 is less than equals to n2: "+result2);	
      
    	boolean result3 = n1 >= n2;
    	System.out.println("n1 is greater than equals to n2 :"+result3);
      
    	boolean result4 = n1 != n2;
    	System.out.println("n1 is not equal to  n2: "+result4);	
    	
    }
 
 void m3(boolean b1, boolean b2) {
	  
	   boolean res1 = b1 && b2;
	   System.out.println(res1);
	  
	   boolean res2 = b1 || b2;
	   System.out.println(res2);
	  
	   boolean res3 = ! b2;
	   System.out.println(res3);
 }
 
 void m4(int a, int b) {
	    a += a;
	    System.out.println("a = " + a);

	    a -= b;
	    System.out.println("a = " + a);

	    b *= a;
	    System.out.println("b = " + b);

	    a /= a;
	    System.out.println("a = " + a);
	 
	    a %=b;

        System.out.println("a = " + a);
 }
 
 void m5(int a) {
	 
	   System.out.println("Initial value: " + a);
     System.out.println("Pre Increment: " + (++a));
     System.out.println("Post Increment: " + (a++));
     System.out.println("After Post Increment: " + a);
     System.out.println("Pre Decrement: " + (--a));
     System.out.println("Post Decrement: " + (a--));
     System.out.println("Final value: " + a);
	 
 } 
 
 void m6(int a, int b) {
	   // Bitwise AND
     System.out.println("a & b = " + (a & b));

     // Bitwise XOR
     System.out.println("a ^ b = " + (a ^ b));

     // Left Shift
     System.out.println("a << 1 = " + (a << 1));

     // Right Shift
     System.out.println("a >> 2 = " + (a >> 2));

     // Bitwise NOT
     System.out.println("~a = " + (~a));

 }
    

    
    
}
