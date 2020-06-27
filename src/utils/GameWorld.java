package utils;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldCreator;

public class GameWorld {

    private String name;
    private int id;
    private World world;

    public GameWorld(String name, int id) {
        this.name = name;
        this.id = id;

        createWorld();
    }

    public void createWorld() {
        WorldCreator creator = new WorldCreator(name);

        creator.copy(Bukkit.getWorld("world_gameworld"));

        world = creator.createWorld();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
