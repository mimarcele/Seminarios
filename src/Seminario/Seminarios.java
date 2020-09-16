package Seminario;

public class Seminarios extends Pessoa{
    private boolean apresentou;

    public void Apresentar(){
        if(this.apresentou == true){
            System.out.println (this.getNome () + " espere a avaliação da sua nota" );
        } else if (this.apresentou == false){
            System.out.println (this.getNome () + " sua apresentação será a próxima" );
        }
    }


    public void setApresentou(boolean apresentou){
        this.apresentou = apresentou;
    }
    public boolean getApresentou(){
        return this.apresentou;
    }
    }