
package guia4extra1;


public class Yate extends BarcoaMotor {
    private int camarote;

    public Yate() {
    }

    public Yate(int camarote, int cv, String matricula, double eslora, int anioFab) {
        super(cv, matricula, eslora, anioFab);
        this.camarote = camarote;
    }

    public int getCamarote() {
        return camarote;
    }

    public void setCamarote(int camarote) {
        this.camarote = camarote;
    }

    @Override
    public double calculoModulo() {
        return super.calculoModulo()+camarote;
    }
    
    
}
