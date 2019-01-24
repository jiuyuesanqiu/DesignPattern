package templatePattern;

/**  
 * @ClassName: Game  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月24日 下午1:36:29  
 *    
 */
public abstract class Game {
	abstract void initialize();
	   abstract void startPlay();
	   abstract void endPlay();
	 
	   //模板
	   public final void play(){
	 
	      //初始化游戏
	      initialize();
	 
	      //开始游戏
	      startPlay();
	 
	      //结束游戏
	      endPlay();
	   }
}
