/*While1:Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj,
 *  i ispisuje njihov zbir (zbir pozitivnih brojeva).
primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11*/
package domaci;

import java.util.Scanner;

public class Petlja2Domaci {

	public static void main(String[] args) {
		int broj = 1;
		Scanner sc = new Scanner(System.in);
	
		int zbir = 0;
	
		while (broj >= 0) {
			System.out.println("Unesite novi broj");
			broj = sc.nextInt();
			zbir = zbir + broj;		
		}
		if (broj < 0)  {
			 System.out.println(zbir - broj);
		}
			}
}
