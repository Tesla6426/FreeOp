package net.txsla.freeop;

import net.txsla.freeop.Commands.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class FreeOp extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("op").setExecutor(new opCommand());
        getCommand("gmc").setExecutor(new gmcCommand());
        getCommand("gms").setExecutor(new gmsCommand());
        getCommand("adventure").setExecutor(new adventureCommand());
        getCommand("spectator").setExecutor(new spectateCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
