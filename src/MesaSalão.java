import javax.swing.JOptionPane;
public class MesaSalão extends Mesa{
    protected static int numero = 1000;
    MesaSalão(int numeroDeCadeiras) {
        this.numeroDaMesa = numero++;
        this.status = "Disponível";
        this.numeroDeCadeiras = numeroDeCadeiras;
        this.localDaMesa = "Salão";
        JOptionPane.showMessageDialog(null, "Mesa número " + this.numeroDaMesa + " foi colocada no salão.");
    }
}
