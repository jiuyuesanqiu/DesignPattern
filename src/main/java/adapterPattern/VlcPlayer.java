package adapterPattern;

/**  
 * @ClassName: VlcPlayer  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月17日 下午1:13:17  
 *    
 */
public class VlcPlayer implements AdvancedMediaPlayer {

	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: "+ fileName); 
	}

	public void playMp4(String fileName) {
	}

}
