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

// Tugas 3 : B.Buatlah sebuah program untuk mengecek apakah bilangan yang diinput  adalah bilangan positif, negatif atau nol
public class numb_pos_neg {
    public static void main(String [] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Masukan Angka atau bilangan = ");
    int angka = input.nextInt();
    
    // Percabangan 
    if (angka < 0)
    {
      System.out.println("" + angka + " adalah Bilangan Negative");
}
    else if (angka >= 0)
    {
    System.out.println("" + angka + " adalah  Bilangan Positive");
} 
else if (angka ==  0)
{
    System.out.println("" + angka + " adalah Bilangan Nol");
}

}
    
}
}
