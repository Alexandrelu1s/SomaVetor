package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do vetor: ");
		int n = sc.nextInt();
		
		Double[] vetor = new Double[n];
		Double soma = 0.0;
		
		System.out.println("Entre " + n + " numeros inteiros no vetor: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print("Numero: ");
			vetor[i] = sc.nextDouble();
			soma += vetor[i];
		}
		
		System.out.print("Valores: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		Double media = soma/n;
		System.out.println("Soma = " + soma + "\nMedia = " + media);
		
		sc.close();
	}

}
