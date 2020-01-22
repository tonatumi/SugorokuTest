package com.tonatonahouse.sugorokutest;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import java.util.Random;
import java.util.UUID;


public class SugorokuTestCommand extends Processing implements CommandExecutor {
    private SugorokuTest plugin;


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
            showHelp(p);
            return true;
        }

        //引数が1つの時
        if(args.length ==1){
            //createHelpのとき
            if(args[0].equalsIgnoreCase("createHelp") && p.hasPermission("SugorokuTest.op")){
                createHelp(p);
                return true;
            } else{
                p.sendMessage("あなたには権限がありません。");
            }
            //diceのとき
            if(args[0].equalsIgnoreCase("dice")){
                rollDice(p);
                return true;
            }

            //entryのとき

            //cancelのとき

        }

        //引数が２つのとき

        //引数が３つのとき
        //newgameだけ受けて、受けたら順番に詳細設定を打たせるのもあり？
        if(args.length ==2){
            //newgameのとき
            if(args[0].equalsIgnoreCase("newgame")){
                //マップをargs[1]にセット

                //ゲームの人数をargs[2]人にセット
            }
        }

    return true;
    }


}
