package com.mcsettlers.core.menu;

import com.mcsettlers.core.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class MainMenu implements Listener {

    Main plugin;
    public static Inventory inventory;
    public static String MenuTitle = ChatColor.translateAlternateColorCodes('&', "&3Main Menu");

    public MainMenu(Main plugin) {
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
        this.plugin = plugin;
    }

    public static void onCall(Player player) {

        Inventory inventory = Bukkit.getServer().createInventory(player, 54, MenuTitle);
        MainMenu.inventory = inventory;

        for (int i = 0; i <= 53; i++) {

            switch (i) {
                case 8:
                    inventory.setItem(i, GUIBlocks.getCloseMenu());
                    break;
                case 10:
                    inventory.setItem(i, GUIBlocks.getLockedItem());
                    break;
                case 12:
                    inventory.setItem(i, GUIBlocks.getLockedItem());
                    break;
                case 14:
                    inventory.setItem(i, GUIBlocks.getLockedItem());
                    break;
                case 16:
                    inventory.setItem(i, GUIBlocks.getLockedItem());
                    break;
                case 28:
                    inventory.setItem(i, GUIBlocks.getLockedItem());
                    break;
                case 30:
                    inventory.setItem(i, GUIBlocks.getLockedItem());
                    break;
                case 32:
                    inventory.setItem(i, GUIBlocks.getPlayerStats(player));
                    break;
                case 34:
                    inventory.setItem(i, GUIBlocks.getLockedItem());
                    break;
                default:
                    inventory.setItem(i, GUIBlocks.getFillerItem());
            }
        }

        player.openInventory(inventory);
    }


    @EventHandler
    private void menuClick(InventoryClickEvent event) {
        if (event.getView().getTitle().equals(MenuTitle)) {
            InventoryAction action = event.getAction();

            if (event.getClick().isShiftClick()) {
                event.setCancelled(true);
            }

            switch (action) {
                case MOVE_TO_OTHER_INVENTORY:
                case HOTBAR_SWAP:
                case HOTBAR_MOVE_AND_READD:
                    event.setCancelled(true);
                    return;
                default:
                    break;
            }

            Player player = (Player) event.getWhoClicked();
            event.setCancelled(true);
            if (!(event.getCurrentItem() == null)) {
                if (event.getCurrentItem().equals(GUIBlocks.getCloseMenu())) {
                    event.setCancelled(true);
                    player.closeInventory();
                }
            }
        }
    }

}
