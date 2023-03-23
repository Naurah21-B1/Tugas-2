/* NIM		  : 13020210043
   Nama	 	  : Naurah Athayah AR
   Hari/Tanggal	  : Kamis/23 Maret 2023
   Waktu Pengerjaan : 21.15 */

import java.util.Scanner;


public class If1 {

/**
* @param args
*/
public static void main(String[] args) {
	// TODO Auto-generated method stub
	/* Kamus */
	Scanner masukan=new Scanner(System.in);
	int a;
	/* Program */

	System.out.print ("Contoh IF satu kasus \n"); 
	System.out.print ("Ketikkan suatu nilai integer : "); 
	a = masukan.nextInt();
	if (a >= 0)
	System.out.print ("\nNilai a positif "+ a);

}
}
