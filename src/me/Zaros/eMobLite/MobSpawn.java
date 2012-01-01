package me.Zaros.eMobLite;

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