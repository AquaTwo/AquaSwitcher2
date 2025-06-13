package me.aquatwo.aquaSwitcher2.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class feedCommand implements CommandExecutor {

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
                        p.sendMessage(ChatColor.YELLOW + args[name] + " " + ChatColor.AQUA + "was fed");
                        receiver.sendMessage(ChatColor.AQUA + "You have been fed");
                        receiver.setFoodLevel(20);
                    }
                }

            }else{
                p.sendMessage(ChatColor.AQUA + "Healed");
                p.setFoodLevel(20);
            }
        }
        return true;
    }
}
