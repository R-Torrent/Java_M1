import java.util.Scanner;

public class Milestone1Fase2 {
	static boolean traspas(short any) {
			return (any % 4 == 0 && any % 100 != 0) || any % 400 == 0;
		};
		
	public static void main(String args[]) {
		final short referencia = 1948;
		short num_traspas = 0;

		System.out.println("Data de naixament:");
		Scanner sc = new Scanner(System.in);
		short data = sc.nextShort();
		
		for (short any = referencia; any <= data ; any++) {
			if(traspas(any)) num_traspas++;
		}
			
		System.out.println("Anys de traspàs entre 1948 i " + data + ": " + num_traspas);
		sc.close();
	}
}