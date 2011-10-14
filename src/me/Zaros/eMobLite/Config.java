package me.Zaros.eMobLite;

import static me.Zaros.eMobLite.eMobLite.CONFIG;

public class Config {
	
	public static void CreeperTrue() {
		CONFIG.setProperty("Allow Creeper", true);
		ConfigSet();
	}
	
	public  static void CreeperFalse() {
		CONFIG.setProperty("Allow Creeper", false);
		ConfigSet();
	}
	
	public static void CSpiderTrue() {
		CONFIG.setProperty("Allow Cave Spider", true);
		ConfigSet();
	}
		
	public static void CSpiderFalse() {
		CONFIG.setProperty("Allow Cave Spider", false);
		ConfigSet();
	}
	
	public static void EndermenTrue() {
		CONFIG.setProperty("Allow Enderman", true);
		ConfigSet();
	}
	
	public static void EndermenFalse() {
		CONFIG.setProperty("Allow Enderman", false);
		ConfigSet();
	}
	
	public static void GhastTrue() {
		CONFIG.setProperty("Allow Ghast", true);
		ConfigSet();
	}
	
	public static void GhastFalse() {
		CONFIG.setProperty("Allow Ghast", false);
		ConfigSet();
	}
	
	public static void GiantTrue() {
		CONFIG.setProperty("Allow Giant", true);
		ConfigSet();
	}
	
	public static void GiantFalse() {
		CONFIG.setProperty("Allow Giant", false);
		ConfigSet();
	}
	
	public  static void SFishTrue() {
		CONFIG.setProperty("Allow Silverfish", true);
		ConfigSet();
	}
	
	public  static void SFishFalse() {
		CONFIG.setProperty("Allow Silverfish", false);
		ConfigSet();
	}
	
	public static void SkeletonTrue() {
		CONFIG.setProperty("Allow Skeleton", true);
		ConfigSet();
	}
	
	public static void SkeletonFalse() {
		CONFIG.setProperty("Allow Skeleton", false);
		ConfigSet();
	}
	
	public static void SlimeTrue() {
		CONFIG.setProperty("Allow Slime", true);
		ConfigSet();
	}
	
	public static void SlimeFalse() {
		CONFIG.setProperty("Allow Slime", false);
		ConfigSet();
	}
	
	public static void SpiderTrue() {
		CONFIG.setProperty("Allow Spider", true);
		ConfigSet();
	}
	
	public static void SpiderFalse() {
		CONFIG.setProperty("Allow Spider", false);
		ConfigSet();
	}
	
	public static void SquidTrue() {
		CONFIG.setProperty("Allow Squid", true);
		ConfigSet();
	}
	
	public static void SquidFalse() {
		CONFIG.setProperty("Allow Squid", false);
		ConfigSet();
	}
	
	public static void ZombieTrue() {
		CONFIG.setProperty("Allow Zombie", true);
		ConfigSet();
	}
	
	public static void ZombieFalse() {
		CONFIG.setProperty("Allow Zombie", false);
		ConfigSet();
	}
	
	public static void AllTrue() {
		CreeperTrue();
		CSpiderTrue();
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
		CONFIG.save();
		CONFIG.load();
	}
}
