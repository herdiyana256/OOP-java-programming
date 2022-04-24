/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments_java;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */


/* 
Tugas 3
a. Buatlah sebuah program konversi nilai angka ke nilai huruf dengan range 
berikut : 
Nilai >=85 and nilai <=100 = A
Nilia >=70 and nilai <=84 = B
Nilai >=60 and nilai <70 = C
Nilai >=50 and nilai<60 = D
Nilai<50 = E
*/
public class Assignments_Java {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args){
     String nilai = JOptionPane.showInputDialog(null,"Masukan Nilai UAS anda", "Angka 0-100", JOptionPane.QUESTION_MESSAGE);
     
     int angka = Integer.parseInt(nilai);
     String message;
     
    if (angka > 100) {
       message = "Angka tidak boleh lebih dari 100";
    }else if  (angka >= 85) {
        message = "Nilai Anda adalah A";
    }else if (angka >= 70) {
        message = "Nilai Anda adalah B";
    }else if (angka >= 60) {
        message = "Nilai Anda adalah C";
    }else if (angka >= 50) {
        message = "Nilai Anda adalah D";
    }else if (angka <50 ){
        message = "Nilai Anda adalah E";
     
    } else {
        message = "Anda Tidak Lulus, Silahkan Mengulang di Semester Berikutnya";
    }
     JOptionPane.showConfirmDialog(null,message,"Hasil Konversi Nilai Angka  ke Nilai Huruf!",JOptionPane.INFORMATION_MESSAGE);
     
 }
 }