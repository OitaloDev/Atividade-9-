public class PersonagemFactory {
    public static void main(String[] args) {
        Terraqueo kuririn = new Terraqueo("Kuririn", "Masculino", 44, 1, 150, "Kienzan", "Japao", "Toquio");
        Saiyajin goku = new Saiyajin("Goku", "Masculino", 40, 1, 1000,"Kamehameha", 5, false);
        Saiyajin gohan = new Saiyajin("Gohan", "Masculino", 23, 10, 650, "Kamehameha", 5, false);
        Namekuseijin dende = new Namekuseijin("Dendê", "Masculino", 18, 20, 500, "Bakurikimaha ", 7, true);
        goku.transformar(5);
        gohan.transformar(5);
        gohan.transformar(3);
        dende.fazerDejeso("Eu desejo muito dinheiro");
    }
}
