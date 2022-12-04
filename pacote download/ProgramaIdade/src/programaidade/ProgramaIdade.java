/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o seu ano de nascimento: ");
        int nasc = teclado.nextInt();
        int i = Integer.parseInt(String.valueOf(Calendar.getInstance().get(Calendar.YEAR))) - nasc;
        
        if (i>=18){
            System.out.println("Maior de idade!");
        } else{
            System.out.println("Menor de idade!");
        }
        
    }
    
}
