import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Garçom extends Pessoa{
    protected static int numero = 1000;
    protected int matricula;
    protected double salario;
    protected ArrayList <Cliente> clientes = new ArrayList<Cliente>();
    // QUERIA CONSEGUIR QUANDO O CLIENTE SAIR DO RESTAURANTE ELE SAIR DA LISTA DE CLIENTES DO GARÇOM...

    Garçom(String nome, String cpf, double salario){
        this.matricula = numero++;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        JOptionPane.showMessageDialog(null, "Garçom " + this.nome + " foi contratado.");
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void atribuirGarçom(Cliente cliente){
        clientes.add(cliente);
    }
    public void removeCliente(Cliente cliente){
        clientes.remove(cliente);
    }
    public void verificaClientes(){
        for (Cliente cliente : clientes){
            if(cliente.status == 'A'){
                removeCliente(cliente);
            }
        }
    }
    public void printClientes() {
        verificaClientes();
        StringBuilder nomesClientes = new StringBuilder();
        nomesClientes.append("Lista de Clientes do Garçom ").append(this.nome).append(":\n");
        for (Cliente cliente : clientes) {
            nomesClientes.append(cliente.getNome()).append("\n");
        }
        JOptionPane.showMessageDialog(null, nomesClientes.toString());
    }



    public String toString(){
        return "Dados do garçom\nNome: " + this.nome + "\nMatricula: " + this.matricula + "\nSalário: " + this.salario;
    }

}
