/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// A.Converting uppercase (capital) to lowercase
// B.Convert lowercase to uppercase (capital)
// Example 5.14 - 5.15
package assignment_tugas5;

/**
 *
 * @author User
 */
public class letter_convert {
    public static void main(String[] args) {
        String A = "Labolatorium Komputasi dan Sistem Cerdas";
        String Besar = A.toUpperCase(); 
        String Kecil = A.toLowerCase();
        
        System.out.println("Kalimat Awal: "+A);
        System.out.println("Diubah ke huruf besar: "+Besar);
        System.out.println("Diubah ke huruf kecil: "+Kecil);
        
    }
    
}
/* 
Output : 
> Kalimat Awal: Labolatorium Komputasi dan Sistem Cerdas
Diubah ke huruf besar: LABOLATORIUM KOMPUTASI DAN SISTEM CERDAS
Diubah ke huruf kecil: labolatorium komputasi dan sistem cerdas

*/