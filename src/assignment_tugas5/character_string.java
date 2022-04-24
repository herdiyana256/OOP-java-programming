/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_tugas5;
import java.util.Random;
/**
 *
 * @author User
 */

// character in position specified in the string
// Example 5.11 - 5.12
public class character_string {
   public static void main (String[] args) {
       String A = "Laboratorium Komputasi dan Sistem Cerdas";
       Random rand = new Random();
       for (int i=1; i<=10; i++)
       {
           int ke = rand.nextInt(A.length());
           System.out.println("Karakter ke-"+ke+" = "+A.charAt(ke));
       }
   }
    
    
}
/* 
Output : 
Karakter ke-39 = s
Karakter ke-21 = i
Karakter ke-36 = r
Karakter ke-12 =  
Karakter ke-25 = n
Karakter ke-4 = r
Karakter ke-23 = d
Karakter ke-16 = p
Karakter ke-18 = t
Karakter ke-17 = u

*/