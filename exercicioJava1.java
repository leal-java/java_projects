package projetosJava;
import java.util.Scanner;

// Exercício proposto pelo ChatGPT (Enunciado completo na imagem "ex1" da pasta enunciados_java)

public class exercicioJava1 {
	
	void main() {
		
		final String Yellow = "\u001B[33m";
		final String Cyan = "\u001B[36m";
		final String Reset = "\u001B[0m";
		
		Scanner sc = new Scanner(System.in);
		double minutosExcedentes;
		double valorFinal = 0;
		
		System.out.println();
		System.out.println("Tabela de preços - Operadora");
		System.out.println(Cyan + "Plano Básico (120 min) = R$ 60,00");
		System.out.println("Consumo Excedente (+ 120 min) = R$ 60,00 + R$ 1,50 p/ min excedente");
		System.out.println("Consumo Excedente (+ 180 min) = R$ 150,00 + R$ 2,50 p/ min excedente");
		System.out.println("Consumo Excedente (+ 200 min) = R$ 200,00 + R$ 2,50 p/ min excedente + R$ 30,00 taxa" + Reset);
		System.out.println();
		
		System.out.println("Digite quanto tempo você consumiu (em minutos): ");
		double tempo = sc.nextDouble();
		
		if (tempo <= 60) {
			valorFinal = 60 - 10;
			
		} else if ( tempo > 60 && tempo <= 120) {
			valorFinal = 60;
			
		} else if (tempo > 120 && tempo <= 180) {
			minutosExcedentes = tempo - 120;
			valorFinal = 60 + (minutosExcedentes * 1.5);
			
		} else if (tempo > 180 && tempo <= 200) {
			minutosExcedentes = tempo - 180;
			valorFinal = 150 + (minutosExcedentes * 2.5);
			
		} else if (tempo > 200) {
			minutosExcedentes = tempo - 200;
			valorFinal = 230 + (minutosExcedentes * 2.5);
		}
		
		System.out.println(Yellow + "Valor a pagar: " + Reset + "R$ " + valorFinal);
		sc.close();
	}
}
