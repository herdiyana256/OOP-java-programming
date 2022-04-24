/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment_tugas4;
import javax.swing.*;
/**
 *
 * @author User
 */
// Assignment loop : practice chapter 4
public class practice_tugas4 {
    public static void main(String [] args) {
        int i=0, jumGenap=0, jumGanjil=0;
        boolean ulang = true;
       do {
           String data_n=JOptionPane.showInputDialog("Masukan Bilangan");
           int N = Integer.parseInt(data_n);
           if(N>0)
           {
               if(N%2==0) {
                    jumGenap=jumGenap+1;
             
               }
               else
               {
                   jumGanjil=jumGanjil+1;
               }
               i=i+1;
               System.out.println("Banyaknya bilangan genap sampai iterasi ke "+i+" = "+jumGenap);
               System.out.println("Banyaknya bilangan genap sampai iterasi ke "+i+" = "+jumGanjil);
           }
           else
           {
               ulang=false;
           }
           
       }while(ulang);
        System.out.println("Perulangan Selesai");
       
    }
    
}
