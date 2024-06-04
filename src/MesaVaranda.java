import javax.swing.JOptionPane;
public class MesaVaranda extends Mesa{
    protected static int numero = 100;
    MesaVaranda(int numeroDeCadeiras) {
        this.numeroDaMesa = numero++;
        this.status = "Disponível";
        this.numeroDeCadeiras = numeroDeCadeiras;
        this.localDaMesa = "Varanda";
        JOptionPane.showMessageDialog(null, "Mesa número " + this.numeroDaMesa + " foi colocada na varanda.");
    }

}
