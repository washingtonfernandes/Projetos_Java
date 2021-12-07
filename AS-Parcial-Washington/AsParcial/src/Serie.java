import java.util.Objects;
import java.util.Scanner;

public class Serie {

    public String titulo;
    public String sinopse;
    public int temporadas;
    public int episodios;
    public boolean assistida;
    public int qtdEpisodios;


    public void lerDados(){
        System.out.println("Informe o titulo");
        Scanner tc = new Scanner(System.in);
        titulo=tc.next();
    }

    public void exibeDados() {
        System.out.println(this.titulo);
        System.out.println(this.sinopse);
        System.out.println(this.qtdEpisodios);
        System.out.println(this.temporadas);
        System.out.println(this.assistida);
    }

    //----------CONSTRUTORES
    public Serie(int episodios){
        this.qtdEpisodios=episodios;
        System.out.println("Criando o objeto...");
    }

    public Serie(String nome){
        this.titulo=nome;
    }

    public Serie(){

    }

    //----------GETTER - SETTERS
    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int qtdEpisodios) {
        this.qtdEpisodios = qtdEpisodios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie livro = (Serie) o;
        return Objects.equals(titulo, livro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
