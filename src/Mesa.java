import javax.swing.JOptionPane;
import java.util.ArrayList;

public abstract class Mesa {
    protected int numeroDaMesa;
    protected String localDaMesa;
    protected String status;
    protected ArrayList<Pedido> pedidos;

    Mesa() {
        this.pedidos = new ArrayList<>();
    }

    public int getNumeroDaMesa() {
        return numeroDaMesa;
    }

    public String getLocalDaMesa() {
        return localDaMesa;
    }

    public String getStatus() {
        return status;
    }

    public void setNumeroDaMesa(int numeroDaMesa) {
        this.numeroDaMesa = numeroDaMesa;
    }

    public void setLocalDaMesa(String localDaMesa) {
        this.localDaMesa = localDaMesa;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void adicionarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public void calcularContaEmitirFatura() {
        Conta conta = new Conta(pedidos);
        conta.emitirConta();
    }

    public String toString() {
        return "Dados da mesa\nNúmero: " + this.numeroDaMesa + "\nLocal: " + this.localDaMesa + "\nStatus: " + this.status;
    }
}
