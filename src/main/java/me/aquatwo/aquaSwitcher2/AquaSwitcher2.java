package me.aquatwo.aquaSwitcher2;

import me.aquatwo.aquaSwitcher2.Commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class AquaSwitcher2 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("creative").setExecutor(new gamemodeCreativeCommand());
        getCommand("survival").setExecutor(new gamemodeSurvivalCommand());
        getCommand("adventure").setExecutor(new gamemodeAdventureCommand());
        getCommand("spectator").setExecutor(new gamemodeSpectatorCommand());
        getCommand("heal").setExecutor(new healCommand());
        getCommand("feed").setExecutor(new feedCommand());
        getCommand("fly").setExecutor(new toggleFlyCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
