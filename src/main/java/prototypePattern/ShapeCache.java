package prototypePattern;

import java.util.Hashtable;

/**  
 * @ClassName: ShapeCache  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author 刘良  
 * @date 2019年1月16日 下午5:39:54  
 *    
 */
public class ShapeCache {
	private static Hashtable<String, Shape> shapeMap 
    = new Hashtable<String, Shape>();

 public static Shape getShape(String shapeId) {
    Shape cachedShape = shapeMap.get(shapeId);
    return (Shape) cachedShape.clone();
 }

 // 对每种形状都运行数据库查询，并创建该形状
 // shapeMap.put(shapeKey, shape);
 // 例如，我们要添加三种形状
 public static void loadCache() {
    Circle circle = new Circle();
    circle.setId("1");
    shapeMap.put(circle.getId(),circle);

    Square square = new Square();
    square.setId("2");
    shapeMap.put(square.getId(),square);

    Rectangle rectangle = new Rectangle();
    rectangle.setId("3");
    shapeMap.put(rectangle.getId(),rectangle);
 }
}
