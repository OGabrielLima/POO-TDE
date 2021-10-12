package contaCorrente;

public class Cliente {
	private String nome;
	//Atributo para associar classe de cliente com a classe de conta corrente
	private ContaCorrente conta;
	
	
	public Cliente(String nome, int numero) {
		this.nome = nome;
		//Associo a classe de cliente com a classe de conta corrente
		this.conta = new ContaCorrente(numero);
		this.conta.setCliente(this);
	}
	
	public void opera() {
		conta.depositaValor(0);
		conta.retiraValor(0);
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ContaCorrente getConta() {
		return conta;
	}
	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}
	
	
}
