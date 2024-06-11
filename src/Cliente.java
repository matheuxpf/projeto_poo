import javax.swing.JOptionPane;

public class Cliente extends Pessoa {
    private static int codigo = 1;
    private int codigoDeAtendimento;
    private char status;
    private Mesa mesa;

    Cliente(String nome, String telefone, Mesa mesa) {
        this.codigoDeAtendimento = codigo++;
        this.nome = nome;
        this.telefone = telefone;
        this.mesa = mesa;
        this.entradaCliente();
        JOptionPane.showMessageDialog(null, "Cliente " + this.nome + " está sem mesa.\nAtendimento cód. " + this.codigoDeAtendimento);
    }

    public int getCodigoDeAtendimento() {
        return this.codigoDeAtendimento;
    }

    public char getStatus() {
        return this.status;
    }
    public Mesa getMesa(){
        return this.mesa;
    }
    public void setMesa(Mesa mesa){
        this.mesa = mesa;
    }

    public void setCodigoDeAtendimento(int codigoDeAtendimento) {
        this.codigoDeAtendimento = codigoDeAtendimento;
    }

    public void entradaCliente() {
        this.status = 'P';
        JOptionPane.showMessageDialog(null, "Cliente " + this.nome + " entrou no restaurante.");
    }

    public void saidaCliente() {
        this.status = 'A';
        JOptionPane.showMessageDialog(null, "Cliente " + this.nome + " saiu do restaurante.");
    }

    public String printStatus() {
        if (this.status == 'P') {
            return "Em atendimento (Cód: " + this.codigoDeAtendimento + ")";
        } else return "Ausente";
    }

    public String toString() {
        return "Dados do cliente\nNome: " + this.nome + "\nStatus: " + this.printStatus();
    }
}
