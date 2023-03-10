package tech.cerberusLabs.listener

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import tech.cerberusLabs.Main

class JoinListener: Listener {

    @EventHandler
    fun onJoin(event: PlayerJoinEvent) {
        if (Main.instance.licenseManager.license != null) {
            if (Main.instance.licenseManager.license!!.sponsored) {
                event.player.sendMessage("License is sponsored!")
            }
        }

    }
}