// Copyright (c) 2021, Aidan Young
//        All rights reserved.
//
//        This source code is licensed under the BSD-style license found in the
//        LICENSE file in the root directory of this source tree.

package antiportaltrap.antiportaltrap.events;

import org.bukkit.Bukkit;
import org.bukkit.block.Block;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class antiTrapper implements Listener {

    @EventHandler
    public static void blockPlaced(BlockPlaceEvent event) {
        Block block = event.getBlock();
        int x = block.getX();
        int y = block.getY();
        int z = block.getZ();

        int xMinus = x - 1;
        int xPlus = x + 1;

        int zMinus = z - 1;
        int zPlus = z + 1;

        if(event.getPlayer().getWorld().getBlockAt(xMinus, y, z).getType() == Material.NETHER_PORTAL) {
            event.setCancelled(true);
            Bukkit.getConsoleSender().sendMessage("[*] " + event.getPlayer().getDisplayName() + " possibly attempted to portal trap!");
            event.getPlayer().sendMessage("[-] Remember: Attempting to trap players is against the rules");
        } else if(event.getPlayer().getWorld().getBlockAt(xPlus, y, z).getType() == Material.NETHER_PORTAL) {
            event.setCancelled(true);
            Bukkit.getConsoleSender().sendMessage("[*] " + event.getPlayer().getDisplayName() + " possibly attempted to portal trap!");
            event.getPlayer().sendMessage("[-] Remember: Attempting to trap players is against the rules");
        } else if(event.getPlayer().getWorld().getBlockAt(x, y, zMinus).getType() == Material.NETHER_PORTAL) {
            event.setCancelled(true);
            Bukkit.getConsoleSender().sendMessage("[*] " + event.getPlayer().getDisplayName() + " possibly attempted to portal trap!");
            event.getPlayer().sendMessage("[-] Remember: Attempting to trap players is against the rules");
        } else if(event.getPlayer().getWorld().getBlockAt(x, y, zPlus).getType() == Material.NETHER_PORTAL) {
            event.setCancelled(true);
            Bukkit.getConsoleSender().sendMessage("[*] " + event.getPlayer().getDisplayName() + " possibly attempted to portal trap!");
            event.getPlayer().sendMessage("[-] Remember: Attempting to trap players is against the rules");
        }
    }
}
