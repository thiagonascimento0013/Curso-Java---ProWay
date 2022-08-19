
public class RelacionaisLogicos {

	public static void main(String[] args) {
		// Operadores Relacionais
		// > < <= >= != ==
		
		int num1, num2;
		
		// Testando uma igualdade
		num1 = 10;
		num2 = 10;
		
		if (num1 == num2) {
			System.out.println("N�mero 1 e numero 2 s�o iguais");
		}

		
		// Testando uma Desigualdade
		num1 = 10;
		num2 = 30;
		if (num1 != num2) {
			System.out.println("N�mero 1 e numero 2 s�o diferentes");
		}
		
		// Testando maior
		num1 = 10;
		num2 = 30;
		if (num1 > num2) {
			System.out.println("N�mero 1 maior que n�mero 2");
		} else {
			System.out.println("N�mero 2 maior que n�mero 1");
		}
		
		//Operadores L�gicos
		//&& = e / AND || = ou / OR
		num1 = 10;
		num2 = 5;
		int num3 = 20, num4 = 5;
		if ((num1 > num3) && (num2 == num4)) {
			System.out.println("Primeira op��o satisfeita");
		} else {
			System.out.println("Segunda op��o satisfeita");
		}
		
		if ((num1 > num3) || (num2 == num4)) {
			System.out.println("Primeira op��o satisfeita");
		} else {
			System.out.println("Segunda op��o satisfeita");
		}
	}

}
