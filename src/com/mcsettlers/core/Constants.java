package com.mcsettlers.core;

import org.bukkit.ChatColor;

/**
 * All constants (Not from Database) will be stored here
 * All constants should be:
 *  public - so that it can be accessed from anywhere
 *  static - no need to create an instance
 *  final - since its constants shouldn't be allowed to change
 *  As per Java naming convention should be capitalized so that easy to read and stands out in Java documentation.
 *
 *  Last updated: 22-Sep-2020 by: Coenmaarten
 */
public class Constants {


    static final String ON_ENABLE_MESSAGE = "Settlers Core plugin has been enabled!";

    static final String ON_DISABLE_MESSAGE = "Settlers Core plugin has been disabled!";

    /**
     * Prefix for chat etc.
     */
    public static final String PREFIX = ChatColor.translateAlternateColorCodes('&',
            "&3[Settlers] ");
    public static final String COMMAND_SYNTAX_REMOVER = ChatColor.translateAlternateColorCodes('&',
            "&4Syntax not allowed, contact &3admin &4if you believe this is a bug!");
}