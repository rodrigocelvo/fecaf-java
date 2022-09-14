package br.com.fecaf.tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int tab1, tab2, cont1, cont2;
		
        Scanner entradaDados = new Scanner(System.in);
        
        System.out.println("Digite o valor inicial da tabuada:");
        tab1 = entradaDados.nextInt();
       
        System.out.println("Digite o valor final da tabuada:");
        tab2 = entradaDados.nextInt();
        
        System.out.println("Digite o valor inicial da contagem:");
        cont1 = entradaDados.nextInt();
        
        System.out.println("Digite o valor final da contagem:");
        cont2 = entradaDados.nextInt();
    

        calcularTabuada(tab1, tab2, cont1, cont2);
        
	}
       
		public static void calcularTabuada (int tab1, int tab2, int cont1, int cont2) {
    		int contador1 = cont1, contadorTab1 = cont1;
    		int contador2 = cont2, contadorTab2 = cont2;
    		int resultado1, resultado2;
    		
    		if(tab1 < 2 || tab1 > 100 || tab2 < 2 || tab2 > 100) {
				System.out.println("O valor da tabuada deve estar entre 2 e 100.");
				return;
    		}
    		
    		
    		if(cont1 < 0 || cont1 > 50 || cont2 < 0 || cont2 > 50 ) {
				System.out.println("O valor da contagem deve estar entre 0 e 50.");
				return;
    		}
    		
    		if(tab1 > tab2 || cont1 > cont2) {
               System.out.println("O valor inicial não pode ser maior que o valor final.");
   				return;
            }
    	
			System.out.println("Tabuada do " + tab1 + "\n");
    		while (contador1 <= contador2) {
				resultado1 = tab1 * contador1;
				System.out.println(tab1 + "x" + contador1 + "=" + resultado1 + "\n");
				contador1++;
			}
    		
			System.out.println("Tabuada do " + tab2 + "\n");
    		while (contadorTab1 <= contadorTab2) {
				resultado2 = tab2 * contadorTab1;
				System.out.println(tab2 + "x" + contadorTab1 + "=" + resultado2 + "\n");
				contadorTab1++;
			}  		
	}	
}
