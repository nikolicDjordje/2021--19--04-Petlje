/*While2: Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!”
 *  onoliko puta koliko je korisnik zadao preko konzole.
Primer: ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta */

package domaci;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		
		System.out.println("Unesite broj");
		Scanner sc = new Scanner (System.in);
		int broj;
		broj = sc.nextInt();
		int pozdravLakuNoc = 1;
		
		while (pozdravLakuNoc > 0 && pozdravLakuNoc <= broj) {
			System.out.println("Laku noc!");
			pozdravLakuNoc = pozdravLakuNoc + 1;
	
		}
	
	}

}
