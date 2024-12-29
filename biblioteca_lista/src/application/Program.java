package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Livro;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Lista para inserir os livros
		List<Livro> armario = new ArrayList<>();
		
		
		// Opção para escolha 
		int option;
		
		do {
			System.out.println();
			System.out.println("=== BIBLIOTECA ===");
			System.out.println(" 1 - Adicionar livro");
			System.out.println(" 2 - Livros da Biblioteca");
			System.out.println(" 3 - Remover livro");
			System.out.println(" 4 - Emprestar livro");
			System.out.println(" 5 - Devolver livro");
			System.out.println(" 6 - Sair");
			
			System.out.print("Escolha a opção: ");
			option = sc.nextInt();
			System.out.println();
			
			switch(option) {
			
			case 1:
				// Adicionando um livro
				System.out.println("Adicionando um livro...");
				System.out.print("Informe o titulo da obra: ");
				sc.nextLine();
				String titulo = sc.nextLine();
				System.out.println();
				
				System.out.print("Informe o nome do autor: ");
				String autor = sc.nextLine();
				System.out.println();
				
				System.out.print("Em que ano ele foi lançado? (yyyy): ");
				Integer anoLancamento = sc.nextInt();
				
				// instanciando um livro
				Livro livro = new Livro(titulo, autor, anoLancamento, true);
				armario.add(livro); // adicionando ao armario
				System.out.println("Livro Adicionado com sucesso!");
				System.out.println();
				break;
			
			
			case 2:
				// Listando livros da biblioteca
				for(Livro livros : armario) {
					System.out.println(livros);
				}
				break;
			
				
			case 3:
				// Removendo um livro do armario
				System.out.println();
				System.out.print("Digite o índice do livro a ser removido: ");
				int indice = sc.nextInt();
					if(indice >= 0 && indice < armario.size()) {
						armario.remove(indice);
						System.out.println("Livro removido com Sucesso!");
						System.out.println();
					}
					else {
						System.out.println("Indice Inválido, tente novamente");
						System.out.println();
					}
					break;
				
				
			case 4:
				// Emprestando um livro
				System.out.println();
				System.out.print("Digite o índice do livro para emprestar: ");
				indice = sc.nextInt();
				if(indice >= 0 && indice < armario.size()) {
					armario.get(indice).setDisponibilidade(false);
					System.out.println("Livro emprestado com sucesso!");
					System.out.println();
				}
				else {
					System.out.println("Indice invalido, tente novamente");
					System.out.println();
				}
				break;
				
				
			case 5:
				// Devolução do livro
				System.out.println();
				System.out.print("Digite o indice do livro a ser devolvido: ");
				indice = sc.nextInt();
				if(indice >= 0 && indice < armario.size()) {
					armario.get(indice).setDisponibilidade(true);
					System.out.println("Livro devolvido com sucesso!");
					System.out.println();
				}
				else {
					System.out.println("Indice invalido, tente novamente");
					System.out.println();
				}
				break;
				
				
			case 6:
				System.out.println("Saindo....");
				System.out.println();
				break;
				
		   default: 
				System.out.println("Valor invalido. Tente novamente!");
				break;
			
			}
		}while(option != 6);
		
		
		
		
		sc.close();
	}

}
