package model;

/**
 *
 * @author Lorenzo
 */
public class Veiculo {

    private int quilometros;
    private int litros;

    public Veiculo() {
        this(0, 0);
    }

    public Veiculo(int quilometros, int litros) {
        this.quilometros = quilometros;
        this.litros = litros;
    }

    public int getQuilometros() {
        return quilometros;
    }

    public void setQuilometros(int quilometros) {
        this.quilometros = quilometros;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public double getConsumo() {
        return quilometros / litros;
    }
}
