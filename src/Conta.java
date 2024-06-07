import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Conta {
    private static int numero = 0;
    private int numeroDaConta;
    private ArrayList<Pedido> pedidos;

    public Conta(ArrayList<Pedido> pedidos) {
        this.numeroDaConta = numero++;
        this.pedidos = pedidos;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Pedido pedido : pedidos) {
            total += pedido.calcularTotalPedido();
        }
        return total;
    }

    public void emitirConta() {
        double total = calcularTotal();
        StringBuilder detalhesConta = new StringBuilder();
        detalhesConta.append("Detalhes da conta:\n");
        for (Pedido pedido : pedidos) {
            detalhesConta.append("Pedido número ").append(pedido.getNumPedido()).append(":\n");
            for (ItemDoMenu item : pedido.getItensDoPedido()) {
                detalhesConta.append("- ").append(item.getNome()).append(": R$").append(item.getValor()).append("\n");
            }
        }
        detalhesConta.append("\nTotal da conta: R$").append(total);

        String mensagem = detalhesConta.toString() + "\n\nFormas de pagamento disponíveis:\n1. Dinheiro\n2. Cartão de crédito\n3. Cartão de débito";
        int opcaoPagamento = JOptionPane.showOptionDialog(null, mensagem, "Conta", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[]{"Dinheiro", "Cartão de Crédito", "Cartão de Débito"}, null);
        if (opcaoPagamento != JOptionPane.CLOSED_OPTION) {
            String formaPagamento = "";
            switch (opcaoPagamento) {
                case 0:
                    formaPagamento = "Dinheiro";
                    break;
                case 1:
                    formaPagamento = "Cartão de Crédito";
                    break;
                case 2:
                    formaPagamento = "Cartão de Débito";
                    break;
                default:
                    formaPagamento = "Forma de pagamento não reconhecida";
            }
            JOptionPane.showMessageDialog(null, "Pagamento realizado com sucesso através de " + formaPagamento + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Pagamento cancelado.");
        }
    }

}
