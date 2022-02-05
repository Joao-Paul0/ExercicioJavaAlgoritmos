import java.util.*;

public class numeroQuadrado {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Digite um número para receber o número ao quadrado: ");
		Integer numero = input.nextInt();
		
		System.out.printf(numero + "² = %.0f", Math.pow(numero, 2));
		
	}

}
