/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_tugas5;

/**
 *
 * @author User
 */

//Perform string modification
// Example 5.23 - 5.24
public class char_array_str {
   public static void main (String [] args) {
       String A = "LAB KSC";
       char[] karakter0 = A.toCharArray();
       char[] karakter1 = new char[7];
       A.getChars(2,6,karakter1,1);
      
       System.out.println("Kalimat Asli: "+A);
       
       // Penulisan per karakter 
       System.out.println("Per Karakter");
       for (int  i=0; i<A.length(); i++)
       {
            System.out.println("karakter ke-"+(i+1)+": "+karakter0[i]);
       }
       
       //Penulisan per karakter dari karakter ke -2 sampai  6 
       System.out.println("Karakter ke-2 sampai ke-6:");
       for (int i=1; i<karakter1.length; i++)
       {
           System.out.println("karakter ke-"+i+": "+karakter1[i]);
       }
   } 
    
}

/* 
Output : 
Kalimat Asli: LAB KSC
Per Karakter
karakter ke-1: L
karakter ke-2: A
karakter ke-3: B
karakter ke-4:  
karakter ke-5: K
karakter ke-6: S
karakter ke-7: C
Karakter ke-2 sampai ke-6:
karakter ke-1: B
karakter ke-2:  
karakter ke-3: K
karakter ke-4: S
karakter ke-5:  
karakter ke-6:  


*/