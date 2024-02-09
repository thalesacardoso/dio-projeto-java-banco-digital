package banco_digital;

public class Main {

	public static void main(String[] args) {
		
		Cliente thales = new Cliente();
		thales.setNome("Thales Cardoso");
		
		// Cria uma instância passando como parâmetro um objeto do tipo Cliente.
		Conta contac = new ContaCorrente(thales);
		Conta contap = new ContaPoupanca(thales);
		
		contac.depositar(50000);
		contac.sacar(500);
		contac.transferir(1500, contap);
		
		contac.imprimirExtrato();
		contap.imprimirExtrato();
	}

}
