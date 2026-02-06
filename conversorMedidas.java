package projetosJava;
import java.util.Scanner;

// Conversor básico de medidas, utiliza Scanner, Loop While, Switch Case, Format(), Strings Coloridas.

public class conversorMedidas {

	void main() {
		
		final String Yellow = "\u001B[33m";
		final String Green = "\u001B[32m";
		final String Cyan = "\u001B[36m";
		final String Itálico = "\u001B[3m";
		final String Reset = "\u001B[0m";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Yellow + "Seja bem-vindo(a) ao conversor de medidas!" + Reset);
		System.out.println("As operações disponíveis são:");
		System.out.println();
		System.out.println(Cyan + "(1) Real para Dólar.");
		System.out.println("(2) Celsius para Fahrenheit.");
		System.out.println("(3) Metro para Foot.");
		System.out.println("(4) Quilograma para Libra" + Reset);
		System.out.println();
		System.out.println(Itálico + "Deseja continuar? (Sim ou Não)" + Reset);
		String confirm = sc.next();
		
		// Loop While com as conversões, roda até o usuário negar a última pergunta
		while (confirm.equalsIgnoreCase("Sim") || confirm.equalsIgnoreCase("S")) {
			System.out.println(Itálico + "Obrigado por continuar conosco, por favor, digite o número da operação desejada. (1, 2, 3 ou 4)" + Reset);
			
			int op = sc.nextInt();
			
			switch (op) {
			case 1:
				System.out.println("Você escolheu a conversão de " + Yellow + "Real para Dólar." + Reset);
				System.out.println("Digite a quantidade em reais:");
				double real = sc.nextDouble();
				final double cotacaoDolar = 5.16;
				double dolar = real / cotacaoDolar;
				System.out.println(Green + "Resultado: " + Reset + "$" + String.format("%.2f", dolar));
				break;
			case 2:
				System.out.println("Você escolheu a conversão de " + Yellow + "Celsius para Fahrenheit." + Reset);
				System.out.println("Digite a quantidade em Celsius:");
				double celsius = sc.nextDouble();
				double fahrenheit = (celsius * 1.8) + 32;
				System.out.println(Green + "Resultado: " + Reset + String.format("%.2f", fahrenheit) + "° F");
				break;
			case 3:
				System.out.println("Você escolheu a conversão de " + Yellow + "Metro para Foot." + Reset);
				System.out.println("Digite a quantidade em metros:");
				double meters = sc.nextDouble();
				double foot = meters * 3.28;
				System.out.println(Green + "Resultado aproximado: " + Reset + String.format("%.2f", foot) + " ft");
				break;
			case 4:
				System.out.println("Você escolheu a conversão de " + Yellow + "Quilograma para Libra." + Reset);
				System.out.println("Digite a quantidade em quilos:");
				double quilos = sc.nextDouble();
				double libra = quilos * 2.20;
				System.out.println(Green + "Resultado aproximado: " + Reset + String.format("%.2f", libra) + " lb");
				break;
			default:
				System.out.println(Itálico + "Por favor, digite uma das opções." + Reset);
			}

			System.out.println(Itálico + "Deseja continuar conosco? (Sim ou Não)" + Reset);
			confirm = sc.next();
		}
		
		// Conclusão do programa e fechamento do Scanner
		System.out.println("Quando quiser ajuda, pode chamar!");
		sc.close();

	}
}
