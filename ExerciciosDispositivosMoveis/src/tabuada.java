import java.util.*;

public class tabuada {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		while(true) {
		System.out.print("1- Tabuada inteira\n2- Escolher tabuada\n3- Sair: ");
		
		 Integer escolha = input.nextInt();
		 
		if(escolha == 1) {
			tabuadaDo1ao10();
		}
		else if(escolha == 2) {
			tabuadaDeUmNumero();
		} else if(escolha == 3) {
			sair();
		}else {
			System.out.print("Valor inválido. Tenta novamente\n");
		}
		}
	}
	private static void tabuadaDo1ao10() {
		for (int numero = 1; numero <=10; numero++) {
			
			for (int num2 = 1; num2 <=10; num2++) {
				
				System.out.printf(numero + "x" + num2 + " ="+ numero * num2+  "\n");
			}
		}
	}
	
	private static void tabuadaDeUmNumero() {
		Scanner input = new Scanner(System.in);
		Integer numero;
		System.out.print("Insere um número: ");
		numero = input.nextInt();
		for (int num2 = 1; num2 <= 10; num2++) {
			System.out.print(+ numero + "x" + num2 + " ="+ numero * num2 + "\n");
		}
	}
	
	private static void sair() {
		System.out.print("valeu falou!");
		System.exit(0);
	}

}
