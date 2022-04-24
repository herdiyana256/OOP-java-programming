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
a. Buatlah sebuah program untuk menampilkan output berikut:
30 29 28 27 26.......16 1 2 3 4 5 6 7 8 9.....15
*/
public class series_basic_while {
    public static void main(String []args) {
        int matraman = 30;
        int ciracas = 1;
        
        while (matraman > 15) {
            System.out.println("this is a series of numbers backwards from : "  + matraman);
            matraman--;
        }
        while(ciracas < 16) {
            System.out.println("this is a series of advanced numbers from : "  + ciracas);
            ciracas++;
        }
        
    }
    
}
