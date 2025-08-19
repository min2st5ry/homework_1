package me.min2st5ry.homework_1;

import org.bukkit.plugin.java.JavaPlugin;

public final class Homework_1 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Listener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
