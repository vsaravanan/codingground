 import java.util.*;
 import java.lang.*;
 import java.io.*;



 /* Name of the class has to be "Main" only if the class is public. */


 

 

 class Derived2 extends Derived1 

 { 

     int x = 25;

 

     public void printX() { 
    
     System.out.println(this.x); 
    
     System.out.println(super.x); 
    
     }

 

     public static void main(String[] args) 
    
     { 
    
         Derived2 d2 = new Derived2(); 
        
         d2.printX(); 
    
     } 

 }


