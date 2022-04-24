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

//Create a new string
// Example 5.19 - 5.20
public class new_String {
    public static void main(String [] args) {
        String A = "Labolatorium Komputasi dan Sistem Cerdas";
        
        String penggal1 = A.substring(10);
        String penggal2 = A.substring(20);
        String penggal3 = A.substring(10,30);
        String penggal4 = A.substring(20,25);
        
        System.out.println("Kalimat asli: "+A);
        System.out.println("Pemenggalan mulai karakter ke-10: "+penggal1);
        System.out.println("Pemenggalan mulai karakter ke-20: "+penggal2);
        System.out.println("Pemenggalan mulai karakter ke-10 sampai ke-30: "+penggal3);
         System.out.println("Pemenggalan mulai karakter ke-20 sampai ke-35: "+penggal4);
    }
    
}
/* 
Output : 
Kalimat asli: Labolatorium Komputasi dan Sistem Cerdas
Pemenggalan mulai karakter ke-10: um Komputasi dan Sistem Cerdas
Pemenggalan mulai karakter ke-20: si dan Sistem Cerdas
Pemenggalan mulai karakter ke-10 sampai ke-30: um Komputasi dan Sis
Pemenggalan mulai karakter ke-20 sampai ke-35: si da

*/