import java.util.*;

public class numeroQuadrado {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Digite um n�mero para receber o n�mero ao quadrado: ");
		Integer numero = input.nextInt();
		
		System.out.printf(numero + "� = %.0f", Math.pow(numero, 2));
		
	}

}
