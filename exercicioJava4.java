package projetosJava;

//Exercício proposto pelo ChatGPT (Enunciado completo na imagem "ex4" da pasta enunciados_java)

public class exercicioJava4 {
	
	void main () {
		
		int pares = 0;
		int impares = 0;
		
		for (int i = 1; i <= 20; i++) {
			System.out.println( (i % 2 == 0) ? i + " é par" : i + " é ímpar");
			
			if (i % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
			
		}
		
		System.out.println("A quantidade de números pares é: " + pares);
		System.out.println("A quantidade de números ímpares é: " + impares);
	}
}
