//Pedido, Menu
import javax.swing.JOptionPane;
public class Principal{
    public static void main(String args[]){

     Mesa mesa1 = new MesaVaranda(4);
     JOptionPane.showMessageDialog(null, mesa1);
     Cliente cliente1 = new Cliente("Matheus", "(62) 9 9991-2607", mesa1);
     JOptionPane.showMessageDialog(null, cliente1);
     Cliente cliente2 = new Cliente("Pedro", "(62) 9 91354-1301");
     Mesa mesa2 = new MesaSalão(5);
     cliente2.setMesa(mesa2);
     JOptionPane.showMessageDialog(null, cliente2);
     Garçom garçom1 = new Garçom("João", "451.994.631-00", 2200.00);
     garçom1.atribuirGarçom(cliente1);
     garçom1.atribuirGarçom(cliente2);
     garçom1.printClientes();
     JOptionPane.showMessageDialog(null, garçom1);
     cliente1.saidaCliente();
     garçom1.printClientes();
     Menu menu = new Menu();
     ItemDoMenu águaComGás = new ItemDoMenu("Água com Gás", "Garrafa de água gaseificada", 4.5, 134);
     menu.adicionaItem(águaComGás);
     ItemDoMenu cocaCola = new ItemDoMenu("Coca-cola", "Refrigerante coca-cola", 5.0, 121);
     menu.adicionaItem(cocaCola);
     menu.printMenu();


    }

}