public class Main {
    public static void main(String[] args) {
        Harpa h1 = new Harpa("Sidney","Jacarandá",5);
        Violao v1 = new Violao("Aurora","Jatobá",8);
        Flauta f1 = new Flauta("Sweet","Pinho",4);

        System.out.println("Informações sobre a Harpa: \n" +
                "Nome: " + h1.getNome() + "\n" +
                "Material: " + h1.getMaterial() + "\n" +
                "Quantidade: " + h1.getQuantidade() + "\n");
        h1.TrocarCorda();
        h1.Afinar();
        h1.Tocar();

        System.out.println(" \n Informações sobre o Violão: \n" +
                "Nome: " + v1.getNome() + "\n" +
                "Material: " + v1.getMaterial() + "\n" +
                "Quantidade: " + v1.getQuantidade());
        v1.TrocarCorda();
        v1.Afinar();
        v1.Tocar();

        System.out.println(" \n Informações sobre a Flauta: \n" +
                "Nome: " + f1.getNome() + "\n" +
                "Material: " + f1.getMaterial() + "\n" +
                "Quantidade: " + f1.getQuantidade());
        f1.Afinar();
        f1.Tocar();
    }
}