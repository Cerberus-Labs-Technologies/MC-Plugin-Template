package tech.cerberusLabs

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import tech.cerberusLabs.listener.JoinListener

class Main : JavaPlugin() {

    companion object {
        lateinit var instance: Main
    }

    val licenseManager = LicenseManager("testProduct", true)

    init {
        instance = this
    }

    override fun onLoad() {
        // Plugin load logic
    }

    override fun onEnable() {
        // Plugin startup logic
            licenseManager.validate({
                // if the license is valid and u want to do something fancy
                println("License is valid!")
                Bukkit.getPluginManager().registerEvents(JoinListener(), this)
            }, {
                // if the license is invalid and u want to do something fancy
                Bukkit.getPluginManager().disablePlugin(this)
            })
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
