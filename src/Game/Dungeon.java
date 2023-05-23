package Game;

import Entity.Entity;

public class Dangeon extends Game {
    public Dangeon(String name, Entity[] spawn) {
        super(name, spawn);
    }

    public Entity spawnInDungeon() {
        int amountEntity = spawn.length;
        int monsterNumber = (int) (Math.random() * ++amountEntity);
        return spawn[monsterNumber];
    }
}
