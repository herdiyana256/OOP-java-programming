/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment_tugas4;
import java.util.Scanner;

/**
 *
 * @author User
 */

// Assignment loop : practice chapter 4
/*
Buatlah sebuah program untuk menampilkan sederatan angka genap dan 
ganjil beserta jumlahnya , sbb : 
Contoh : 
1 3 5 7 9 = 25 / Ganjil 
2 4 6 8 10 = 30 / Genap
*/
//=============================================================================
// Deret angka Genap 
public class series_numb_while2 {
   public static void main(String [] args) {
    Scanner bilangan = new Scanner(System.in);
    int genap,awal,akhir,jumlah=0;
    System.out.print("Masukan Nilai Awal : ");awal = bilangan.nextInt();
    System.out.print("Masukan Nilai Akhir : ");akhir = bilangan.nextInt();
    System.out.print("Deret Bilangan Genap adalah = ");
    genap = awal;

    while(genap <= akhir) {
        if (genap % 2 ==0)
        {
            jumlah=jumlah+genap;
            System.out.print(genap + " ");
         
        }
        genap++;
        
    }
      
        System.out.println();
        System.out.println("Jumlah Deret Bilangan Genap Adalah = "+ jumlah + "");
   
}
    
}