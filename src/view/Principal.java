package view;

import controller.ThreadVetor;

public class Principal {
	public static void main(String[] args) {
		int vetor[] = new int[1000]; 
		int tamanhoVetor = vetor.length;
		for (int i = 0; i < tamanhoVetor; i++) {
			vetor[i] = (int) ((Math.random()*101)+1);
		}
		Thread t1 = new ThreadVetor(vetor, 1);
		Thread t2 = new ThreadVetor(vetor, 2);
		
		t1.start();
		t2.start();
	}
}
