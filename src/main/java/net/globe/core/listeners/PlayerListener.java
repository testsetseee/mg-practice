package net.globe.core.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerListener implements Listener {
    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event){
        event.getPlayer().chat("ЭЙЭЙЭ ХУЛИ ХОДИШЬ");
    }
}
