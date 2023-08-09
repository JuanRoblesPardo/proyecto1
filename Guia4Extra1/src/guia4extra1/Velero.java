
package guia4extra1;


public class Velero extends Barco {
    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles, String matricula, double eslora, int anioFab) {
        super(matricula, eslora, anioFab);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public double calculoModulo() {
        return super.calculoModulo()+mastiles;
        
    }
    
    
}
