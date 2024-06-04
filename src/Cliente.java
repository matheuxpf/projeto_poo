import javax.swing.JOptionPane;
public class Cliente extends Pessoa{
    protected Mesa mesa;
    protected static int codigo = 1;
    protected int codigoDeAtendimento;
    protected char status;

    Cliente(String nome, String telefone){
        this.codigoDeAtendimento = codigo++;
        this.nome = nome;
        this.telefone = telefone;
        this.entradaCliente();
        JOptionPane.showMessageDialog(null, "Cliente " + this.nome + " está sem mesa.\nAtendimento cód. " + this.codigoDeAtendimento);
    }

    Cliente(String nome, String telefone, Mesa mesa){
        this.codigoDeAtendimento = codigo++;
        this.nome = nome;
        this.telefone = telefone;
        this.mesa = mesa;
        this.entradaCliente();
        JOptionPane.showMessageDialog(null, "Cliente " + this.nome + " pediu uma mesa. " + "\nAtendimento cód. " + this.codigoDeAtendimento);
        JOptionPane.showMessageDialog(null, "Alocando mesa número " + mesa.getNumeroDaMesa() + " para o cliente " + this.nome + ".");
        mesa.setStatus("Indisponível");
    }

    public int getCodigoDeAtendimento() {
        return this.codigoDeAtendimento;
    }
    public Mesa getMesa() {
        return this.mesa;
    }

    public void setCodigoDeAtendimento(int codigoDeAtendimento) {
        this.codigoDeAtendimento = codigoDeAtendimento;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
        JOptionPane.showMessageDialog(null, "Alocando mesa número " + mesa.getNumeroDaMesa() + " para o cliente " + this.nome + ".");
        mesa.setStatus("Indisponível");
    }
    public void entradaCliente(){
        this.status = 'P';
        JOptionPane.showMessageDialog(null, "Cliente " + this.nome + " entrou no restaurante.");
    }
    public void saidaCliente(){
        this.status = 'A';
        JOptionPane.showMessageDialog(null, "Cliente " + this.nome + " saiu do restaurante.");
    }

    public String printStatus(){
        if(this.status == 'P'){
            return "Em atendimento (Cód: " + this.codigoDeAtendimento + ")";
        }
        else return "Ausente";
    }
    public String toString(){
        return "Dados do cliente\nNome: " + this.nome + "\nMesa: " + this.mesa.getNumeroDaMesa() + "\nStatus: " + this.printStatus();
    }

}
