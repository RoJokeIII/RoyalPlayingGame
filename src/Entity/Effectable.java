import Entity.Entity;
import  Item.Item;

public interface Effectable {
    void effectsUse(Entity target, Item item);
}
