import Entity.Entity;

public interface Tradable {
    void setTradebleItem();
    void trade(Entity trader1, Entity trader2);
}
