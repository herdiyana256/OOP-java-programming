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


// Getting character position on string
// Example 5.13 - 5.14
public class position_char_str {
    public static void main(String [] args) {
        String A = "Labolatorium Komputasi dan Sistem Cerdas";
        
        System.out.println("Karakter s terletak pada posisi ke: "+A.indexOf('s'));
        System.out.println("Karakter a terletak pada posisi ke: "+A.indexOf('a'));
        System.out.println("Karakter v terletak pada posisi ke: "+A.indexOf('v'));
        System.out.println("Setelah posisi ke-10, karakter s terletak pada " + "posisi ke: "+A.indexOf('s',10));
        System.out.println("Setelah posisi ke-10, karakter a terletak pada " + "posisi ke: "+A.indexOf('a',10));
    }
}
/*
Output : 
Karakter s terletak pada posisi ke: 20
Karakter a terletak pada posisi ke: 1
Karakter v terletak pada posisi ke: -1
Setelah posisi ke-10, karakter s terletak pada posisi ke: 20
Setelah posisi ke-10, karakter a terletak pada posisi ke: 19
*/
