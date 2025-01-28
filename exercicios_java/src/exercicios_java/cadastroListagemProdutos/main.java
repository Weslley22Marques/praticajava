package exercicios_java;

import java.util.Scanner;

import entities.ProductService;

public class main {

	public static void main(String[] args) {
		ProductService produtoService = new ProductService();
		Scanner scanner = new Scanner(System.in);
		
		int opcao;
		do {
			produtoService.exibirMenu();
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
				case 1 -> produtoService.cadastrarProduto(scanner);
				case 2 -> produtoService.listarProdutos();
				case 0 -> System.out.println("Encerrando o programa ...");
				default -> System.out.println("Opção inválida! Tente novamente.");
			}
		}while (opcao != 0);
		
		scanner.close();
	}

}
