package ads2periodotasks;

import java.util.Scanner;

public class tasks {
	public static void manipularString(String str) {
		int tamanhoString;
		char aux;
		tamanhoString = str.length();
		System.out.println(tamanhoString);
		
		System.out.println(str.toUpperCase());
		int cont;
		cont = 0;
		
		for(int i = 0; i< tamanhoString; i++) {
			aux = str.charAt(i);
			if(aux == 'a' || aux=='e'||aux == 'i' || aux=='o' || aux=='u') {
				cont++;
			}
		}
		System.out.println(cont);
		
		
		
		if(str.substring(0, 3).equalsIgnoreCase("UNI")) {
			System.out.println("Sim! Começa com UNI.");
		} else {
			System.out.println("Não começa com UNI.");
		}

		if(str.substring(tamanhoString-3).equalsIgnoreCase("RIO")) {
			System.out.println("Sim! A string términa com RIO.");
		}else {
			System.out.println("A string não términa com RIO!");
		}
	}
	
	public static void clima(Scanner scanner) {
		
		System.out.println("Qual a temperátura?");
		int temperatura = scanner.nextInt();
		
		if(temperatura > 30) {
			System.out.println("Está quente!");
		}else {
			System.out.println("Está frio!");
		}
	}
	
	public static void valorMaior(Scanner scanner) {
		
		System.out.println("Digite o primeiro valor");
		int valor1 = scanner.nextInt();
		System.out.println("Digite outro valor");
		int valor2 = scanner.nextInt();
		
		if( valor1 > valor2 ){
			System.out.println("O valor maior é: "+ valor1);
		}else if(valor2 > valor1){
			System.out.println("O valor maior é: " + valor2);
		}else {
			System.out.println("os valores "+valor1 + " e " + valor2 + " sao iguais");
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		tasks.manipularString("uNificatóRio");
		tasks.clima(scanner);
		tasks.valorMaior(scanner);
		scanner.close();
	}

}
