package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scanner para captura das variáveis
		Scanner sc = new Scanner (System.in);

		// Variáveis utilizadas
		int selecionarProduto, valorTotal = 0;
		boolean continuarCompra = false;

		// Laço para continuar adicionando produtos
		while (continuarCompra == false) {
			// Design do menu dos produtos
			System.out.println("\n Sistema de Caixa Automatizado");
			
			System.out.println(" ┌―――――――――――――――――――――――――――┐");
			System.out.println(" │   1. Arroz - R$ 20.00     │");
			System.out.println(" │   2. Feijão - R$ 10.00    │");
			System.out.println(" │   3. Açúcar - R$ 5.00     │");
			System.out.println(" │   4. Café - R$ 15.00      │");
			System.out.println(" │   5. Sair                 │");
			System.out.println(" └―――――――――――――――――――――――――――┘");
			// Selecionar produto do sistema
			System.out.print(" Selecione a opcão: ");
			selecionarProduto = sc.nextInt();

			// Opções do mercado
			switch (selecionarProduto) {
			case 1:
				System.out.println(" Arroz - R$20.00\n");
				valorTotal += 20;
				break;
				
			case 2:
				System.out.println(" Feijão - R$10.00\n");
				valorTotal += 10;
				break;
				
			case 3:
				System.out.println(" Açucar - R$5.00\n");
				valorTotal += 5;
				break;
				
			case 4:
				System.out.println(" Café - R$15.00\n");
				valorTotal += 15;
				break;
				
			case 5:
				continuar = true;
				break;

			default:
				break;
			}		
		}
		// Valor total dos itens selecionados
		System.out.println(" Total a pagar: R$"+valorTotal+".00");
		
		sc.close();

	}
}
