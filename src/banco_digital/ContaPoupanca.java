package banco_digital;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		// Passa o valor recebido como parametro para a classe pai
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta poupança");
		imprimirInfos();
	}
	
}
