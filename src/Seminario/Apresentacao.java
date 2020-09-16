package Seminario;

public class Apresentacao {
    public static void main(String[] args) {
        Aluno n1 = new Aluno ();
        n1.setNome ("Lucas");
        n1.setIdade (20);
        n1.setMateria ("Física");
        n1.setTema ("Importância da experimentação no ensino de física");
        n1.setIdentificacao (201867921);
        n1.Apresentar ();
        n1.setApresentou (true);
        n1.Mostrar ();

        Professor p1 = new Professor ();
        p1.setNome ("Claudio");
        p1.setIdentificacao (20004382);
        p1.setMateria ("Física");
        p1.setNota (10);
        p1.Avaliar ();


        Aluno n2= new Aluno ();
        n2.setNome ("Clara");
        n2.setIdade (21);
        n2.setMateria ("Programação- Java");
        n2.setTema ("Programação orientada a objeto");
        n2.setIdentificacao (2019647244);
        n2.Apresentar ();
        n2.setApresentou (false);
        n2.Mostrar ();

        Professor p2 = new Professor ();
        p2.setNome ("Giselle");
        p2.setIdentificacao (200145367);
        p2.setMateria ("Programação");
        p2.setNota (8);
        p2.Avaliar ();



    }

}
