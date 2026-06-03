interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Playing Guitar");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing Piano");
    }
}

public class Main {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        Piano p = new Piano();

        g.play();
        p.play();
    }
}