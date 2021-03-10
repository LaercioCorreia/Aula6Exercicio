
package SistemaBiblioteca;


public class Livro {
   
   private String nome;
   private String autor;
   private int ano;
   private double preco;
   public int escolha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public Livro(){

}
    
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
       
    
   public double verificarDesconto(){
       
      
       
        if (this.preco >= 80 && escolha == 1){
           
            preco = preco - (preco * 0.20);
            System.out.println("Você possui desconto de 20%");
        
        } else {
            preco = preco;
            
       }
    
       if (this.preco >= 80 && escolha == 2){
            preco = preco - (preco * 0.10);
            System.out.println("Você possui desconto de 10%");
        
        } else  {
            preco = preco;
        }
   return preco;
  
}
            
        @Override
        public String toString(){
               return  "******************************************" +
                       "\n" + "O NOME DO LIVRO É: " + this.nome + "\n" 
                       +"o AUTOR DO LIVRO É: "+ this.autor + "\n"
                       + "O ANO DO LIVRO É: " + this.ano + "\n"
                       + "O PREÇO DO LIVRO É: " +"R$" + this.preco + "\n"
                       + "PREÇO FINAL DO LIVRO É: R$" 
                       + verificarDesconto();
                       
                       
           }
                    
        }
        

      
 
     


