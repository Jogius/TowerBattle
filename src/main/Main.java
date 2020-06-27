package main;

import commands.ChangeWorld;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.plugin.java.JavaPlugin;
import utils.CustomChunkgenerator;

public class Main extends JavaPlugin {

    public static World w = Bukkit.getWorld("world");

    @Override
    public void onEnable() {

        print("Plugin started");

        getCommand("changeworld").setExecutor(new ChangeWorld());

        WorldCreator creator = new WorldCreator("world_gameworld");
        creator.generator(new CustomChunkgenerator());
        World w2 = creator.createWorld();


    }

    public static void print(String text) {
        System.out.println("[TowerBattle] " + text);
    }

}
