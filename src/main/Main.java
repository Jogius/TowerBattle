package main;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        print("Plugin started");

    }

    public static void print(String text) {
        System.out.println("[TowerBattle] " + text);
    }

}
