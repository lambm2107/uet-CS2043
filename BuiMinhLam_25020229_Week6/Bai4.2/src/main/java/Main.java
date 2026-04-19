public class Main {
    static void main(String[] args) {
        AudioPlayer audio = new AudioPlayer();
        VideoPlayer video = new VideoPlayer();
        MediaPlayer media = new MediaPlayer(audio, video);
        media.playAudio("Video.mp3");
        media.playVideo("Audio.mp4");
    }
}
