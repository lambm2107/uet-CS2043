public class MediaPlayer {
    private AudioPlayer audio;
    private VideoPlayer video;

    public MediaPlayer(AudioPlayer audio, VideoPlayer video) {
        this.audio = audio;
        this.video = video;
    }

    public void playAudio(String file) {
        if (audio != null) {
            audio.playAudio(file);
        }
    }

    public void playVideo(String file) {
        if (video != null) {
            video.playVideo(file);
        }
    }
}
