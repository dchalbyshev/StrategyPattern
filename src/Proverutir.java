public class Proverutir {
    public static void main(String[] args) {
        Man kola = new Man();
        kola.setActivity(new Spim());
        kola.live();
        kola.setActivity(new Catanie());
        kola.live();
        kola.setActivity(new Codim());
        kola.live();
    }
}
