package commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ChangeWorld implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.hasPermission("towerbattle.changeworld")) {
                if (args.length == 1) {
                    p.teleport(Bukkit.getWorld(args[0]).getSpawnLocation());
                } else {
                    p.sendMessage("§cUse /changeworld <world>");
                }
            } else p.sendMessage("§cYou don't have the permission to do that!");
        }

        return false;
    }
}
