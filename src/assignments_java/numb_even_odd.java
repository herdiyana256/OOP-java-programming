/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments_java;
import java.util.Scanner;
/**
 *
 * @author User
 */

  //Tugas 3 : C. Buatlah sebuah program untuk mengecek apakah bilangan yang  dimasukkan adalah bilangan genap atau ganjil
public class numb_even_odd {
    public static void main(String [] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukan Sebuah Bilangan : ");
        int bilangan  = scan.nextInt();
        
        if (bilangan % 2 == 0) {
            System.out.print(bilangan+ " adalah Bilangan Ganjil ");

    } else {
        System.out.print(bilangan+" adalah Bilangan Genap ");
 }
}
    
}
/*Penjelasan : 
Baris 7 : meng-import library java.util.Scanner untuk fungsi input.
Baris 14 : membuat class dengan nama numb_even_odd
Baris 18 : mendeklarasikan variable a bertipe integer untuk menyimpan nilai bilangan.
Baris 16 : mendeklarasikan variable scan untuk menginput nilai.
Baris 17-18 : melakukan input nilai bilangan ke dalam variable a.
Baris 20 : cek kondisi jika nilai variable bilangan mod 2 adalah 0 atau nilai a dapat habis dibagi 2.
Baris 24 : memberikan informasi kalau nilai variable bilangan tersebut adalah  bilangan genap.
Baris 23 : kondisi jika nilai variable bilangan  mod 2 tidak 0 atau nilai bilangan tidak dapat habis dibagi 2.
Baris 21 : memberikan informasi kalau nilai variable bilangan  tersebut adalah bilangan ganjil.

*/


