package Entity;
import Item.Item;
public class UseEffects {
    public static void use(Entity target, Item item){
        System.out.println(target.toString() + item.toString());
    }

}
