package adapterPattern;

/**
 * @ClassName: MediaAdapter
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 刘良
 * @date 2019年1月17日 下午1:14:22
 * 
 */
public class MediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer = new Mp4Player();
		}
	}

	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(fileName);
		}
	}

}
