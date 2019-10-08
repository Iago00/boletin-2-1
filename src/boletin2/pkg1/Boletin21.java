/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg1;

import java.util.Scanner;

/**
 *
 * @author ipampillonvieitez
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc = new Scanner(System.in);
       float pTarifa,pPagado;
       System.out.println("dame precio tarifa");
      pTarifa = sc.nextFloat();
      System.out.println("dame precio pagado");
      pPagado = sc.nextFloat();
      float desconto = 100- (pPagado / pTarifa * 100);
      System.out.println("descuento = "+ desconto + "%");
       
        
        
        
    }
    
}
