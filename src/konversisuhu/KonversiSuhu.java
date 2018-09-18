/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhu;
import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class KonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Muhammad Yusu Ragil Syah An Naas/33/XRPL6");
        float C, R, F, K;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan Suhu dalam Celcius: ");
        C = masukan.nextFloat();
        R = 4*C/5;
        System.out.println("Reamur= "+R);
        F = (9*C/5)+32;
        System.out.println("Fahrenheit= "+F);
        K = C+273;
        System.out.println("Kelvin= "+K);
    }
    
}
