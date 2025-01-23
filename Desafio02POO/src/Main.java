import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Cliente vitor = new Cliente();
        vitor.setNome("Vitor");


        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(vitor);

        List<Conta> contas = new ArrayList<Conta>();
        contas.add(cc);
        contas.add(poupanca);

        Banco Itau = new Banco( "Itau", contas);
        Itau.listarContas();

//        cc.depositar(100);
//
//        cc.transferir(100, poupanca);
//
//        cc.imprimirExtrato();
//        poupanca.imprimirExtrato();

    }
}
