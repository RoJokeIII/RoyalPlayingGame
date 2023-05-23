public abstract class Game {
    private String name;
    Entity[] spawn;

    public Game(String name, Entity[] spawn) {
        this.name = name;
        this.spawn = spawn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Entity[] getSpawn() {
        return spawn;
    }

    public void setSpawn(Entity[] spawn) {
        this.spawn = spawn;
    }
}
