/* PROGRAMA OFERECE DESCONTO AO CLIENTE EM PREÇOS ACIMA DE 80 REAIS:

-> Se for estudante tem desconto de 20% no preço do livro.
-> Se não for estudante tem desconto de 10% no preço do livro

*/
package SistemaBiblioteca;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
       Scanner ler = new Scanner(System.in);
       
       Livro li = new Livro();
       Cliente cl = new Cliente();
       
        
        System.out.println("********SISTEMA BIBLIOTECA************");
       
        System.out.println ("\n" + "Digite o título do livro:");
        li.setNome(ler.nextLine());
        
        System.out.println ("Digite o nome do autor do livro:");
        li.setAutor(ler.nextLine());
        
        System.out.println ("Digite o ano do livro:");
        li.setAno(ler.nextInt());
        
        System.out.println ("Digite o preço do livro:");
        li.setPreco(ler.nextDouble());
        
        System.out.println ("VocÊ é estudante?" + "\n" + "1 -> SIM" + "\n" + "2 -> NÃO");
        li.escolha = ler.nextInt();
        
        System.out.println(li);
        
       
       
        
        
       
   
      
    }
    
}
