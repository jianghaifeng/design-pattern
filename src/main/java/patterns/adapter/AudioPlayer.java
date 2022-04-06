package patterns.adapter;

public class AudioPlayer implements MediaPlayer {
    AudioAdapter adapter = new AudioAdapter();

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("play mp3 file: " + fileName);
        } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            adapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported.");
        }
    }
}
