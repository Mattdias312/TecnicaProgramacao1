
package heranca;

public class Funcionario extends Pessoa {
    
    private String cargo;
    private float salario;
    
    public Funcionario(String nome) {
        super(nome);
    }
    
    public Funcionario(String nome,String cargo) {
        this(nome);
        this.cargo = cargo;
    }
    
    public Funcionario(String nome, String cargo, float salario) {
        this(nome,cargo);
        this.salario = salario;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public float getSalario(){
        return salario;
    }
    
    public void setSalario(float salario){
        this.salario = salario;
    }
    
    public float calculaSalario(){
        return getSalario();
    }
    
}
