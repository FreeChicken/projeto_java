package ecommerce;

import java.io.IOException;
import java.util.InputMismatchException;

import java.util.Scanner;

import ecommerce.model.ItemParteDeCima;
import ecommerce.controller.EcommerceController;
import ecommerce.model.ItemParteDeBaixo;

public class Menu {

	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		EcommerceController itens = new EcommerceController();

		int option, idItem, quantidade, tipo;
		float precoItem;
		String nomeDoItem, marca, tamanhoManga, tipoTecido;

		while (true) {

			System.out.println("*****************************************************");
			System.out.println("                GenE-COMMERCE			             ");
			System.out.println("*****************************************************");
			System.out.println("            1 - Listar todos os Itens                ");
			System.out.println("            2 - Buscar Item por ID                   ");
			System.out.println("            3 - Cadastrar Item                       ");
			System.out.println("            4 - Atualizar Dados do Item              ");
			System.out.println("            5 - Deletar Item                         ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opcao desejada:                          ");
			System.out.println("                                                     ");

			try {
				option = read.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				read.nextLine();
				option = 0;
			}

			if (option == 6) {
				System.out.println("\nGenE-Commerce - Tenha um Ótimo Dia!");
				sobre();
				read.close();
				System.exit(0);
			}

			switch (option) {
			case 1:
				System.out.println("Listar todos os Itens\n\n");
				itens.listarTudo();
				keyPress();
				break;
			case 2:
				System.out.println("Buscar Item por ID\n\n");

				System.out.println("Digite o ID do Item: ");
				idItem = read.nextInt();

				itens.procurarPorId(idItem);

				keyPress();
				break;
			case 3:
				System.out.println("Cadastrar Item\n\n");

				System.out.println("Digite a quantidade de itens: ");
				quantidade = read.nextInt();

				System.out.println("Digite o Nome do Item: ");
				read.skip("\\R?");
				nomeDoItem = read.nextLine();

				System.out.println("Digite a Marca do Item: ");
				read.skip("\\R?");
				marca = read.nextLine();

				do {
					System.out.println(
							"Digite o Tipo de Item (1-Camiseta, 2-Calças, 3-Calçados, 4-Meias, 5-Roupas Intimas ou 6-Adereços): ");
					tipo = read.nextInt();
				} while (tipo < 1 && tipo > 6);

				System.out.println("Digite o Preço do Item: ");
				precoItem = read.nextFloat();
				read.nextLine();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Tipo de Manga (Longa, Curta ou Regata: ");
					tamanhoManga = read.nextLine();
					itens.cadastrar(new ItemParteDeCima(itens.gerarIdItem(), quantidade, tipo, nomeDoItem, marca,
							precoItem, tamanhoManga));

				}
				case 2 -> {
					System.out.println("Digite o Tipo de Tecido (Jeans, Moletom, Linho, Veludo, Tactel: ");
					tipoTecido = read.nextLine();
					itens.cadastrar(new ItemParteDeBaixo(itens.gerarIdItem(), quantidade, tipo, nomeDoItem, marca,
							precoItem, tipoTecido));
				}
				}

				keyPress();
				break;

			case 4:
				System.out.println("Atualizar Dados do Item\n\n");

				System.out.println("Digite o ID do Item: ");
				idItem = read.nextInt();

				var buscaItem = itens.buscarNaCollection(idItem);

				if (buscaItem != null) {

					System.out.println("Digite a quantidade de itens: ");
					quantidade = read.nextInt();
					System.out.println("Digite o Nome do Item: ");
					read.skip("\\R?");
					nomeDoItem = read.nextLine();

					System.out.println("Digite a Marca do Item: ");
					marca = read.nextLine();

					System.out.println("Digite o Preço do Item: ");
					precoItem = read.nextFloat();

					tipo = buscaItem.getTipo();

					switch (tipo) {
					case 1 -> {
						System.out.println("Digite o Tipo de Manga (Longa, Curta ou Regata: ");
						tamanhoManga = read.nextLine();
						itens.cadastrar(new ItemParteDeCima(itens.gerarIdItem(), quantidade, tipo, nomeDoItem, marca,
								precoItem, tamanhoManga));
					}
					case 2 -> {
						System.out.println("Digite o Tipo de Tecido (Jeans, Moletom, Linho, Veludo, Tactel: ");
						tipoTecido = read.nextLine();
						itens.cadastrar(new ItemParteDeBaixo(itens.gerarIdItem(), quantidade, tipo, nomeDoItem, marca,
								precoItem, tipoTecido));
					}
					default -> {
						System.out.println("Tipo de item inválido!");
					}
					}

				} else
					System.out.println("\nItem não encontrado!");

				keyPress();
				break;
			case 5:
				System.out.println("Deletar Item\n\n");

				System.out.println("Digite o número da conta: ");
				idItem = read.nextInt();

				itens.deletar(idItem);

				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");

				keyPress();
				break;
			}
		}

	}

	public static void sobre() {
		System.out.println("\n*******************************************************");
		System.out.println("Projeto Desenvolvido por: Anderson Alves ");
		System.out.println("Generation Brasil - ");
		System.out.println("github.com/");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
