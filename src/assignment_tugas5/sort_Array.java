/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_tugas5;
// Impor class Java 
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.util.Arrays;
/**
 *
 * @author User
 */


// Pertemuan 5 
// Buatlah program searching dan sorting pada sebuah elemen Array 

// Sorting Array 
/*
Penjelasan : Mengurutkan element dengan metode sort dari kelas Array    
*/
public class sort_Array {
    //Metode Main 
    public static void main(String [] args){
        int [] valueInteger = {3,2,6,47,9,1,5,10};
        char [] valuechar = {'S', 'T', 'M', 'I', 'K',  'M', 'J'};
        
        String show;
        JTextArea areashow;
        
        
        // Menampilkan element array - Integer 
        show = "Menampilkan element array - Integer :\n";
        for (int x = 0; x < valueInteger.length; x++)
            show += valueInteger[x] + "    ";
       
        Arrays.sort(valueInteger);
        
        // Menampilkan element Array - Integer after sorting
        show += "\n Showing element array integer after Sorting: \n";
        for (int x = 0; x < valueInteger.length; x++)
            show += valueInteger[x] + "    ";
        
        // Menampilkan element Array - Character
        show += "\n Showing element array Character  : \n";
        for (int x = 0; x < valuechar.length; x++)
            show += valuechar[x] + "    ";
        
        
        Arrays.sort(valuechar);
        
        // Showing element array character after Sorting
        show += "\n Menampilkan element Array Character After Sorting : \n";
        for(int x = 0; x < valuechar.length; x++)
            show += valuechar[x] + "  ";
        
        areashow = new JTextArea();
        areashow.setText(show);
        JOptionPane.showMessageDialog(null, areashow, "Sorting Element Array",  JOptionPane.INFORMATION_MESSAGE);
    
        // End Process App
        System.exit(0);
    }
    
}

/*
Output : 
Menampilkan element array - Integer :
3    2    6    47    9    1    5    10    
 Showing element array integer after Sorting: 
1    2    3    5    6    9    10    47    
 Showing element array Character  : 
S    T    M    I    K    M    J    
 Menampilkan element Array Character After Sorting : 
I  J  K  M  M  S  T 
*/

/*
Penjelasan : 
Baris No 27 dan 28 adalah sebuah deklarasi, membuat dan menginisiaslisasi element araay nilai integer dan array nilai karakter .
Baris 36  adalah perulangan for untuk menampilkan nilai element array nilai integer. disetiap iterasi perulangan or, pernyataan 
baris nomor 37  di eksekusi yaitu menyimpan element aray , arrayInteger ke variabel tampilan(show).

Baris Nomor 39 adalah pernyataan untuk mengurutkan nilai element array nilaiInteger menggunakan metode sort dari class arrays.
Metode sort ini memerlukan argument array yang element nya akan di urutkan. setelah di urutkan, value element kemudian ditampilkan ( baris nomor 
56 - 57 ) .
*/
