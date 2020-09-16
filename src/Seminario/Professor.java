package Seminario;

public class Professor extends Pessoa {
    private double nota;
    private boolean apresentou;



    public void Avaliar() {
        System.out.println ("===== RELATORIO PROFESSOR UERJ 2020 =====");
        System.out.println ("Nome do avaliador: " + this.getNome () );
        System.out.println ("Professor de: " + this.getMateria () );
        System.out.println ("Número de identificação: " + this.getIdentificacao () );
        if(nota == 10){
            System.out.println ("Sua apresentação foi PERFEITA!" );
        }
        else if( nota >= 7){
            System.out.println ("Boa apresentação!" );
        } else{
            System.out.println ( "Sua apresentação deixou a desejar" );
        }
    }

    public void Apresentar(){
        if(this.apresentou == true){
            System.out.println (this.getNome () + " espere a avaliação da sua nota" );
        } else{
            System.out.println (this.getNome () + " sua apresentação será a próxima" );
        }
    }

    public void setNota(double nota){
        this.nota = nota;

    }
    public double getNota(){
        return this.nota;
    }
    public void setApresentou(boolean apresentou){
        this.apresentou = apresentou;
    }
    public boolean getApresentou(){
        return this.apresentou;
    }
}
