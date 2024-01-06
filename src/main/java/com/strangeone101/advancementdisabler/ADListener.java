package com.strangeone101.advancementdisabler;

import com.destroystokyo.paper.event.player.PlayerAdvancementCriterionGrantEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class ADListener implements Listener {

    private JavaPlugin plugin;

    public ADListener(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onCriteriaGet(PlayerAdvancementCriterionGrantEvent event) {
        for (String world : plugin.getConfig().getStringList("DisabledWorlds")) {
            if (event.getPlayer().getWorld().getName().equals(world)) {
                event.setCancelled(true);
                return;
            }
        }

        if (plugin.getConfig().getBoolean("PermissionRequired") && !event.getPlayer().hasPermission("advancementdisabler.haspermission")) {
            event.setCancelled(true);
        }
    }
}
