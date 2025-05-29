package principal;

import javax.swing.JOptionPane;
import model.Veiculo;

/**
 *
 * @author Lorenzo
 */
public class Principal {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        
        v1.setQuilometros(Integer.parseInt(JOptionPane.showInputDialog("Digite os quil�metros percorridos:")));
        v1.setLitros(Integer.parseInt(JOptionPane.showInputDialog("Digite os litros consumidos:")));
        
        JOptionPane.showMessageDialog(null, "O consumo de " + v1.getConsumo() + " km/l");
    }
}
