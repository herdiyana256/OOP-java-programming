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

// Example  Similarities between two Strings
// Example 5.9 - 5.10 
public class compare_string {
   public static void main(String [] args) {
       String[] nama = {"Megawati Sukarno Putri", "Susilo Bambang Yudhoyono", "Jusuf Kalla", "Prabowo Subiyanto", "Jokowi"
   };
       String sementara;
       int N = nama.length;
       
       // Menampilkan nama awal sebelum diurutkan 
       System.out.println("Daftar nama sebelum diurutkan");
       for (int i=0; i<N; i++)
       {
           System.out.println((i+1) +". "+nama[i]);
       }
       
       //Pengurutan Nama
       for (int i=0; i<N-2; i++)
       {
           for(int j=i+1; j<=N-1; j++)
           if (nama[i].compareTo (nama[j]) > 0)
           {
               sementara = nama[i];
               nama[i] = nama[j];
               nama[j] = sementara;
           }
       }

    //Menampilkan setelah diurutkan
   System.out.println("Daftar nama setelah diurutkan");
   for (int i=0; i<N; i++)
   {
       System.out.println( (i+1)+".  "+nama[i] );
      }
   }
   
}
