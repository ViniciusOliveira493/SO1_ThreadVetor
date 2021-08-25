package controller;

import java.text.DecimalFormat;

public class ThreadVetor extends Thread{
	int vetor[], numero;
	
	DecimalFormat df = new DecimalFormat("#,########0.00000000");
	public ThreadVetor(int vetor[],int numero) {
		super();
		this.vetor = vetor;
		this.numero = numero;
	}
	
	@Override
	public void run() {
		if(numero%2 == 0) {
			System.out.println(df.format(percorrerComFor())+" S");
		}else {
			System.out.println(df.format(percorrerComForeach())+" S");
		}
	}
	
	private double percorrerComFor() {
		double tempoinicial = System.nanoTime(); 
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] += 1;
		}
		double tempoFinal = System.nanoTime();
		return (tempoFinal-tempoinicial)/Math.pow(10, 9);
	}
	
	private double percorrerComForeach() {
		double tempoinicial = System.nanoTime(); 
		for (int valor : vetor) {
			valor += 1;
		}
		double tempoFinal = System.nanoTime();
		return (tempoFinal-tempoinicial)/Math.pow(10, 9);
	}
}
