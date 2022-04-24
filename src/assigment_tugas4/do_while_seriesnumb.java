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
Buatlah sebuah program untuk menampilkan output berikut dengan 
menggunakan konsep perulangan do-while:
1
2
3
4
5
6
7
8
10 11 12 13 14 15 16 17 18 19 20
*/
//=============================================================================
// Deret Angka dengan Konsep Do-While 

public class do_while_seriesnumb {
    public static void main(String [] args) {
        int i = 1;
        do {
            System.out.print(i*1 + " ");
            i++;
        }
        // selama value i kurang dari 20 maka kode akan menampilkan deret kelipatan 1 - 20 
        while(i <= 20);
    }
    
}
