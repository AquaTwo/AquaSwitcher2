package me.aquatwo.aquaSwitcher2.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class gamemodeCreativeCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p) {

            if (args.length >0){
                for (int name = 0; name < args.length; name++){

                    String username = args[name];
                    Player receiver = Bukkit.getServer().getPlayerExact(username);

                    if (receiver == null){
                        p.sendMessage(ChatColor.RED + args[name] + " " + "cannot be found.");
                    }else{
                        p.sendMessage(ChatColor.YELLOW + args[name] + "'s" + " " + ChatColor.AQUA + "gamemode was set to" + " " + ChatColor.YELLOW + "Creative");
                        receiver.sendMessage(ChatColor.AQUA + "Your gamemode has been set to" + " " + ChatColor.YELLOW + "Creative");
                        receiver.setGameMode(GameMode.CREATIVE);

                    }
                }

            }else{
                p.sendMessage(ChatColor.AQUA + "Set own gamemode to" + " " + ChatColor.YELLOW + "Creative");
                p.setGameMode(GameMode.CREATIVE);
            }
        }
        return true;
    }
}
