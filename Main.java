package projeto_integrador;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.Scanner;

public class Main {


	private static TransacaoRepository transRepository = new TransacaoRepository();
	private static DespesasRepository despsRepository = new DespesasRepository(); 

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException, InstantiationException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException, ParseException{

		Transacao transacao;
		Despesas despesa;
		Scanner s = new Scanner(System.in);
		int opcao = 0;
		String nome, numero_conta, tipo = null, data_transacao;
		double saldo, salario;

		System.out.println("Programa gerenciador de orçamento financeiro");
		System.out.println("============================================");

		System.out.println("\nInforme as informações da sua conta:");

		System.out.println("Insira o número da conta: ");
		numero_conta = s.nextLine();

		System.out.println("Insira o seu nome: ");
		nome = s.nextLine();

		System.out.println("Insira o saldo: ");
		saldo = s.nextDouble();

		System.out.println("Insira o seu salário: ");
		salario = s.nextDouble();
		s.nextLine();

		Conta conta = new Conta(nome, numero_conta, saldo, salario);

		do {
			System.out.println("Programa Gerenciador de Orçamento Financeiro"
					+ "\n============================================"
					+ "\nEscolha uma ação:"
					+ "\n[1] Consultar saldo"
					+ "\n[2] Registrar transação"
					+ "\n[3] Consultar todas as transações"
					+ "\n[4] Consultar transação específica"
					+ "\n[5] Adicionar despesa"
					+ "\n[6] Consultar despesas"
					+ "\n[7] Remover despesa"
					+ "\n[8] Realizar balancete (cálculo referente aos gastos mensais)"
					+ "\n[0] Sair");
			opcao = s.nextInt();

			switch(opcao) {
			case 1:
				System.out.println("\n<Informações da Conta>");
				Reflexao.refletirAtributo(conta, conta.getClass());

				System.out.println("\n\n\n");
				break;

			case 2:
				System.out.println("\n<Registrar transação>"
						+ "\nInforme o tipo de transação:"
						+ "\n[1] Entrada"
						+ "\n[2] Saída");
				opcao = s.nextInt();

				if(opcao == 1) {
					tipo = "Entrada";
				}else if(opcao == 2) {
					tipo = "Saída";
				}else if(opcao > 2) {
					System.out.println("Opção inválida!");
					break;
				}

				System.out.println("Informe o valor: ");
				double valor = s.nextDouble();

				System.out.println("Informe a data: ");
				s.nextLine();
				data_transacao = s.nextLine();
				
				transRepository.adicionarTransacao(transacao = new Transacao(valor, data_transacao, tipo));
				conta.updateSaldo(tipo, valor);
				
				System.out.println("\n\n\n");
				break;

			case 3:
				System.out.println("<Apresentando todas as transações>");
				transRepository.getAll();

				System.out.println("\n\n\n");
				break;

			case 4:
				System.out.println("<Consultando transação específica>"
						+ "\nEscolha o método de consulta:"
						+ "\n[1] Por data"
						+ "\n[2] Por id\n");
				opcao = s.nextInt();
				if(opcao == 1) {
					System.out.println("Informe a data de transação: ");
					data_transacao = s.nextLine();
					
					transRepository.getByDate(data_transacao);
				}else if(opcao == 2) {
					System.out.println("Informe o ID da transação: ");
					int id = s.nextInt();
					
					transRepository.getById(id);
				}else if(opcao > 2 || opcao < 1) {
					System.out.println("Opção inválida!");
					break;
				}

				System.out.println("\n\n\n");
				break;

			case 5:
				
				System.out.println("<Adicionar despesa>");

				System.out.println("Informe o tipo de despesa: ");
				s.nextLine();
				tipo = s.nextLine();

				System.out.println("Informe o valor: ");
				valor = s.nextDouble();

				despsRepository.adicionarDespesa(despesa = new Despesas(tipo, valor));
				
				System.out.println("\n\n\n");
				break;

			case 6:
				System.out.println("<Consultando todas as despesas>");
				
				despsRepository.getAll();
				
				System.out.println("\n\n\n");
				break;

			case 7:
				System.out.println("<Removendo despesa>");
				
				System.out.println("Informe o tipo da despesa: ");
				tipo = s.nextLine();
				
				despsRepository.delete(despsRepository.getByType(tipo));
				break;			

			case 8:
				System.out.println("<Apresentando balancete>");
				
				System.out.println("Valor total das despesas: R$" + despsRepository.getDespesaTotal());
				
				System.out.println("Salário: R$" + conta.getSalario());
				
				double balancete = conta.getSalario() - despsRepository.getDespesaTotal();
				System.out.println("Balancete mensal: " + balancete);
				
				System.out.println("\n\n\n");
				break;
			
			case 0:
				System.out.println("Saindo da aplicação...");
				break;

			default:
				System.out.println("Opção inválida!!");
				break;
			}

		} while (opcao != 0);

		s.close();
	}

}
