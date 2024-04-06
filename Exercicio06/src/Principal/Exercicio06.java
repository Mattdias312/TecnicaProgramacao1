
package Principal;


public class Exercicio06 {

    
    public static void main(String[] args) {
        Cliente novo;
        novo = new Cliente("Lucas", 318075718, "rua");
        ContaBancaria conta = new ContaBancaria(novo, TipoDaConta.CC);
        conta.depositar(100);
        System.out.println(conta.verificaSaldo());
        conta.retirar(50);
        System.out.println(conta.verificaSaldo());
        conta.taxas();
        System.out.println(conta.verificaSaldo());
        System.out.println(conta.extrato());
        
        ContaBancaria conta2 = new ContaBancaria(novo, TipoDaConta.CP);
        conta2.depositar(100);
        System.out.println(conta2.verificaSaldo());
        conta2.retirar(50);
        System.out.println(conta2.verificaSaldo());
        conta2.taxas();
        System.out.println(conta2.verificaSaldo());
        System.out.println(conta2.extrato());
        

        
        
    }
    
}
