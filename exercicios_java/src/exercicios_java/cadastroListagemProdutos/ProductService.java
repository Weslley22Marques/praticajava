package entities;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductService {
	private List<Produto> produtos = new ArrayList<>();
	
	public void exibirMenu() {
		System.out.println("------ Menu Principal ------");
		System.out.println("1 - Cadastrar Produto");
		System.out.println("2 - Listar Produtos");
		System.out.println("0 - SAIR");
		System.out.println("Escolha uma opção: ");
	}
	
	public void cadastrarProduto(Scanner scanner) {
		System.out.println("------ Cadastro de Produto ------");
		
		System.out.println("Nome do Produto: ");
		String nome = scanner.nextLine();
		
		System.out.println("Descrição do Produto: ");
		String descricao = scanner.nextLine();
		
		System.out.println("Valor do Produto: ");
		double valor;
		
		try { 
			valor = Double.parseDouble(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Valor inválido! O cadastro foi cancelado.");
			return;
		}
		
		System.out.println("Disponibilidade de venda (Sim/Não): ");
		String disponibilidadeInput = scanner.nextLine();
		boolean disponivel = disponibilidadeInput.equalsIgnoreCase("Sim");
		
		Produto produto = new Produto(nome, descricao, valor, disponivel);
		produtos.add(produto);
		
		System.out.println("Produto cadastrado!");
	}
	
	public void listarProdutos() {
		System.out.println("------ Listagem de Produtos ------");
		if (produtos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
			return;
		}
		
		produtos.sort(Comparator.comparingDouble(Produto::getValor));
		
		System.out.printf("%-20s %-10s%n", "Nome", "Valor");
		System.out.println("------------------------------------");
		
		for (Produto produto : produtos) {
			System.out.printf("%-20s R$ %.2f%n", produto.getNome(), produto.getValor());
		}
	}

}
