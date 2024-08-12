package br.com.dio.banco;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Pedro");

        Conta cc = new ContaCorrente(cliente);
        cc.depositar(90);


        Conta poupanca = new ContaPoupanca(cliente);

        cc.transferir(20,poupanca);

        cc.imprimirExtrato();

        poupanca.imprimirExtrato();
    }
}
