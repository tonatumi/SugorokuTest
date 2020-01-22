package com.tonatonahouse.sugorokutest;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class SugorokuTest extends JavaPlugin {

    String prefix = "{Sugoroku Test}";

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("SugorokuTest起動...");
        getCommand("sugoroku").setExecutor(new SugorokuTestCommand(this));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("SugorokuTest終了..." );

    }
}
