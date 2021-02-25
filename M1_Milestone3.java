/** Back-end Java
*** M1 - Milestone 3
*** Roger Torrent */

public class M1_Milestone3 {
	public static void main(String args[]) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int l = array.length;		
		String s1="", s2="";
		
		for(int i = 0; i < l; i++) s1 = s1 + " " + Integer.toString(array[i]);
		System.out.println(s1);
		
		for(int i = 0; i < l/2; i++) {
			int aux = array[i];
			array[i] = array[l-1-i];
			array[l-1-i] = aux;
		}
		
		for(int i = 0; i < l; i++) s2 = s2 + " " + Integer.toString(array[i]);
		System.out.println(s2);
	}
}