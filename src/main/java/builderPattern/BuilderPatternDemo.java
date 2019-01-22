package builderPattern;

/**  
 * @ClassName: BuilderPatternDemo  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月16日 下午4:58:27  
 *    
 */
public class BuilderPatternDemo {
	public static void main(String[] args) {
	      MealBuilder mealBuilder = new MealBuilder();
	 
	      Meal vegMeal = mealBuilder.prepareVegMeal();
	      System.out.println("Veg Meal");
	      vegMeal.showItems();
	      System.out.println("Total Cost: " +vegMeal.getCost());
	 
	      Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
	      System.out.println("\n\nNon-Veg Meal");
	      nonVegMeal.showItems();
	      System.out.println("Total Cost: " +nonVegMeal.getCost());
	   }
}
