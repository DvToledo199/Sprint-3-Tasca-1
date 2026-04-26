package O;

public class Piano extends Instrument implements Playable {

    @Override
    public void play() {
        System.out.println("🎹 Playing the piano");
    }
}
