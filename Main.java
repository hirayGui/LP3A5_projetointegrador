package projeto_integrador;

import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	private static TransacaoRepository transRepository = new TransacaoRepository();
	private static DespesasRepository despsRepository = new DespesasRepository(); 
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int opcao = 0;
		String nome, numero_conta;
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
		
		Conta conta = new Conta(nome, numero_conta, saldo, salario);
		
		do {
			System.out.println("Programa Gerenciador de Orçamento Financeiro"
							+ "\n============================================"
							+ "\nEscolha uma ação:"
							+ "\n[1] Consultar saldo"
							+ "\n[2] Registrar transação"
							+ "\n[3] Consultar transações"
							+ "\n[4] Adicionar despesa"
							+ "\n[5] Consultar despesas"
							+ "\n[6] Realizar balancete (cálculo referente aos gastos mensais)"
							+ "\n[0] Sair");
			
		} while (opcao != 0);
		
		s.close();
	}
	

}
