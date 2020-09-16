package Seminario;


import java.util.Scanner;

public class Aluno extends Pessoa{
    private String tema;

    /* public void Apresentar(){
       Scanner scan = new Scanner (System.in);
       String txt;
       String tema;
        System.out.println ("Digite seu nome: ");
        txt = scan.nextLine ();
       System.out.println (txt + ", digite o tema do seu seminário: " );
       tema = scan.nextLine ();
       System.out.println (txt + ", boa sorte na apresentação de " + tema );

  }         */
    public void Apresentar(){
        System.out.println ("===== APRESENTAÇÕES UERJ 2020 =====" );
        System.out.println ("Aluno: " + this.getNome () );
        System.out.println ("Idade: " + this.getIdade () );
        System.out.println ("Número de identificação: " + this.getIdentificacao () );
        System.out.println ("Curso: " + this.getMateria () );
        System.out.println ("Tema: " + this.getTema () );
    }
    public void Mostrar(){
        if(getApresentou () == true){
            System.out.println ("Estou aguardando a liberação da minha nota" );
        } else{
            System.out.println ("Estou aguardando o meu avaliador" );
        }
    }


    public void setTema(String tema){
        this.tema = tema;
    }
    public String getTema(){
        return this.tema;
    }
}
