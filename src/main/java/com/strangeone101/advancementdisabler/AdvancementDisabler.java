package com.strangeone101.advancementdisabler;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;
import java.util.List;

public final class AdvancementDisabler extends JavaPlugin {

    @Override
    public void onEnable() {

        getConfig().addDefault("DisabledWorlds", List.of("ExampleWorld1"));
        getConfig().addDefault("PermissionRequired", false);
        getConfig().options().copyDefaults(true);
        this.saveConfig();

        Bukkit.getPluginManager().registerEvents(new ADListener(this), this);

        getLogger().info("AdvancementDisabler enabled for " + getConfig().getStringList("DisabledWorlds").size() + " world(s)");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
