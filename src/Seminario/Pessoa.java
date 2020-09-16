package Seminario;

public abstract class Pessoa {
    //ATRIBUTOS
    private String nome;
    private int idade;
    private int identificacao;
    private String materia;
    private boolean apresentou;

    public Pessoa() {
        this.nome = this.getNome();
        this.idade = this.getIdade();
        this.materia = this.getMateria();
        this.identificacao = this.getIdentificacao();

    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdentificacao(int identificacao){
        this.identificacao = identificacao;
    }
    public int getIdentificacao(){
        return this.identificacao;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }
    public String getMateria(){
        return this.materia;
    }
    public void setApresentou(boolean apresentou){
        this.apresentou = apresentou;
    }
    public boolean getApresentou(){
        return this.apresentou;
    }



}