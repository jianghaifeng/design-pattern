package patterns.adapter;

public class Demo {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "1.mp3");
        player.play("mp4", "2.mp4");
    }
}
