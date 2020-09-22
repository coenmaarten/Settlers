package com.mcsettlers.core.menu.commands;

import com.mcsettlers.core.Constants;
import com.mcsettlers.core.Main;
import com.mcsettlers.core.menu.MainMenu;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MenuCommands implements CommandExecutor {

    private Main plugin;

    public MenuCommands(Main plugin){
        plugin.getCommand("settlers").setExecutor(this);
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("Settlers")){

            if (args.length == 0){
                commandSender.sendMessage(Constants.PREFIX+"For help please do /settlers help");
                return true;
            }

            if (args[0].equalsIgnoreCase("Menu")){
                if (commandSender instanceof Player){
                    MainMenu.onCall((Player) commandSender);
                }
            }
            return false;
        }
        return false;
    }
}
