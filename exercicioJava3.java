package projetosJava;
import java.util.Scanner;

//Exercício proposto pelo ChatGPT (Enunciado completo na imagem "ex3" da pasta enunciados_java)

public class exercicioJava3 {
	
	void main() {

		Scanner sc = new Scanner(System.in);
		int senha = 2468;
		int tentativas = 3;

		System.out.println("Digite o primeiro palpite, você atualmente tem: " + tentativas + " tentativas.");
		int palpite = sc.nextInt();
		
		while (tentativas > 0) {

			if (palpite == 0) {
				System.out.println("Operação encerrada.");
				break;
			} else if (palpite == senha) {
				System.out.println("Cofre aberto.");
				break;
			} else if (palpite != senha && palpite %2 == 0) {
				tentativas = tentativas - 1;
			} else if (palpite != senha && palpite %2 != 0) {
				tentativas = tentativas - 2;
			}
			
			if (tentativas <= 0) {
				System.out.println("Cofre bloqueado.");
				break;
			}
			
			System.out.println("Palpite incorreto, você ainda possui: " + tentativas + " tentativas");
			System.out.println("Tente novamente com outro palpite:");
			palpite = sc.nextInt();	
		}
		
		sc.close();
	}
}
