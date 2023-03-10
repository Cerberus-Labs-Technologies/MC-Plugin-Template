package tech.cerberusLabs

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {

    companion object {
        lateinit var instance: Main
    }

    init {
        instance = this
    }

    override fun onLoad() {
        // Plugin load logic
        LicenseManager("testProduct",true).validate({
            println("License is valid!")
        },{
            println("Due to the license being invalid, the plugin will now disable.")
            Bukkit.getPluginManager().disablePlugin(this)
        })
    }

    override fun onEnable() {
        // Plugin startup logic
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
