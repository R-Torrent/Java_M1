/** Back-end Java
*** M1 - Milestone 1 - Fase 3
*** Roger Torrent */

import java.util.Scanner;

public class M1_Milestone1Fase3 {
	static boolean traspas(short any) {
			return (any % 4 == 0 && any % 100 != 0) || any % 400 == 0;
		};
		
	public static void main(String args[]) {
		final short referencia = 1948;
		String m1 = "Any de traspàs", m2 = "Any regular";

		System.out.println("Data de naixament:");
		Scanner sc = new Scanner(System.in);
		short data = sc.nextShort();
		
		for (short any = referencia; any <= data; any++) {
			Boolean prova = traspas(any);
			System.out.println(any + ": " + (prova ? m1 : m2));
		}
		sc.close();
	}
}