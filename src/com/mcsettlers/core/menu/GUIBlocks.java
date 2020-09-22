package com.mcsettlers.core.menu;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.inventory.meta.SkullMeta;

public class GUIBlocks {

    public static ItemStack CloseMenu;

    public static ItemStack LockedItem;

    public static ItemStack FillerItem;

    public static ItemStack PlayerStats;

    public static ItemStack BackButton;

    public static ItemStack getBackButton() {
        BackButton = new ItemStack(Material.ARROW);
        ItemMeta Meta = BackButton.getItemMeta();
        Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&3Back"));
        BackButton.setItemMeta(Meta);
        return BackButton;
    }

    public static ItemStack getCloseMenu() {
        CloseMenu = new ItemStack(Material.BARRIER);
        ItemMeta Meta = CloseMenu.getItemMeta();
        Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4Close Menu"));
        CloseMenu.setItemMeta(Meta);
        return CloseMenu;
    }

    public static ItemStack getPlayerStats(Player player) {
        PlayerStats = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta meta = (SkullMeta) PlayerStats.getItemMeta();
        meta.setOwningPlayer(player);
        PlayerStats.setItemMeta(meta);
        return PlayerStats;
    }

    public static ItemStack getLockedItem() {
        LockedItem = new ItemStack(Material.IRON_BARS);
        ItemMeta Meta = LockedItem.getItemMeta();
        Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&8LOCKED"));
        LockedItem.setItemMeta(Meta);
        return LockedItem;
    }

    public static ItemStack getFillerItem() {
        FillerItem = new ItemStack(Material.BLACK_STAINED_GLASS_PANE);
        ItemMeta Meta = FillerItem.getItemMeta();
        Meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&9-"));
        FillerItem.setItemMeta(Meta);

        return FillerItem;
    }


}