import javax.swing.JOptionPane;

public class ItemDoMenu {
    private String nome;
    private String descrição;
    private double valor;
    private int estoque;
    private static int codigo = 0;
    private int codigoDoItem;
    private char status = '1';

    ItemDoMenu(String nome, String descrição, double valor, int estoque) {
        this.codigoDoItem = codigo++;
        this.nome = nome;
        this.descrição = descrição;
        this.valor = valor;
        this.estoque = estoque;
        this.status = estoque > 0 ? '1' : '0';
    }

    ItemDoMenu(String nome, double valor, int estoque) {
        this.codigoDoItem = codigo++;
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
        this.status = estoque > 0 ? '1' : '0';
    }

    public String getNome() {
        return nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public int getCodigoDoItem() {
        return codigoDoItem;
    }

    public char getStatus() {
        return status;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
        this.status = estoque > 0 ? '1' : '0';
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public void setCodigoDoItem(int codigoDoItem) {
        this.codigoDoItem = codigoDoItem;
    }

    public void verificaEstoque() {
        if (this.estoque > 0) {
            JOptionPane.showMessageDialog(null, this.getNome() + " está em estoque.");
        } else {
            JOptionPane.showMessageDialog(null, this.getNome() + " não está em estoque.");
        }
    }

    public void diminuiEstoque() {
        this.estoque -= 1;
        this.status = this.estoque > 0 ? '1' : '0';
    }

    public void aumentaEstoque(int numero) {
        this.estoque += numero;
        this.status = '1';
        JOptionPane.showMessageDialog(null, "Estoque do item '" + this.getNome() + "' atualizado. (" + this.estoque + ")");
    }

    @Override
    public String toString() {
        return "Dados do Item: \nNome:" + this.nome + "\nDescrição: " + this.descrição + "\nValor: " + this.valor +
                "\nQuantidade em Estoque: " + this.estoque + "\nCódigo: " + this.codigoDoItem;
    }
}
