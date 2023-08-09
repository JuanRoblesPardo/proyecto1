
package guia4extra1;


public class BarcoaMotor extends Barco {
    protected int cv;

    public BarcoaMotor() {
    }

    public BarcoaMotor(int cv, String matricula, double eslora, int anioFab) {
        super(matricula, eslora, anioFab);
        this.cv = cv;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public double calculoModulo() {
        return super.calculoModulo()+cv; 
    }
    
    
}
