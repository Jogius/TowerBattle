package main;

import commands.ChangeWorld;
import org.bukkit.Bukkit;
import org.bukkit.WorldCreator;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        print("Plugin started");

        getCommand("changeworld").setExecutor(new ChangeWorld());

        WorldCreator.name("world_gameworld").copy(Bukkit.getWorld("world")).createWorld();

    }


    public static void print(String text) {
        System.out.println("[TowerBattle] " + text);
    }

}
