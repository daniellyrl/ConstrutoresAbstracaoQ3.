public class Harpa extends Instrumentos implements TrocarCorda{
    public Harpa(String nome, String material, int quantidade) {
        super(nome, material, quantidade);
    }

    @Override
    public void Tocar() {
        System.out.println("Instrumento de corda");
    }

    @Override
    public void Afinar(){
        System.out.println("E - F - G - A (quatro pedais do pé direto) + \n" +
                "D - C - B (três do pé esquerdo)");
    }
    @Override
    public void TrocarCorda(){
        System.out.println("Corda de nylon b-2");
    }
}
