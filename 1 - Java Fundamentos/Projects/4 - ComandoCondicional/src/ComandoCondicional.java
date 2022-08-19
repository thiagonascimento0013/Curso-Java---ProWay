
public class ComandoCondicional {

	public static void main(String[] args) {
		// IF
		
		int num1 = 10, num2 = 30;
		if (num1 < num2) {
			System.out.println("If normal - N�mero 1 � menor que n�mero 2");
		} 
		System.out.println("--------------------");
		
		if (num1 > num2) {
			System.out.println("If com else - N�mero 1 � maior que n�mero 2");
		} else {
			System.out.println("If com else - N�mero 1 � menor que n�mero 2");
		}
		
		
		// Situa��o composta - num1 < num2
		if (num1 > num2) {
			System.out.println("Condi��o composta 1 - N�mero 1 � maior que n�mero 2");
		} else if (num1 < num2) {
			System.out.println("Condi��o composta 1 - N�mero 1 � menor que n�mero 2");
		} else {
			System.out.println("Condi��o composta 1 - N�mero 1 � igual ao n�mero 2");
		}
		
		// Situa��o composta - num1 == num2
		num1 = 10;
		num2 = 10;
		if (num1 > num2) {
			System.out.println("Condi��o composta 2 - N�mero 1 � maior que n�mero 2");
		} else if (num1 < num2) {
			System.out.println("Condi��o composta 2 - N�mero 1 � menor que n�mero 2");
		} else {
			System.out.println("Condi��o composta 2 - N�mero 1 � igual ao n�mero 2");
		}
		
		// Comando condicional SWITCH
		char opcao = '5';
		switch (opcao) {
		case '1': {
			System.out.println("Incluir");
			break;
		}
		case '2': {
			System.out.println("Editar");
			break;
		}
		case '3': {
			System.out.println("Apagar");
			break;
		}
		case '4': {
			System.out.println("Consultar");
			break;
		}
		default:
			System.out.println("Op��o Inv�lida: " + opcao + "Redigite");
		}
	}

}
