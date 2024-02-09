package banco_digital;

public abstract class Conta implements IConta {
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	// Ao criar um objeto será obrigatório passar um cliente como parâmetro
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.saldo = 0.00;
		this.setCliente(cliente);
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		sacar(valor);
		contaDestino.depositar(valor);  
	}
	
	protected void imprimirInfos() {
		System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: 00%d", this.agencia));
		System.out.println(String.format("Numero: 00%d", this.numero));
		System.out.println(String.format("Saldo: R$ %.2f", this.saldo));		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
