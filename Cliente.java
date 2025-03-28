public class Cliente {
    public static void main(String[] args) {
        ContaCorrente contaMarvio = new ContaCorrente();
        contaMarvio.nome = "Marvio";
        contaMarvio.saldo = 1000;
        contaMarvio.verificarSaldo();
        System.out.println("Correntista: " + contaMarvio.nome);
        contaMarvio.retiarSaldo(500);
    }
}
