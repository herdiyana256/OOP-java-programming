/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casshier_App;
import java.util.ArrayList; // ArrayList untuk menambahkan data baru secara dinamis tanpa harus menentukan ukuran diawal.
import java.util.Scanner; // berfungsi untuk menginputkan data/ nilai setelah program dijalankan (RUN).

/**
 *
 * @author User
 */
public class cashier_apps {
    public static void main(String [] args){
        
        String user;
       int counter;
       int i = 0;
       int total = 0;
       int uang;
       int sisaUang;
       
       // Scanner Input User
       Scanner inputUser = new Scanner (System.in);
       
       // Menggunakan ArrayList pada Java
       // Iteam List 
       ArrayList<String> itemList = new ArrayList() ;
      
       // Harga List 
       ArrayList<Integer>harga = new ArrayList();
        System.out.println("=============================================================");
       System.out.println("Cashier Application - Griya Utama Mandiri \n");
       
       
       // Price List 
       System.out.println("=============================================================");
       System.out.println("HARGA DALAM RUPIAH (Rp)");
       System.out.println("=============================================================");
       System.out.println("Minyak\t: Rp 45000");
       System.out.println("Terigu\t : Rp 13000");
       System.out.println("Telur\t:    Rp 27000");
       System.out.println("Roti\t:      Rp 12000");
       System.out.println("=============================================================");
       
       
       // Pengguna Counter 
       System.out.println("=============================================================");
       System.out.println("Cashier");
       System.out.println("=============================================================");
       
       System.out.print("Berapa banyak Uang uang yang Anda Miliki?\t: Rp");
       uang = inputUser.nextInt();
       System.out.print("Berapa Banyak Barang  yang Anda Akan Beli?\t: ");
         counter = inputUser.nextInt();
//       System.out.print("Terima kasih sudah berkunjung dan berbelanja!");
     
       
       while (i < counter) {
           System.out.print("Input Item\t: ");
           user = inputUser.next();
           itemList.add(user);
           
           // Menambahkan List Harga Sesuai dengan Item
           // Tulisan diawali dengan Huruf Kapital 
           if(itemList.get(i).equals("Minyak")) {
               harga.add(45000);
               
           } else if (itemList.get(i).equals("Terigu")) {
               harga.add(13000);
               
           } else if (itemList.get(i).equals("Telur")) {
               harga.add(27000);
           } else if (itemList.get(i).equals("Roti")) {
               harga.add(12000);
           }
           // Variabel Total Belanja
           total = total + harga.get(i);
           
           i++;
           
       }
       System.out.println();
       System.out.println();
       
       System.out.println("=============================================================");
       System.out.println("CALCULATOR - NOTA TRANSAKSI");
       System.out.println("=============================================================");
       
       // Menampilkan Kalkulator Harga
       for (int j = 0; j < counter; j++) {
           System.out.print(itemList.get(j));
       }
        System.out.println("\t\t_________________+");
        System.out.println("total: \t\tRp" + total);
        
        // Program uang kembalian
        System.out.println();
        System.out.println();
        System.out.println("=============================================================");
        System.out.println("Sub Total");
        System.out.println("=============================================================");
        System.out.print("Yang dibayar: ");
        System.out.println("\t\tRp" + uang);
        System.out.print("Total: ");
        System.out.println("\t\tRp" + total);
        System.out.println("\t\t_________________-");
        sisaUang = uang - total;
        System.out.print("total");
        System.out.println("\t\tRp" + sisaUang);
        
        
        //. Struk 
        System.out.println();
        System.out.println();
        System.out.print("==============================================================");
        System.out.println("INVOICE");
        System.out.println("=============================================================");
        
        System.out.println("Items yang dibeli: " + itemList);
        System.out.println("Detail harga \t: " + harga);
        System.out.println("Total Harga\t: " +"Rp"+ total);
        System.out.println("Sisa Uang\t: " +"Rp"+sisaUang);
        System.out.println("Terima kasih sudah berkunjung & Berbelanja!");
        
        
    }
    
}
