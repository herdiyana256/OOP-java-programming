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

// Example usage array one dimentions - Basic 
// Example 5.1 - 5.2

public class array_string_practice {
    public static void main(String [] args) {
        int penjualan[] = {100, 120, 112, 132, 105, 122, 108, 121, 122, 130, 115, 125};
        
        int N = penjualan.length;
        for (int i=0; i<N; i++)
        {
            System.out.println("Penjualan ke-"+i+" = "+penjualan[i]);
        }
    }
    
}
/* 
Output : 
Penjualan ke-0 = 100
Penjualan ke-1 = 120
Penjualan ke-2 = 112
Penjualan ke-3 = 132
Penjualan ke-4 = 105
Penjualan ke-5 = 122
Penjualan ke-6 = 108
Penjualan ke-7 = 121
Penjualan ke-8 = 122
Penjualan ke-9 = 130
Penjualan ke-10 = 115
Penjualan ke-11 = 125

*/