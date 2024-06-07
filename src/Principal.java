import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Principal {
 public static void main(String[] args) {
  Mesa mesa1 = new MesaVaranda();
  JOptionPane.showMessageDialog(null, mesa1);

  Garçom garçom1 = new Garçom("João", "451.994.631-00", 2200.00);
  garçom1.atribuirMesa(mesa1);

  Menu menu = new Menu();
  ItemDoMenu águaComGás = new ItemDoMenu("Água com Gás", "Garrafa de água gaseificada", 4.5, 5);
  menu.adicionaItem(águaComGás);
  ItemDoMenu cocaCola = new ItemDoMenu("Coca-cola", "Refrigerante coca-cola", 5.0, 2);
  menu.adicionaItem(cocaCola);
  menu.printMenu();

  garçom1.realizarPedido(mesa1, águaComGás, cocaCola);

  garçom1.realizarPedido(mesa1, cocaCola);

  garçom1.printPedidos();
  cocaCola.verificaEstoque();

  garçom1.realizarPedido(mesa1, cocaCola);

  mesa1.calcularContaEmitirFatura();
 }
}
