import javax.swing.JOptionPane;
import java.util.ArrayList;
public class Menu {
    private ArrayList <ItemDoMenu> itensDoMenu = new ArrayList<ItemDoMenu>();

    Menu(){
    }

    public ArrayList<ItemDoMenu> getItensDoMenu() {
        return itensDoMenu;
    }
    public void printMenu(){
        StringBuilder itensMenu = new StringBuilder();
        itensMenu.append("Menu: ").append("\n");
        for(ItemDoMenu itemDoMenu : itensDoMenu){
            itensMenu.append(itemDoMenu.getNome()).append(" > Valor: R$").append(itemDoMenu.getValor()).append("\n");
        }
        JOptionPane.showMessageDialog(null, itensMenu.toString());
    }
    public void adicionaItem(ItemDoMenu itemDoMenu){
        itensDoMenu.add(itemDoMenu);
        JOptionPane.showMessageDialog(null, "" + itemDoMenu.getNome() + " adicionado ao Menu.");
    }


}
