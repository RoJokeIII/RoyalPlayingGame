public abstract class Entity {
    private String name;
    private int expirience, health, strenght, agility;

    public Entity(String name, int expirience, int health, int strenght, int agility) {
        this.name = name;
        this.expirience = expirience;
        this.health = health;
        this.strenght = strenght;
        this.agility = agility;
    }

    public String getName() {
        return name;
    }

    public int getExpirience() {
        return expirience;
    }

    public int getHealth() {
        return health;
    }

    public int getStrenght() {
        return strenght;
    }

    public int getAgility() {
        return agility;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExpirience(int expirience) {
        this.expirience = expirience;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }
}
