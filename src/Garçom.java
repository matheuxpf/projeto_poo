import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Garçom extends Pessoa {
    protected static int numero = 1000;
    private int matricula;
    private double salario;
    private ArrayList<Mesa> mesas;
    private ArrayList<Pedido> pedidos;

    Garçom(String nome, String cpf, double salario) {
        this.matricula = numero++;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.mesas = new ArrayList<>();
        this.pedidos = new ArrayList<>();
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

    public void atribuirMesa(Mesa mesa) {
        mesas.add(mesa);
    }

    public Pedido realizarPedido(Mesa mesa, ItemDoMenu... itens) {
        StringBuilder mensagemErro = new StringBuilder();

        for (ItemDoMenu item : itens) {
            if (item.getStatus() == '0') {
                mensagemErro.append("Item ").append(item.getNome()).append(" não está em estoque.\n");
            }
        }

        if (mensagemErro.length() > 0) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar o pedido para a mesa " + mesa.getNumeroDaMesa() + " pois:\n" + mensagemErro.toString());
            return null;
        } else {
            ArrayList<ItemDoMenu> itensDoPedido = new ArrayList<>();
            for (ItemDoMenu item : itens) {
                itensDoPedido.add(item);
                item.diminuiEstoque();
            }
            Pedido pedido = new Pedido(mesa, itensDoPedido);
            pedidos.add(pedido);
            mesa.adicionarPedido(pedido);
            return pedido;
        }
    }

    public void printPedidos() {
        StringBuilder todosPedidos = new StringBuilder();
        todosPedidos.append("Lista de Pedidos:\n");
        for (Pedido pedido : pedidos) {
            todosPedidos.append(pedido.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, todosPedidos.toString());
    }

    @Override
    public String toString() {
        return "Dados do garçom\nNome: " + this.nome + "\nMatricula: " + this.matricula + "\nSalário: " + this.salario;
    }
}
