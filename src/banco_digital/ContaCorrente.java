package banco_digital;

public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		// Passa o valor recebido como parametro para a classe pai
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta corrente");
		imprimirInfos();
	}
	
}
