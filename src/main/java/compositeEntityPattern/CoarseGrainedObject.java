package compositeEntityPattern;

/**  
 * @ClassName: CoarseGrainedObject  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年2月11日 下午2:18:59  
 *    
 */
public class CoarseGrainedObject {
	DependentObject1 do1 = new DependentObject1();
   DependentObject2 do2 = new DependentObject2();
 
   public void setData(String data1, String data2){
      do1.setData(data1);
      do2.setData(data2);
   }
 
   public String[] getData(){
      return new String[] {do1.getData(),do2.getData()};
   }
}
