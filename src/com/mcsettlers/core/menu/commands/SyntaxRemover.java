package com.mcsettlers.core.menu.commands;

import com.mcsettlers.core.Constants;
import com.mcsettlers.core.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class SyntaxRemover  implements Listener {

    public SyntaxRemover(Main plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onCommand(final PlayerCommandPreprocessEvent event) {
        if (event.getMessage().split(" ")[0].contains(":")) {
            event.setCancelled(true);
            event.getPlayer().sendMessage(Constants.PREFIX + Constants.COMMAND_SYNTAX_REMOVER);
        }
    }
}
