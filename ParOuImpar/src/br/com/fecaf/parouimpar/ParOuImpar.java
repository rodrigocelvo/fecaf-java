package br.com.fecaf.parouimpar;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		int n1, n2 = 0;
		
		try {
			
        Scanner entradaDados = new Scanner(System.in);
        
        System.out.println(
        		"Lembrando que o valor inicial não pode ser MAIOR ou IGUAL que o número final. \n"
        		+ "E deve estar entre 0 e 500. \n"
        		+ "Em qual número devemos iniciar a contagem?: \n"
        );

        n1 = entradaDados.nextInt();
        
        if(n1 < 0 || n1 > 500) {
            System.out.println("O valor inicial não pode ser menor que 0, e nem maior que 500.");
            return;
        }
        
        System.out.println(
        		"\nLembrando que esse número deve ser maior que o anterior. \n"
        		+ "E deve estar entre 100 e 1000. \n"
        		+ "Informe o número final da contagem: \n"
        		
        		);
        n2 = entradaDados.nextInt();
        
        if(n2 < 100 || n1 > 1000) {
            System.out.println("O valor inicial não pode ser menor que 100, e nem maior que 1000.");
            return;
        }
        
        if(n1 >= n2) {
        	System.out.println("O valor inicial não pode ser MAIOR ou IGUAL ao valor final.");
            return;
        }
        
        calcularParOuImpar(n1, n2);
        
		} catch(Exception e) {
        	System.out.println("Por favor, insira apenas números inteiros.");
		}
	}
	
	public static void calcularParOuImpar (int n1, int n2) {
        Scanner entradaDados = new Scanner(System.in);

		int aux_par = n1, aux_impar = n1;
		int cont_par = 0, cont_impar = 0;
		int calc = 0, calc_par = 0, calc_impar = 0;
		String escolha_calc = null;
		
        System.out.println("Lista de número pares: \n");
		while(aux_par <= n2) {
			if(aux_par % 2 == 0) {
	        	System.out.println(aux_par);
	        	cont_par++;
	        	calc_par = aux_par + calc_par;
			}
			
			aux_par++;
		}
		
        System.out.println("\n\tQuantidade de números pares: " + cont_par + "\n");
        
        System.out.println("Lista de número ímpares: \n");
		while(aux_impar <= n2) {
			if(aux_impar % 2 != 0) {
	        	System.out.println(aux_impar);
	        	cont_impar++;
	        	calc_impar = aux_impar + calc_impar;
			}
			
			aux_impar++;
		}
		
        System.out.println("\n\tQuantidade de números ímpares: " + cont_impar + "\n");
       
        System.out.println("\nQuais números você deseja somar? sendo [PARES / IMPARES / AMBOS]?: \n");
        escolha_calc = entradaDados.nextLine().toUpperCase();
        
        switch(escolha_calc) {
        case "PARES": 
            System.out.println("\nTotal da soma dos números pares: " + calc_par);
            break;
        case "IMPARES":
            System.out.println("\nTotal da soma dos números ímpares: " + calc_impar);
            break;
        case "AMBOS":
       	 calc = calc_par + calc_impar;
         System.out.println("\nTotal da soma dos números pares + ímpares: " + calc);
            break;
         default:
             System.out.println("\nTotal da soma dos números pares: " + calc_par);
        	 System.out.println("\nTotal da soma dos números ímpares: " + calc_impar);
        	 calc = calc_par + calc_impar;
             System.out.println("\nTotal da soma dos números pares + ímpares: " + calc);
        }
        System.out.println("\n\tFeito com <3 por Rodrigo Celvo.");
	}
}
