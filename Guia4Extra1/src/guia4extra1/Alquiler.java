/*Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del amarre y
el barco que lo ocupará.*/
package guia4extra1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Alquiler {
    protected String nombre;
    protected int dni;
    protected LocalDate finicial;
    protected LocalDate fdevolucion;
    protected int amarre;
    protected Barco tipo;
    
    public Alquiler() {
    }

    public Alquiler(String nombre, int dni, LocalDate finicial, LocalDate fdevolucion, int amarre, Barco tipo) {
        this.nombre = nombre;
        this.dni = dni;
        this.finicial = finicial;
        this.fdevolucion = fdevolucion;
        this.amarre = amarre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFinicial() {
        return finicial;
    }

    public void setFinicial(LocalDate finicial) {
        this.finicial = finicial;
    }

    public LocalDate getFdevolucion() {
        return fdevolucion;
    }

    public void setFdevolucion(LocalDate fdevolucion) {
        this.fdevolucion = fdevolucion;
    }

    public int getAmarre() {
        return amarre;
    }

    public void setAmarre(int amarre) {
        this.amarre = amarre;
    }

    public Barco getTipo() {
        return tipo;
    }

    public void setTipo(Barco tipo) {
        this.tipo = tipo;
    }
 
    public int dias (){
     return ((int)ChronoUnit.DAYS.between(this.finicial,this.fdevolucion));
    }
    
    public double calculoImporteFinal(){
    return dias()*tipo.calculoModulo();
    } 
}
