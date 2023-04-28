public class Violao extends Instrumentos implements TrocarCorda{
    public Violao(String nome, String material, int quantidade){
        super(nome, material, quantidade);
    }

    @Override
    public void Tocar(){
        System.out.println("Instrumento de corda");
    }
    @Override
    public void Afinar(){
        System.out.println("E - A - D - G - B - E");
    }
    @Override
    public void TrocarCorda(){
        System.out.println("Corda de nylon ");
    }
}
