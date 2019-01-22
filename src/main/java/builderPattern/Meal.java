package builderPattern;

import java.util.ArrayList;
import java.util.List;

/**  
 * @ClassName: Meal  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月16日 下午4:55:31  
 *    
 */
public class Meal {
	private List<Item> items = new ArrayList<Item>();    
	 
	   public void addItem(Item item){
	      items.add(item);
	   }
	 
	   public float getCost(){
	      float cost = 0.0f;
	      for (Item item : items) {
	         cost += item.price();
	      }        
	      return cost;
	   }
	 
	   public void showItems(){
	      for (Item item : items) {
	         System.out.print("Item : "+item.name());
	         System.out.print(", Packing : "+item.packing().pack());
	         System.out.println(", Price : "+item.price());
	      }        
	   }   
}
