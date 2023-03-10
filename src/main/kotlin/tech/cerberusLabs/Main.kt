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
    }

    override fun onEnable() {
        // Plugin startup logic
        LicenseManager("testProduct",true).validate({
            // if the license is valid and u want to do something fancy
        },{
            // if the license is invalid and u want to do something fancy
            Bukkit.getPluginManager().disablePlugin(this)
        })
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
