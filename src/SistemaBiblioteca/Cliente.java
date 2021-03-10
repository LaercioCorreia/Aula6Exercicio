
package SistemaBiblioteca;


public class Cliente {
    private String nome;
    private String bairro;
    private String cidade;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente() {
    
    }
      @Override
        public String toString(){
               return this.nome + "\n" 
                       + this.bairro + "\n" 
                       + this.cidade + "\n"
                       + this.telefone + "\n";
                       
    
    
}
}
