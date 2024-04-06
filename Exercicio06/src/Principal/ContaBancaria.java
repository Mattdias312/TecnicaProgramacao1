
package Principal;

import java.util.ArrayList;
import java.util.List;


public class ContaBancaria {
    private List cliente = new ArrayList<Cliente>();
    private float saldoConta;
    private StatusConta statusConta;
    private TipoDaConta tipoDaConta;
    private String historioExtrato;
    
    public ContaBancaria (Cliente cliente, TipoDaConta tipoDaConta){
        this.cliente.add(cliente);
        this.tipoDaConta = tipoDaConta;
        this.statusConta = StatusConta.A;
        this.saldoConta = 0;
        this.historioExtrato ="";
    }
     public Object getCliente(){
        return this.cliente.get(0);
     }
     public void setCliente(String cliente){
        this.cliente.add(cliente);
     }
     public Enum getTipoDaConta(){
        return this.tipoDaConta;
     }

    public StatusConta getStatusConta() {
        return statusConta;
    }

    public void setTipoDaConta(TipoDaConta tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

    public void setStatusConta(StatusConta statusConta) {
        this.statusConta = statusConta;
    }
     public Float getsaldoConta(){
        return this.saldoConta;
     }
     public void setsaldoConta(Float saldoConta){
        this.saldoConta=saldoConta;
     }
     public String gethistorioExtrato(){
        return this.historioExtrato;
     }
     public void sethistorioExtrato(String historioExtrato){
        this.historioExtrato=historioExtrato;
     }

     public void depositar(float depositar){
         this.saldoConta += depositar;
         this.historioExtrato +="+ " + depositar+ "\n";
     }     

     public void retirar(float retirar){
         this.saldoConta -= retirar;
         this.historioExtrato +="- " + retirar+ "\n";
     }

     public void taxas(){
         
         if(getTipoDaConta().equals(TipoDaConta.CC)){
         this.saldoConta -= 19.99;
         this.historioExtrato +="- " + 19.99+ "\n";    
         } else {
         this.saldoConta -= 9.99;
         this.historioExtrato +="- " + 9.99+ "\n";    
         }
     }
     
     public float verificaSaldo(){
         return getsaldoConta();
     }
     
     public String extrato(){
         return gethistorioExtrato() + "Saldo atual: " + verificaSaldo();
     }
     
}
