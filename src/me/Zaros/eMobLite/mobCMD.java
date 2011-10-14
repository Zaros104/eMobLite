package me.Zaros.eMobLite;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static me.Zaros.eMobLite.Config.*;
import static me.Zaros.eMobLite.List.*;
import static me.Zaros.eMobLite.eMobLite.CONFIG;


public class mobCMD implements CommandExecutor {
	public static eMobLite plugin;

	public mobCMD(eMobLite instance) {
		plugin = instance;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {

		if (cmd.getName().equalsIgnoreCase("mob")) {
			if (args.length == 1) {
				if (args[0].equalsIgnoreCase("list")) {
					if (sender instanceof Player){
						if ((sender.isOp()) || sender.hasPermission("eMobLite.list")) {
							sender.sendMessage(ChatColor.YELLOW + "##########-Mob List-###########)");
							Boolean AllowCreep = CONFIG.getBoolean("Allow Creeper", true);
							Boolean AllowCSpider = CONFIG.getBoolean("Allow Cave Spider", true);
							Boolean AllowEnder = CONFIG.getBoolean("Allow Enderman", true);
							Boolean AllowGhast = CONFIG.getBoolean("Allow Ghast", true);
							Boolean AllowGiant = CONFIG.getBoolean("Allow Giant", true);
							Boolean AllowSilver = CONFIG.getBoolean("Allow Silverfish", true);
							Boolean AllowSkele = CONFIG.getBoolean("Allow Skeleton", true);
							Boolean AllowSlime = CONFIG.getBoolean("Allow Slime", true);
							Boolean AllowSpider = CONFIG.getBoolean("Allow Spider", true);
							Boolean AllowSquid = CONFIG.getBoolean("Allow Squid", true);
							Boolean AllowZombie = CONFIG.getBoolean("Allow Zombie", true);

							if (AllowCreep == true) {
								sender.sendMessage(MSGCreepT);
							} else
								sender.sendMessage(MSGCreepF);

							if (AllowCSpider == true) {
								sender.sendMessage(MSGCSpidT);
							} else
								sender.sendMessage(MSGCSpidF);

							if (AllowEnder == true) {
								sender.sendMessage(MSGEnderT);
							} else
								sender.sendMessage(MSGEnderF);

							if (AllowGhast == true) {
								sender.sendMessage(MSGGhastT);
							} else
								sender.sendMessage(MSGGhastF);

							if (AllowGiant == true) {
								sender.sendMessage(MSGGiantT);
							} else
								sender.sendMessage(MSGGiantF);

							if (AllowSilver == true) {
								sender.sendMessage(MSGSFishT);
							} else
								sender.sendMessage(MSGSFishF);

							if (AllowSkele == true) {
								sender.sendMessage(MSGSkeleT);
							} else
								sender.sendMessage(MSGSkeleF);

							if (AllowSlime == true) {
								sender.sendMessage(MSGSlimeT);
							} else
								sender.sendMessage(MSGSlimeF);

						if (AllowSpider == true) {
								sender.sendMessage(MSGSpiderT);
							} else
								sender.sendMessage(MSGSpiderF);
						
							if (AllowSquid == true) {
								sender.sendMessage(MSGSquidT);
							} else
								sender.sendMessage(MSGSquidF);

							if (AllowZombie == true) {
								sender.sendMessage(MSGZombieT);
							} else
								sender.sendMessage(MSGZombieF);
						
							return true;
						} else sender.sendMessage(ChatColor.RED + "You do not have permission to do this.");
					}else sender.sendMessage("This is not enabled for console.");
				}// for arg[0].equals("list")
				if (args[0].equalsIgnoreCase("help")); {
					if ((sender.isOp()) || sender.hasPermission("eMobLite.help")) {
						sender.sendMessage(ChatColor.GREEN + "##########-Mob Help-###########");
						sender.sendMessage("Type '/mob <mobname> <true|false>' to enable and disable mobs");
						sender.sendMessage("Type '/mob list' for a list of mobs");
						return true;
					} else
						sender.sendMessage(ChatColor.RED + "You do not have permission to do this.");
				}// for arg[0].equals("help")
			}// for args.length == 1
			if (args.length >= 2) {
				if ((sender.isOp()) || sender.hasPermission("eMobLite.mobs")) {
					if (args[0].equalsIgnoreCase("creeper")) {
						if (args[1].equalsIgnoreCase("true")) {
							CreeperTrue();
							sender.sendMessage(ChatColor.GREEN + "Creepers enabled!");
							return true;
						}
						if (args[1].equalsIgnoreCase("false")) {
							CreeperFalse();
							sender.sendMessage(ChatColor.RED + "Creepers disabled!");
							return true;
						}
					}

					if (args[0].equalsIgnoreCase("cavespider")) {
						if (args[1].equalsIgnoreCase("true")) {
							CSpiderTrue();
							sender.sendMessage(ChatColor.GREEN + "Cave Spider enabled!");
							return true;
						}
						if (args[1].equalsIgnoreCase("false")) {
							CSpiderFalse();
							sender.sendMessage(ChatColor.RED + "Cave Spider disabled!");
							return true;
						}
					}

					if (args[0].equalsIgnoreCase("endermen")) {
						if (args[1].equalsIgnoreCase("true")) {
							EndermenTrue();
							sender.sendMessage(ChatColor.GREEN + "Endermen enabled!");
							return true;
						}
						if (args[1].equalsIgnoreCase("false")) {
							EndermenFalse();
							sender.sendMessage(ChatColor.RED + "Endermen disabled!");
							return true;
						}
					}

					if (args[0].equalsIgnoreCase("ghast")) {
						if (args[1].equalsIgnoreCase("true")) {
							GhastTrue();
							sender.sendMessage(ChatColor.GREEN + "Ghast enabled!");
							return true;
						}
						if (args[1].equalsIgnoreCase("false")) {
							GhastFalse();
							sender.sendMessage(ChatColor.RED + "Ghast disabled!");
							return true;
						}
					}

					if (args[0].equalsIgnoreCase("giant")) {
						if (args[1].equalsIgnoreCase("true")) {
							GiantTrue();
							sender.sendMessage(ChatColor.GREEN + "Giant enabled!");
							return true;
						}
						if (args[1].equalsIgnoreCase("false")) {
							GiantFalse();
							sender.sendMessage(ChatColor.RED + "Giant disabled!");
							return true;
						}
					}

					if (args[0].equalsIgnoreCase("silverfish")) {
						if (args[1].equalsIgnoreCase("true")) {
							SFishTrue();
							sender.sendMessage(ChatColor.GREEN + "Silver Fish enabled!");
							return true;
						}
						if (args[1].equalsIgnoreCase("false")) {
							SFishFalse();
							sender.sendMessage(ChatColor.RED + "Silver Fish disabled!");
							return true;
						}
					}

					if (args[0].equalsIgnoreCase("skeleton")) {
						if (args[1].equalsIgnoreCase("true")) {
							SkeletonTrue();
							sender.sendMessage(ChatColor.GREEN + "Skeleton enabled!");
							return true;
						}
						if (args[1].equalsIgnoreCase("false")) {
							SkeletonFalse();
							sender.sendMessage(ChatColor.RED + "Skeleton disabled!");
							return true;
						}
					}

					if (args[0].equalsIgnoreCase("slime")) {
						if (args[1].equalsIgnoreCase("true")) {
							SlimeTrue();
							sender.sendMessage(ChatColor.GREEN + "Slime enabled!");
							return true;
						}
						if (args[1].equalsIgnoreCase("false")) {
							SlimeFalse();
							sender.sendMessage(ChatColor.RED + "Slime disabled!");
							return true;
						}
					}

					if (args[0].equalsIgnoreCase("spider")) {
						if (args[1].equalsIgnoreCase("true")) {
							SpiderTrue();
							sender.sendMessage(ChatColor.GREEN + "Spider enabled!");
							return true;
						}
						if (args[1].equalsIgnoreCase("false")) {
							SpiderFalse();
							sender.sendMessage(ChatColor.RED + "Spider disabled!");
							return true;
						}
					}

					if (args[0].equalsIgnoreCase("squid")) {
						if (args[1].equalsIgnoreCase("true")) {
							SquidTrue();
							sender.sendMessage(ChatColor.GREEN + "Squid enabled!");
							return true;
						}
						if (args[1].equalsIgnoreCase("false")) {
							SquidFalse();
							sender.sendMessage(ChatColor.RED + "Squid disabled!");
							return true;
						}
					}
					
					if (args[0].equalsIgnoreCase("zombie")) {
						if (args[1].equalsIgnoreCase("true")) {
							ZombieTrue();
							sender.sendMessage(ChatColor.GREEN + "Zombie enabled!");
							return true;
						}
						if (args[1].equalsIgnoreCase("false")) {
							ZombieFalse();
							sender.sendMessage(ChatColor.RED + "Zombie disabled!");
							return true;
						}
					}
					
					if (args[0].equalsIgnoreCase("all")) {
						if (args[1].equalsIgnoreCase("true")) {
							AllTrue();
							sender.sendMessage(ChatColor.GREEN + "All mobs enabled!");
							return true;
						}
						if (args[1].equalsIgnoreCase("false")) {
							AllFalse();
							sender.sendMessage(ChatColor.RED + "All mobs disabled!");
							return true;
						}
					}
				}else sender.sendMessage(ChatColor.RED + "You do not have permission to do this.");
			}
		}// for mob command
		return false;
	}
}
