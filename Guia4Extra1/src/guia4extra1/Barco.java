
package guia4extra1;


public abstract class Barco {
    protected String matricula;
    protected double eslora;
    protected int anioFab;
    
    
    public Barco() {
    }

    public Barco(String matricula, double eslora, int anioFab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFab = anioFab;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(int anioFab) {
        this.anioFab = anioFab;
    }
    
    public double calculoModulo(){
        return 10*eslora;
           
        }
}
