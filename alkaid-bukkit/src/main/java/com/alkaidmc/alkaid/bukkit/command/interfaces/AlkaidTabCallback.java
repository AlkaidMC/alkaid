package com.alkaidmc.alkaid.bukkit.command.interfaces;

import org.bukkit.command.CommandSender;

import java.util.List;

public interface AlkaidTabCallback {
    List<String> type(CommandSender sender, String[] args);
}
