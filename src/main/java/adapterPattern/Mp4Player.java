package adapterPattern;

/**  
 * @ClassName: Mp4Player  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月17日 下午1:13:40  
 *    
 */
public class Mp4Player implements AdvancedMediaPlayer {

	public void playVlc(String fileName) {
	}

	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: "+ fileName);
	}

}
