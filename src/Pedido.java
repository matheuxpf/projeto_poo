import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemDoMenu> itensDoPedido;
    private Mesa mesa;
    private static int num = 1;
    private int numPedido;

    Pedido(Mesa mesa, ArrayList<ItemDoMenu> itens) {
        this.mesa = mesa;
        this.itensDoPedido = new ArrayList<>(itens);
        this.numPedido = num++;
        StringBuilder itensNomes = new StringBuilder();
        for (ItemDoMenu item : itens) {
            itensNomes.append(item.getNome()).append(", ");
        }
        String itensNomesStr = itensNomes.toString();
        itensNomesStr = itensNomesStr.substring(0, itensNomesStr.length() - 2);

        if (itens.size() == 1) {
            JOptionPane.showMessageDialog(null, "Item " + itensNomesStr + " foi adicionado ao pedido número " + this.numPedido + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Itens " + itensNomesStr + " foram adicionados ao pedido número " + this.numPedido + ".");
        }
    }

    public Mesa getMesa() {
        return mesa;
    }

    public int getNumPedido() {
        return numPedido;
    }
    public ArrayList<ItemDoMenu> getItensDoPedido() {
        return itensDoPedido;
    }

    public void printPedido() {
        StringBuilder printPedido = new StringBuilder();
        printPedido.append("Pedido número ").append(this.numPedido).append(" da mesa ").append(mesa.getNumeroDaMesa()).append(":\n");
        for (ItemDoMenu itemDoMenu : itensDoPedido) {
            printPedido.append(itemDoMenu.getNome()).append("\n");
        }
        JOptionPane.showMessageDialog(null, printPedido.toString());
    }

    public double calcularTotalPedido() {
        double total = 0;
        for (ItemDoMenu item : itensDoPedido) {
            total += item.getValor();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder printPedido = new StringBuilder();
        printPedido.append("Pedido número ").append(this.numPedido).append(" da mesa ").append(mesa.getNumeroDaMesa()).append(":\n");
        for (ItemDoMenu itemDoMenu : itensDoPedido) {
            printPedido.append(itemDoMenu.getNome()).append("\n");
        }
        return printPedido.toString();
    }
}
