package builderPattern;

/**  
 * @ClassName: ColdDrink  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月16日 下午4:50:44  
 *    
 */
public abstract class ColdDrink implements Item {

    public Packing packing() {
       return new Bottle();
    }
 
    public abstract float price();

}
