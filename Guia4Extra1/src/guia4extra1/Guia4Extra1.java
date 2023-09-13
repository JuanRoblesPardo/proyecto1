
package guia4extra1;

import java.time.LocalDate;


public class Guia4Extra1 {

    public static void main(String[] args) {
               
        Barco B2=new Velero(4,"Sd204AS",6,2003);
        Alquiler A2=new Alquiler("Daniel",31088043,LocalDate.of(2023, 5, 1),LocalDate.of(2023, 5, 11),3,B2);
        System.out.println("EL IMPORTE FINAL PARA VELERO ES: "+A2.calculoImporteFinal());
        System.out.println("- - - - - - - - - -");
        
        Barco B3=new BarcoaMotor(65,"AB204AS",6,2010);
        Alquiler A3=new Alquiler("Daniel",31088043,LocalDate.of(2023, 5, 1),LocalDate.of(2023, 5, 11),3,B3);
        System.out.println("EL IMPORTE FINAL PARA BARCO A MOTORES ELECTRICOSpo: "+A3.calculoImporteFinal());
        System.out.println("- - - - - - - - - -");
        
        
        Barco B4=new Yate(3,100,"IU100ES",4,2013);
        Alquiler A4=new Alquiler("Daniel",31088043,LocalDate.of(2023, 5, 1),LocalDate.of(2023, 5, 11),3,B4);
        System.out.println("EL IMPORTE FINAL PARA YATE ES: "+A4.calculoImporteFinal());
        System.out.println("- - - - - - - - - -");
    }
    
}
