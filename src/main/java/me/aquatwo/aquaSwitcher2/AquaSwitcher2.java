package me.aquatwo.aquaSwitcher2;

import me.aquatwo.aquaSwitcher2.Commands.gamemodeCreativeCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class AquaSwitcher2 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("creative").setExecutor(new gamemodeCreativeCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
