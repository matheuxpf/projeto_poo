import javax.swing.*;

public class ItemDoMenu {
    protected String nome;
    protected String descrição;
    protected double valor;
    protected int estoque;
    protected static int codigo = 0;
    protected int codigoDoItem;

    // DIVIDIR COMIDA E BEBIDA EM CLASSES QUE HERDAM ESSA

    ItemDoMenu(String nome, String descrição, double valor, int estoque){
        this.codigoDoItem = codigo++;
        this.nome = nome;
        this.descrição = descrição;
        this.valor = valor;
        this.estoque = estoque;
    }
    ItemDoMenu(String nome, double valor, int estoque){
        this.codigoDoItem = codigo++;
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
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
    }

    public void setCodigoDoItem(int codigoDoItem) {
        this.codigoDoItem = codigoDoItem;
    }

    public void verificaEstoque(){
        if(this.estoque > 0){
            JOptionPane.showMessageDialog(null, "" + this.getNome() + " está em estoque.");
        }
        else JOptionPane.showMessageDialog(null, "" + this.getNome() + " não está em estoque.");
    }

    public void aumentaEstoque(int numero){
        this.estoque += numero;
        JOptionPane.showMessageDialog(null, "Estoque do item '" + this.getNome() + "' atualizado. (" + this.estoque + ")");
    }

    public String toString(){
        return "Dados do Item: \nNome:" + this.nome + "\nDescrição: " + this.descrição + "\nValor: " + this.valor +
                "\nQuantidade em Estoque: " + this.estoque + "\nCódigo: " + this.codigoDoItem;
    }



}
