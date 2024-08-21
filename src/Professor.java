public class Professor {
    private String nome;
    private String endereco;
    private String titulacao;

    public Professor(String nome, String endereco, String titulacao){
        this.nome = nome;
        this.endereco = endereco;
        this.titulacao = titulacao;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getTitulacao(){
        return titulacao;
    }

    public void setTitulacao(String titulacao){
        this.titulacao = titulacao;
    }
}
