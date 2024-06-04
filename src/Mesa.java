import javax.swing.JOptionPane;
public class Mesa {
    protected int numeroDaMesa;
    protected int numeroDeCadeiras;
    protected String localDaMesa;
    protected String status;

    Mesa(){
    }
    public int getNumeroDaMesa() {
        return numeroDaMesa;
    }

    public int getNumeroDeCadeiras() {
        return numeroDeCadeiras;
    }

    public String getLocalDaMesa() {
        return localDaMesa;
    }

    public String getStatus() {
        return status;
    }
    public void setNumeroDaMesa(int numeroDaMesa) {
        this.numeroDaMesa = numeroDaMesa;
    }

    public void setNumeroDeCadeiras(int numeroDeCadeiras) {
        this.numeroDeCadeiras = numeroDeCadeiras;
    }

    public void setLocalDaMesa(String localDaMesa) {
        this.localDaMesa = localDaMesa;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String toString(){
        return "Dados da mesa\nNúmero: " + this.numeroDaMesa + "\nCadeiras: " + this.numeroDeCadeiras + "\nLocal: " + this.localDaMesa + "\nStatus: " + this.status;
    }

}
