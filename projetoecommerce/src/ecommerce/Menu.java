package ecommerce;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int option;
		
	while (true) {

			System.out.println("*****************************************************");
			System.out.println("                GenE-COMMERCE			             ");
			System.out.println("*****************************************************");
			System.out.println("            1 - Listar todos os Itens                ");
			System.out.println("            2 - Buscar Item por ID                   ");
			System.out.println("            3 - Cadastrar Item                       ");
			System.out.println("            4 - Atualizar Dados do Item              ");
			System.out.println("            5 - Deletar Item                         ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opcao desejada:                          ");
			System.out.println("                                                     ");
			
			option = read.nextInt();
			
			if (option == 0) {
				System.out.println("\nGenE-Commerce - Tenha um Ótimo Dia!");
				read.close();
				System.exit(0);
			}
			
			switch (option) {
			case 1:
				System.out.println("Listar todos os Itens\n\n");

				break;
			case 2:
				System.out.println("Buscar Item por ID\n\n");

				break;
			case 3:
				System.out.println("Cadastrar Item\n\n");

				break;
			case 4:
				System.out.println("Atualizar Dados do Item\n\n");

				break;
			case 5:
				System.out.println("Deletar Item\n\n");

				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
		}
	}

}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Anderson Alves ");
		System.out.println("Generation Brasil - ");
		System.out.println("github.com/");
		System.out.println("*********************************************************");
	}
}
