public class ContaCorrente {
   public String nome = "nome do cliente";
   public float saldo = 100;

   public ContaCorrente( ){
       System.out.println("Instanciando um objeto do tipo contaCorrente");
   }
    public float verificarSaldo(){
        System.out.println("Saldo: " + saldo);
        return saldo;
    }
    public void depositarValor(float valor){
        saldo+= valor;
    }
    public void retiarSaldo(float sacar){
       if (saldo >= sacar){
           saldo -= sacar;
           System.out.println("Saque realizado com sucesso");
       }else{
           System.out.println("Saldo insuficiente");
       }
    }



}
