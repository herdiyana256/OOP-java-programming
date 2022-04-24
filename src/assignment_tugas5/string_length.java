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

// Example  Application variable sale with type Array & using element type Integer
// Example 5.5 - 5.6 
public class string_length {
    public static void main(String [] args) {
        String A = "Pemograman Berorientasi Objek";
        String B = "Jurusan Teknik Informasika";
        String C, D, E;
        C = "Universitas Sainstec Muhammadiyah";
        D = "Universitas Indonesia";
        E = "UNJ";
        
        int nA  = A.length();
        int nB = B.length();
        int nC = C.length();
        
        System.out.println(A+"--> Panjang String = "+nA);
        System.out.println(B+"--> Panjang String = "+nB);
        System.out.println(C+"--> Panjang String = "+C.length());
        System.out.println(D+"--> Panjang String = "+D.length());
        System.out.println(E+"--> Panjang String = "+E.length());
    } 
    
}
/*   
Output : 
Pemograman Berorientasi Objek--> Panjang String = 29
Jurusan Teknik Informasika--> Panjang String = 26
Universitas Sainstec Muhammadiyah--> Panjang String = 33
Universitas Indonesia--> Panjang String = 21
UNJ--> Panjang String = 3


*/