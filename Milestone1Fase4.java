public class Milestone1Fase4 {
	static boolean traspas(short any) {
			return (any % 4 == 0 && any % 100 != 0) || any % 400 == 0;
		};
		
	public static void main(String args[]) {
		String nom = "Roger", cognom1 = "Torrent", cognom2 = "Ahn";  
		int dia = 29, mes = 7, any = 1976;
		boolean prova = traspas((short)any);
		
		String nom_com = nom + " " + cognom1 + " " + cognom2;
		String data_com = dia + "/" + mes + "/" + any;
		
		System.out.println("El meu nom es " + nom_com);
		System.out.println("Vaig néixer el " + data_com);
		System.out.println("El meu any de naixement " + (prova ? "" : "no ") + "és de traspàs");
	}
}