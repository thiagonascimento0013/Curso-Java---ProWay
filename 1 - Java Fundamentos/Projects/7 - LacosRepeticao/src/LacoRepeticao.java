
public class LacoRepeticao {

	public static void main(String[] args) {
		// Comando WHILE - La�o Pr�-Testado
		System.out.println("Comando While");
		int qtdVezes = 1;
		while(qtdVezes <= 10) {
			System.out.println("Estou fazendo a " + qtdVezes + "� vez");
			qtdVezes++;
		}
		System.out.println("Sai do la�o e executei " + (qtdVezes-1) + " vezes");
		
		
		// Comando Do While - La�o P�s-Testado
		System.out.println("Comando Do.......While");
		qtdVezes = 1;
		do {
			System.out.println("Estou fazendo a " + qtdVezes + "� vez");
			qtdVezes++;
		} while(qtdVezes <= 10);
		System.out.println("Sai do la�o e executei " + (qtdVezes-1) + " vezes");
		
		
		// Comando FOR
		System.out.println("Comando FOR");
		qtdVezes = 0;
		for(int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
			System.out.println("Estou fazendo a " + qtdVezes1 + "� vez");
			qtdVezes = qtdVezes1;
		}
		System.out.println("Sai do la�o e executei " + (qtdVezes) + " vezes");
		
		for (int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
			System.out.println("Estou fazendo a " + qtdVezes1 + "� vez");
			if (qtdVezes1 == 5) {
				System.out.println("Parei na " + qtdVezes1 + "� vez");
				break;
			}
		}
	}

}
