public class Flauta extends Instrumentos{
    public Flauta(String nome, String material, int quantidade){
        super(nome, material, quantidade);
    }

    @Override
    public void Tocar(){
        System.out.println("Instrumento de sopro");
    }
    @Override
    public void Afinar(){
        System.out.println("lá = 440Hz");
    }
}
