public class Main {
    public static void main(String[] args) {
        Cachorro chico = new Cachorro("francisco", 3, "vira-lata");
        Peixe beto = new Peixe("nemo", 0.27,"ornamental" );

        System.out.println(chico.toString());
        System.out.println(beto.toString());
    }
}