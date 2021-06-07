package files;

public class Array {

	public static void main(String[] args) {
		
		int x[] = {10, 8, 12, 16};
		
		System.out.println(x[1]);
		
		x[2] = 21;
		
		String[] frutas = { "Laranja", "Banana", "Maçã", "Uva", "Caqui" };
		
		System.out.println(frutas[2]);
		System.out.println(frutas.length);
		
		System.out.println("---------------------");
		
		for(int i = 0; i < frutas.length; i++) {
			System.out.println(frutas[i]);
		}
		
	}

}
