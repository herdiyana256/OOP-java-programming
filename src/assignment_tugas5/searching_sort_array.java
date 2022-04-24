/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_tugas5;
import java.io.*;
/**
 *
 * @author User
 */

// Pertemuan 5 
// Buatlah program searching dan sorting pada sebuah elemen Array 

// Searching Array 
public class searching_sort_array {
    public static void main(String [] args) throws Exception
    {
        BufferedReader df = new BufferedReader(new InputStreamReader(System.in));
        int dataArray [] = {5, 7, 29, 40, 87, 80, 77, 8};
        int x, nilaiX = 0;
        boolean get;
        
        //Menampilkan nilai data array 
        System.out.println("\nData Array :");
        for(x=0; x<=dataArray.length-1; x++)
        
        {
            System.out.print(dataArray[x] + " ");
        }
            System.out.println("\n");
            
            
            // Masukan data yang ingin dicari 
            System.out.print("Masukan angka yang ingin anda cari : ");
            String Input = df.readLine();
            
            get = false;
            for (x=0; x<=dataArray.length-1; x++)
            {
                if (dataArray[x] ==  nilaiX);
                {
                    get = true;
                    break;
                }
            }
                if (get == true)
                {
                    System.out.println("Angka "+nilaiX+" ditemukan pada Index Array ke-"+ (x+1) + "!!\n");
                }
                else
                {
                    System.out.println("Maaf Angka yang anda masukan tidak ditemukan !!\n");
                }
          }
    
}
