package com.mcsettlers.core;

import com.mcsettlers.core.menu.MainMenu;
import com.mcsettlers.core.menu.commands.MenuCommands;
import com.mcsettlers.core.menu.commands.SyntaxRemover;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(Constants.ON_ENABLE_MESSAGE);
        new MainMenu(this);
        new MenuCommands(this);
        new SyntaxRemover(this);

    }

    @Override
    public void onDisable() {
        getLogger().info(Constants.ON_DISABLE_MESSAGE);
    }


}
