// Copyright (c) 2021, Aidan Young
//        All rights reserved.
//
//        This source code is licensed under the BSD-style license found in the
//        LICENSE file in the root directory of this source tree.

package antiportaltrap.antiportaltrap;

import antiportaltrap.antiportaltrap.events.antiTrapper;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiPortalTrap extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new antiTrapper(), this);
        getServer().getConsoleSender().sendMessage("[+] AntiPortalTrap successfully loaded");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage("[-] AntiPortalTrap successfully unloaded");
    }
}
