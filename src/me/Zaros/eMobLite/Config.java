package me.Zaros.eMobLite;

import static me.Zaros.eMobLite.eMobLite.CONFIG;
import java.io.IOException;
import org.bukkit.configuration.InvalidConfigurationException;

public class Config {
	
	
	public static void CreeperTrue() {
		CONFIG.set("Allow Creeper", true);
		ConfigSet();
	}
	
	public  static void CreeperFalse() {
		CONFIG.set("Allow Creeper", false);
		ConfigSet();
	}
	
	public static void CSpiderTrue() {
		CONFIG.set("Allow Cave Spider", true);
		ConfigSet();
	}
		
	public static void CSpiderFalse() {
		CONFIG.set("Allow Cave Spider", false);
		ConfigSet();
	}
	
	public static void DragonTrue() {
		CONFIG.set("Allow Dragon", true);
		ConfigSet();
	}
		
	public static void DragonFalse() {
		CONFIG.set("Allow Dragon", false);
		ConfigSet();
	}

	
	public static void EndermenTrue() {
		CONFIG.set("Allow Enderman", true);
		ConfigSet();
	}
	
	public static void EndermenFalse() {
		CONFIG.set("Allow Enderman", false);
		ConfigSet();
	}
	
	public static void GhastTrue() {
		CONFIG.set("Allow Ghast", true);
		ConfigSet();
	}
	
	public static void GhastFalse() {
		CONFIG.set("Allow Ghast", false);
		ConfigSet();
	}
	
	public static void GiantTrue() {
		CONFIG.set("Allow Giant", true);
		ConfigSet();
	}
	
	public static void GiantFalse() {
		CONFIG.set("Allow Giant", false);
		ConfigSet();
	}
	
	public  static void SFishTrue() {
		CONFIG.set("Allow Silverfish", true);
		ConfigSet();
	}
	
	public  static void SFishFalse() {
		CONFIG.set("Allow Silverfish", false);
		ConfigSet();
	}
	
	public static void SkeletonTrue() {
		CONFIG.set("Allow Skeleton", true);
		ConfigSet();
	}
	
	public static void SkeletonFalse() {
		CONFIG.set("Allow Skeleton", false);
		ConfigSet();
	}
	
	public static void SlimeTrue() {
		CONFIG.set("Allow Slime", true);
		ConfigSet();
	}
	
	public static void SlimeFalse() {
		CONFIG.set("Allow Slime", false);
		ConfigSet();
	}
	
	public static void SpiderTrue() {
		CONFIG.set("Allow Spider", true);
		ConfigSet();
	}
	
	public static void SpiderFalse() {
		CONFIG.set("Allow Spider", false);
		ConfigSet();
	}
	
	public static void SquidTrue() {
		CONFIG.set("Allow Squid", true);
		ConfigSet();
	}
	
	public static void SquidFalse() {
		CONFIG.set("Allow Squid", false);
		ConfigSet();
	}
	
	public static void ZombieTrue() {
		CONFIG.set("Allow Zombie", true);
		ConfigSet();
	}
	
	public static void ZombieFalse() {
		CONFIG.set("Allow Zombie", false);
		ConfigSet();
	}
	
	public static void AllTrue() {
		CreeperTrue();
		CSpiderTrue();
		DragonTrue();
		EndermenTrue();
		GhastTrue();
		GiantTrue();
		SFishTrue();
		SkeletonTrue();
		SpiderTrue();
		SlimeTrue();
		SquidTrue();
		ZombieTrue();
	}
	
	public static void AllFalse() {
		CreeperFalse();
		CSpiderFalse();
		DragonFalse();
		EndermenFalse();
		GhastFalse();
		GiantFalse();
		SFishFalse();
		SkeletonFalse();
		SpiderFalse();
		SlimeFalse();
		SquidFalse();
		ZombieFalse();
	}
	
	public static void ConfigSet() {
		try {
			CONFIG.save("config.yml");
			CONFIG.load("config.yml");
		}
		catch (IOException IOex) {
			System.out.println("[eMob Lite] - Error! Cannot load eMob config!");
			IOex.printStackTrace();
		}
		catch (InvalidConfigurationException ICEex) {
			System.out.println("[eMob Lite] - Error! Cannot load eMob config!");
			ICEex.printStackTrace();
		}
	}
}
