package adapterPattern;

/**  
 * @ClassName: AudioPlayer  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月17日 下午1:15:48  
 *    
 */
public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter; 
	public void play(String audioType, String fileName) {
		//播放 mp3 音乐文件的内置支持
	      if(audioType.equalsIgnoreCase("mp3")){
	         System.out.println("Playing mp3 file. Name: "+ fileName);         
	      } 
	      //mediaAdapter 提供了播放其他文件格式的支持
	      else if(audioType.equalsIgnoreCase("vlc") 
	         || audioType.equalsIgnoreCase("mp4")){
	         mediaAdapter = new MediaAdapter(audioType);
	         mediaAdapter.play(audioType, fileName);
	      }
	      else{
	         System.out.println("Invalid media. "+
	            audioType + " format not supported");
	      }
	}

}
