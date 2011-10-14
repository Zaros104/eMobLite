package me.Zaros.eMobLite;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.config.Configuration;

public class eMobLite extends JavaPlugin {
	private MobSpawn mobListener = new MobSpawn(this);
	public static Configuration CONFIG;
	Logger log = Logger.getLogger("Minecraft");

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
		CONFIG = getConfiguration();
		File config = new File(getDataFolder() + "/config.yml");
		// check for/create config
		if (!config.exists()) {
			log.info("[eMob Lite] - Creating the config!");
			new File(getDataFolder().toString()).mkdir();			
			try {
				config.createNewFile();
				fillConfig();
			}
			catch (IOException ex) {
				log.severe("[eMob Lite] - Error! Cannot load eMob config!");
			}
		}
	}
	
	public void fillConfig() {
		CONFIG = getConfiguration();
		CONFIG.setProperty("Allow Creeper", true);
		CONFIG.save();
		CONFIG.setProperty("Allow Cave Spider", true);
		CONFIG.save();
//		CONFIG.setProperty("Allow Dragon", true);
//		CONFIG.save();
		CONFIG.setProperty("Allow Enderman", true);
		CONFIG.save();
		CONFIG.setProperty("Allow Ghast", true);
		CONFIG.save();
		CONFIG.setProperty("Allow Giant", true);
		CONFIG.save();
		CONFIG.setProperty("Allow Silverfish", true);
		CONFIG.save();
		CONFIG.setProperty("Allow Skeleton", true);
		CONFIG.save();
		CONFIG.setProperty("Allow Spider", true);
		CONFIG.save();
		CONFIG.setProperty("Allow Slime", true);
		CONFIG.save();
		CONFIG.setProperty("Allow Squid", true);
		CONFIG.save();
		CONFIG.setProperty("Allow Zombie", true);
		CONFIG.save();
		log.info("[eMob Lite] - Config created!");
	}	
}