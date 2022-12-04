package tiposprimitivos;

import java.io.PrintStream;
import java.util.Scanner;

public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        
        System.out.print("Digite o Nome do Aluno: ");
        String nome = teclado.nextLine();
        
        System.out.print("Digite a Nota do Aluno: ");
        float nota = teclado.nextFloat();
        
        System.out.print ("Digite a Idade do aluno: ");
        int idade = teclado.nextInt();
        
        
        System.out.println("A nota é "+ nota);
        PrintStream printf = System.out.printf("O aluno(a) %s tem %d anos e tirou a nota %.2f \n",nome,idade,nota);
        System.out.format("O aluno %s foi \n",nome);
    }
        
}
