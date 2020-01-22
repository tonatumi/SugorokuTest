package com.tonatonahouse.sugorokutest;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.Random;
import java.util.UUID;


public class SugorokuTestCommand implements CommandExecutor {
    private SugorokuTest plugin;

    String prefix = "{Sugoroku Test}";

    public SugorokuTestCommand(SugorokuTest plugin){
        this.plugin =plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command,String label,String[] args){
        if (!(sender instanceof Player)) {
            return false;
        }

        Player p =(Player) sender;

        //コマンドがsugorokuのみのとき
        if(args.length == 0){
            this.showHelp(p);
            return true;
        }

        //引数が1つの時
        if(args.length ==1){
            //diceのとき
            if(args[0].equalsIgnoreCase("dice")){
                this.rollDice(p);
                return true;
            }

        }

    return true;
    }

    public void showHelp(Player p){
        p.sendMessage("§e-------§r" + prefix + "§e-------§r");
        p.sendMessage("§6§l/sugoroku dice§r:ダイスを振ります");
        p.sendMessage("§6§l/sugoroku load [マップ名]§r:[マップ名]を読み込みます");
        p.sendMessage("§6§l/sugoroku start§r:ゲームを開始します");
        p.sendMessage("§6§l/sugoroku setting§r:ゲームの設定をします");

    }

    public void rollDice(Player p){
        Random rdm = new Random();
        int result = rdm.nextInt(6)+1;
        Bukkit.getServer().broadcastMessage(p.getDisplayName() + "はダイスを振って" + result +"が出た！");
        goForward(result,p);
    }

    public void goForward(int result, Player p){
        //進む処理
        Bukkit.getServer().dispatchCommand(Bukkit.getServer().getConsoleSender(),"tp @e[name=+type=villager]");
    }


}
