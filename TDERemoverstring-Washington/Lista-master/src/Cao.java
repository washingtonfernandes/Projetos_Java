import java.util.Scanner;

public class Cao {
    public String nome;
    public String raca;
    public Cao proximo;
    public Cao anterior;


    @Override
    public String toString() {
        return "Cao{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", proximo=" + proximo +'\'' +
                ", anterior" + anterior +
                '}';
    }

    public void ler(){
        System.out.println("Digite nome");
        Scanner tc = new Scanner(System.in);
        nome=tc.next();
       // System.out.println("Digite raca");
    ///     raca=tc.next();
    }
    public void exibir(){
        System.out.println("Nome:"+nome);
      //  System.out.println("Raca:"+raca);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Cao getProximo() {
        return proximo;
    }

    public void setProximo(Cao proximo) {
        this.proximo = proximo;
    }

    public Cao getAnterior() {
        return anterior;
    }

    public void setAnterior(Cao anterior) {
        this.anterior = anterior;
    }
}
