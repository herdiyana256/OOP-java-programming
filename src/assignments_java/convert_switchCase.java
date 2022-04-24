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
public class convert_switchCase {
    public static void main (String [] args) {
        
System.out.print("Silahkan Masukan Nilai Input: ");
int nilaiInput = new Scanner (System.in).nextInt();
String hari = "";
switch(nilaiInput) {
    case 0:
     hari = "Senin ";
     break;
    case 1: 
      hari = "Selasa ";
      break;
    case 2: 
      hari = "Rabu ";
      break;
    case 3:
        hari = "Kamis ";
       break;
    case 4:
        hari = "Jumat ";
        break;
    case 5:
        hari = "Sabtu ";
        break;
    case 6:
        hari = "Minggu ";
        break;
        
        default:
        hari = "Nilai atau format yang Anda Masukan Salah!"
        break;
}
    System.out.print(hari);
    }
    
}

/*
Penjelasan : 
Pada perintah di atas apabila kita jalankan program dan kita inputkan nilai 3 pada variable nilaiInput-nya maka secara otomatis program akan mencocokan nilai pada variable nilaiInput. Jika ada case yang bersesuaian dengan nilai variableInput maka case itu dijalankan. Bila tidak program akan menjalankan bagian default dan mengabaikan case lainnya.
*/