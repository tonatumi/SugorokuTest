package com.tonatonahouse.sugorokutest;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.Random;

public class Processing extends SugorokuTest {

    public void createHelp(Player p){
        p.sendMessage("§e-------§r" + prefix + "§e-------§r");
        p.sendMessage("§6§l/sugoroku createlhelp§r:ゲームのヘルプを表示します");
        p.sendMessage("§6§l/sugoroku newgame [マップID] [人数]§r:マップ[マップID]で[人数]人での新規ゲームを作ります");

    }

    public void showHelp(Player p){
        p.sendMessage("§e-------§r" + prefix + "§e-------§r");
        p.sendMessage("§6§l/sugoroku showdetails§r:参加受付中のゲームの詳細を表示します");
        p.sendMessage("§6§l/sugoroku entry§r:現在参加受付中のゲームにエントリーします");
        p.sendMessage("§6§l/sugoroku cancel§r:現在のエントリーをキャンセルします");
        p.sendMessage("§6§l/sugoroku dice§r:ダイスを振ります");

    }

    public void rollDice(Player p){
        Random rdm = new Random();
        int result = rdm.nextInt(6)+1;
        Bukkit.getServer().broadcastMessage(p.getDisplayName() + "はダイスを振って" + result +"が出た！");
        goForward(result,p);
    }

    public void goForward(int result, Player p){
        //進む処理

    }
}

