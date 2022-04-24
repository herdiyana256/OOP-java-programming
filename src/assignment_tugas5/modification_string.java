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
// Example 5.21 - 5.22
public class modification_string {
    public static void main(String [] args) {
    String A = "Labolatorium Komputasi dan Sistem Cerdas";
    String B =  A.replace("a", "A");
    String C = A.replace("i", "u");
    String D = A.trim();
    
    System.out.println("Kalimat asli: "+A);
    System.out.println("Replace a dengan A: "+B);
    System.out.println("Replace i dengan u: "+C);
    System.out.println("Hilangkan spasi awal & akhir: "+D);
    }

}

/* 
Output : 
Kalimat asli: Labolatorium Komputasi dan Sistem Cerdas
Replace a dengan A: LAbolAtorium KomputAsi dAn Sistem CerdAs
Replace i dengan u: Labolatoruum Komputasu dan Sustem Cerdas
Hilangkan spasi awal & akhir: Labolatorium Komputasi dan Sistem Cerdas
*/