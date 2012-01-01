package me.Zaros.eMobLite;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.entity.CreatureType;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityListener;
import org.bukkit.event.entity.CreatureSpawnEvent.SpawnReason;
import static me.Zaros.eMobLite.eMobLite.CONFIG;
public class MobSpawn extends EntityListener {
	public static eMobLite plugin;
			
	public MobSpawn(eMobLite instance) {
		plugin = instance;
	}
	
	//Logger log = Logger.getLogger("Minecraft");	
	@Override
	public void onCreatureSpawn(CreatureSpawnEvent event) {
		if (event.getSpawnReason() == SpawnReason.NATURAL){
			if (event.getCreatureType() == CreatureType.CREEPER) {
				try {
					CONFIG.load("config.yml");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvalidConfigurationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if ((CONFIG.getBoolean("Allow Creeper", true)) == false) {		
					event.setCancelled(true);
				}
			}
		}

		if (event.getSpawnReason() == SpawnReason.CUSTOM) {
			//Silverfish
		}
	}
}