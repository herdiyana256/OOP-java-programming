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
// Example  Similarities between two Strings
// Example 5.7 - 5.8 

public class similarity_two_string {
   public static void main(String [] agrs) {
       String A = "Laboratorium Komputasi Sistem Cerdas";
       String B = "Laboratorium KOMPUTASI DAN SISTEM CERDAS";
       String C, D, E;
       C = "Laboratorium Komputasi Sistem Cerdas";
       D = "Laboratorium KOMPUTASI SISTEM CERDAS";
       E = "Laboratorium Komputasi dan Sistem Cerdas";
       
      boolean test1, test2, test3;
      // Uji Kesamaan antar String 
      test1 = A.equals(B);
      test2 = (A==C);
      test3 = A.equals(E);
      
      System.out.println("["+A+"]==["+B+"] --> "+test1);
      System.out.println("["+A+"]==["+C+"] --> "+test2);
      System.out.println("["+A+"]==["+E+"] --> "+test3);
      System.out.println("["+B+"]==["+D+"] --> "+B.equals(D));
      System.out.println("["+C+"]==["+E+"] --> "+(C==E));
      
   } 
}

/*
Output : 
[Laboratorium Komputasi Sistem Cerdas]==[Laboratorium KOMPUTASI DAN SISTEM CERDAS] --> false
[Laboratorium Komputasi Sistem Cerdas]==[Laboratorium Komputasi Sistem Cerdas] --> true
[Laboratorium Komputasi Sistem Cerdas]==[Laboratorium Komputasi dan Sistem Cerdas] --> false
[Laboratorium KOMPUTASI DAN SISTEM CERDAS]==[Laboratorium KOMPUTASI SISTEM CERDAS] --> false
[Laboratorium Komputasi Sistem Cerdas]==[Laboratorium Komputasi dan Sistem Cerdas] --> false

*/