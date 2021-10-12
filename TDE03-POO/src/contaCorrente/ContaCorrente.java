package contaCorrente;

public class ContaCorrente {
	private int numero;
	private double saldo;
	private Cliente cliente;
	
	public ContaCorrente(int numero) {
		this.numero = numero;
		setSaldo(0);
	}
	
	//Faz o assert na classe de conta corrente
	public double verificaSaldo() {
		assert(getSaldo() >= 0):"Saldo não pode ser menor que zero";
		
		return getSaldo();
	}
	
	public void depositaValor(double valor) {
		saldo += valor;
		verificaSaldo();
	}
	
	public void retiraValor(double valor) {
		saldo -= valor;
		verificaSaldo();
	}	
	
	
	public void imprimeConta() {
		System.out.println("Número da conta: "+ numero);
		System.out.println("Cliente: "+ cliente.getNome());
		System.out.println("Saldo: R$" + saldo + "\n");
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
