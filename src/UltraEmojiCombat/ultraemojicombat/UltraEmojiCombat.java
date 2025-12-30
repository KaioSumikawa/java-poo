package UltraEmojiCombat.ultraemojicombat;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l = new Lutador[6];

        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f,
                68.9f, 11, 2, 1);
        l[1] = new Lutador();
        l[2] = new Lutador();
        l[3] = new Lutador();
        l[4] = new Lutador();
        l[5] = new Lutador();

        l[0].empatarLuta();
        l[0].status();
    }
}
