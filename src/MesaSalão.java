import javax.swing.JOptionPane;
public class MesaSalão extends Mesa{
    private static int numero = 1000;
    MesaSalão() {
        this.numeroDaMesa = numero++;
        this.status = "Disponível";
        this.localDaMesa = "Salão";
        JOptionPane.showMessageDialog(null, "Mesa número " + this.numeroDaMesa + " foi colocada no salão.");
    }
}
