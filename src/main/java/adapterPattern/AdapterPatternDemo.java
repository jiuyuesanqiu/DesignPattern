package adapterPattern;

/**  
 * @ClassName: AdapterPatternDemo  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月17日 下午1:16:55  
 *    
 */
public class AdapterPatternDemo {
	public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();
      audioPlayer.play("mp3", "beyond the horizon.mp3");
      audioPlayer.play("mp4", "alone.mp4");
      audioPlayer.play("vlc", "far far away.vlc");
      audioPlayer.play("avi", "mind me.avi");
   }
}
