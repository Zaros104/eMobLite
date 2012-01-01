package me.Zaros.eMobLite;

import java.io.File;
import java.util.logging.Logger;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class eMobLite extends JavaPlugin {
	private MobSpawn mobListener = new MobSpawn(this);
	public static FileConfiguration CONFIG;
	public static Logger log = Logger.getLogger("Minecraft");	
	
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		log.info("[eMob Lite] v" + pdfFile.getVersion() + " - Disabled");
	}

	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		log.info("[eMob Lite] v" + pdfFile.getVersion() + " - Enabled");		
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvent(Event.Type.CREATURE_SPAWN, mobListener,Event.Priority.Normal, this);
		getCommand("mob").setExecutor(new mobCMD(this));
		fileCheck();
	}
	
	public void fileCheck() {
		File Conf = new File(getDataFolder(), "config.yml");
		// check for/create config
		if (!Conf.exists()) {
			log.info("[eMob Lite] - Creating the config!");
			new File(getDataFolder().toString()).mkdir();
			getConfig().options().copyDefaults(true);
			saveConfig();
			CONFIG = getConfig();
		}
	}	
}