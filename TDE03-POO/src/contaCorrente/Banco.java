package contaCorrente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
	private String nome;
	//Atribuito para coleção de objetos
	private List<Cliente> clientes;
	
	public Banco(String nome) {
		this.nome = nome;
		// instancia a lista como um ArrayList
		this.clientes = new ArrayList<>();
	}
	
	public void addCliente(Cliente cliente){
		clientes.add(cliente);
	}
	
	//Metodo main do projeto
	public static void main(String[] args) {
		// intancia a classe Banco
		Banco banco = new Banco("MeuBanco&CIA_Gabs");
		//Adiciona os clientes a lista de clientes
		banco.addCliente(new Cliente("Cleuza", 123));
		banco.addCliente(new Cliente("Gabriel", 456));		
		banco.addCliente(new Cliente("Miguel", 789));
		List<Cliente> listaClientes = banco.getClientes();
		
		//Inicia o processo de entradas e saidas dos clientes
		// Utiliza o Iterador
		System.out.println("*** "+banco.nome+" - OPERAÇÔES ***");
		Scanner ler = new Scanner(System.in);
		for (Cliente cliente : listaClientes) { // cliente é um iterador
			//Faço da leitura dos dados do teclado
			System.out.print("\nCliente "+ cliente.getNome() + " - Operações");
			System.out.print("\n** Entre o valor do deposito: R$ ");
			double dep = ler.nextDouble();
			cliente.getConta().depositaValor(dep);
			System.out.print("** Entre o valor do saque: R$ ");
			double saq = ler.nextDouble();
			cliente.getConta().retiraValor(saq);
			
		}
		
		//Faz a impressão final do saldo de cada cliente e sua informações pre setadas.
		//Utilia o Iterador
		System.out.println("\n*** "+banco.nome+" ***");
		for (Cliente cliente : listaClientes) { // cliente é um iterador
			cliente.getConta().imprimeConta();
		}
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	
}
