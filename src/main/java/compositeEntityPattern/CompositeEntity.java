package compositeEntityPattern;

/**  
 * @ClassName: CompositeEntity  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年2月11日 下午2:19:23  
 *    
 */
public class CompositeEntity {
	private CoarseGrainedObject cgo = new CoarseGrainedObject();
	 
	   public void setData(String data1, String data2){
	      cgo.setData(data1, data2);
	   }
	 
	   public String[] getData(){
	      return cgo.getData();
	   }
}
