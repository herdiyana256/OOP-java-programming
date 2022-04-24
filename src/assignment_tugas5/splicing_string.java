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
//Perform concatenation between two strings
// Example 5.17-5.18
public class splicing_string {
    public static void main(String [] args) {
        String A, B, C;
        A = "Labolatorium";
        B = "Komputasi";
        C = "Sistem Cerdas";
        
        String Lab = A + B + " dan " + C;
        System.out.println(Lab);
    }
}
// Output : LabolatoriumKomputasi dan Sistem Cerdas