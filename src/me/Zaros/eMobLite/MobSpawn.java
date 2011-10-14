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

	public void onCreatureSpawn(CreatureSpawnEvent event) {

		//Cavespider
		if (event.getCreatureType() == CreatureType.CAVE_SPIDER) {
			if (event.getSpawnReason() == SpawnReason.NATURAL) {
				if ((CONFIG.getBoolean("Allow Cave Spider", true)) == false) {			
					event.setCancelled(true);
				}
			}
		}		

		//Creeper
		if (event.getCreatureType() == CreatureType.CREEPER) {
			if (event.getSpawnReason() == SpawnReason.NATURAL) {
				if ((CONFIG.getBoolean("Allow Creeper", true)) == false) {				
					event.setCancelled(true);
				}
			}
		}
	
		//Enderman
		if (event.getCreatureType() == CreatureType.ENDERMAN) {
			if (event.getSpawnReason() == SpawnReason.NATURAL) {
				if ((CONFIG.getBoolean("Allow Enderman", true)) == false) {				
					event.setCancelled(true);
				}
			}
		}		
		
		//Ghast
		if (event.getCreatureType() == CreatureType.GHAST) {
			if (event.getSpawnReason() == SpawnReason.NATURAL) {
				if ((CONFIG.getBoolean("Allow Ghast", true)) == false) {				
					event.setCancelled(true);
				}
			}
		}		
		
		//Giant
		if (event.getCreatureType() == CreatureType.GIANT) {
			if (event.getSpawnReason() == SpawnReason.NATURAL) {
				if (CONFIG.getBoolean("Allow Giant", true) == false) {			
					event.setCancelled(true);
				}
			}
		}
		
		//Silverfish
		if (event.getCreatureType() == CreatureType.SILVERFISH) {
			if (event.getSpawnReason() == SpawnReason.CUSTOM) {
				if (CONFIG.getBoolean("Allow Silverfish", true) == false) {			
					event.setCancelled(true);
				}
			}
		}
		
		//Skeleton
		if (event.getCreatureType() == CreatureType.SKELETON) {
			if (event.getSpawnReason() == SpawnReason.NATURAL) {
				if ((CONFIG.getBoolean("Allow Skeleton", true)) == false) {
					event.setCancelled(true);
				}
			}
		}
		
		//Slime
		if (event.getCreatureType() == CreatureType.SLIME) {
			if (event.getSpawnReason() == SpawnReason.NATURAL) {
				if ((CONFIG.getBoolean("Allow Slime", true)) == false) {
					event.setCancelled(true);
				}
			}
		}
		
		//Spider
		if (event.getCreatureType() == CreatureType.SPIDER) {
			if (event.getSpawnReason() == SpawnReason.NATURAL) {
				if ((CONFIG.getBoolean("Allow Spider", true)) == false) {
					event.setCancelled(true);
				}
			}
		}
		
		//Squid
		if (event.getCreatureType() == CreatureType.SQUID) {
			if (event.getSpawnReason() == SpawnReason.NATURAL) {
				if ((CONFIG.getBoolean("Allow Squid", true)) == false) {
					event.setCancelled(true);
				}
			}
		}
		
		//Zombie
		if (event.getCreatureType() == CreatureType.ZOMBIE) {
			if (event.getSpawnReason() == SpawnReason.NATURAL) {
				if ((CONFIG.getBoolean("Allow Zombie", true)) == false) {
					event.setCancelled(true);
				}
			}
		}
	}
}