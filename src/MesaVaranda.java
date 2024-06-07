import javax.swing.JOptionPane;
public class MesaVaranda extends Mesa{
    private static int numero = 100;
    MesaVaranda() {
        this.numeroDaMesa = numero++;
        this.status = "Disponível";
        this.localDaMesa = "Varanda";
        JOptionPane.showMessageDialog(null, "Mesa número " + this.numeroDaMesa + " foi colocada na varanda.");
    }

}
