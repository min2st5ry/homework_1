package me.min2st5ry.homework_1;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

public class Listener implements org.bukkit.event.Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();
        if(player.getName().equals("min2st5ry")) {
            player.sendMessage("마스다");
        } else {
            player.sendMessage("그냥 플레이어다");
        }

    }

}
