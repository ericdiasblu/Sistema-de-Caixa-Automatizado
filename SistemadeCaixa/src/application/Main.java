package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int selecionarProduto, valorTotal = 0;
		int arroz = 20, feijao = 10, acucar = 5, cafe = 15;
		boolean continuar = false;
		
		
		while (continuar == false) {
			
			System.out.println("\n Sistema de Caixa Automatizado");
			
			System.out.println(" ┌―――――――――――――――――――――――――――┐");
			System.out.println(" │   1. Arroz - R$ 20.00     │");
			System.out.println(" │   2. Feijão - R$ 10.00    │");
			System.out.println(" │   3. Açúcar - R$ 5.00     │");
			System.out.println(" │   4. Café - R$ 15.00      │");
			System.out.println(" │   5. Sair                 │");
			System.out.println(" └―――――――――――――――――――――――――――┘");
			System.out.print(" Selecione a opcão: ");
			selecionarProduto = sc.nextInt();
			
			switch (selecionarProduto) {
			case 1:
				System.out.println(" Arroz - R$20.00\n");
				valorTotal += arroz;
				break;
				
			case 2:
				System.out.println(" Feijão - R$10.00\n");
				valorTotal += feijao;
				break;
				
			case 3:
				System.out.println(" Açucar - R$5.00\n");
				valorTotal += acucar;
				break;
				
			case 4:
				System.out.println(" Café - R$15.00\n");
				valorTotal += cafe;
				break;
				
			case 5:
				continuar = true;
				break;

			default:
				break;
			}		
		}
		
		System.out.println(" Total a pagar: R$"+valorTotal+".00");
		
		sc.close();

	}
}
