package vb.$chickengenerators;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.event.*;
import org.bukkit.plugin.java.*;

public class PluginMain extends JavaPlugin implements Listener {

	private static PluginMain instance;

	@Override
	public void onEnable() {
		instance = this;
		getServer().getPluginManager().registerEvents(this, this);
		saveDefaultConfig();
		try {
			PluginMain.procedure("updateGens", new ArrayList());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onDisable() {
	}

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] commandArgs) {
		if (command.getName().equalsIgnoreCase("chickengens")) {
			Object $1235dda31a80c7150cac21b4a1c6dbaa = null;
			Object $95e049999c8f0b1705e0ef926e7a9638 = null;
			Object $657e3deb01abb9adeb24b0582261a57b = null;
			Object $492a8d50ee94698e3f6ffa74a8ee739e = null;
			Object $71cd523f00d7d5af25724a4c54e4617a = null;
			Object $e2b2aa2560ded671d5bc4e9ad8786337 = null;
			Object $c285b1710832ca6cee96edb7879b767f = null;
			Object $315e67161ea06da4920c33d48cd56a6a = null;
			try {
				if (((commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null) == null)) {
					commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
							"&eChickenGenerators &7>> &fInvalid sytax: /cg <add|remove> [block] [interval]"));
				} else if (((boolean) (commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null)
						.equalsIgnoreCase("add"))) {
					if (((commandArgs.length > ((int) (1d)) ? commandArgs[((int) (1d))] : null) == null)) {
						commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
								"&eChickenGens &7>> &fgeez ur a dumbcunt, Usage: /cg <add|remove> <block> <interval>"));
					}
					if (!((commandArgs.length > ((int) (1d)) ? commandArgs[((int) (1d))] : null) == null)) {
						if (((commandArgs.length > ((int) (2d)) ? commandArgs[((int) (2d))] : null) == null)) {
							commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
									"&eChickenGens &7>> &fgeez ur a dumbcunt, Usage: /cg <add|remove> <block> <interval>"));
						} else if (!((commandArgs.length > ((int) (2d)) ? commandArgs[((int) (2d))] : null) == null)) {
							if (!(((org.bukkit.Material) org.bukkit.Material
									.getMaterial(((java.lang.String) (commandArgs.length > ((int) (1d))
											? commandArgs[((int) (1d))]
											: null).toUpperCase()))) == null)) {
								((org.bukkit.entity.Entity) (Object) commandSender).teleport(new org.bukkit.Location(
										((org.bukkit.World) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) commandSender)
												.getLocation()).getWorld()),
										(((double) ((long) Math.floor(
												((double) ((int) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) commandSender)
														.getLocation()).getBlockX())))))
												+ (0.5d)),
										((double) ((int) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) commandSender)
												.getLocation()).getBlockY())),
										(((double) ((long) Math.floor(
												((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) commandSender)
														.getLocation()).getZ()))))
												+ (0.5d))));
								commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
										"&eChickenGens &7>> &fGenerator created!"));
								commandSender.sendMessage((ChatColor.translateAlternateColorCodes('&',
										"&eLocation&7: &f")
										+ String.valueOf(
												((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) commandSender)
														.getLocation()))));
								commandSender.sendMessage((ChatColor.translateAlternateColorCodes('&', "&eBlock&7: &f")
										+ (commandArgs.length > ((int) (1d)) ? commandArgs[((int) (1d))] : null)));
								commandSender.sendMessage((ChatColor.translateAlternateColorCodes('&',
										"&eInterval&7: &f")
										+ (commandArgs.length > ((int) (2d)) ? commandArgs[((int) (2d))] : null)));
								$e2b2aa2560ded671d5bc4e9ad8786337 = new ArrayList(Arrays.asList(
										((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) commandSender)
												.getLocation())));
								((java.util.List) (Object) $e2b2aa2560ded671d5bc4e9ad8786337)
										.addAll(((java.util.Collection) (Object) PluginMain.getInstance().getConfig()
												.get("locations")));
								PluginMain.getInstance().getConfig().set("locations",
										$e2b2aa2560ded671d5bc4e9ad8786337);
								$315e67161ea06da4920c33d48cd56a6a = new ArrayList(
										Arrays.asList(new ArrayList(Arrays.asList(
												((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) commandSender)
														.getLocation()),
												(commandArgs.length > ((int) (1d))
														? commandArgs[((int) (1d))]
														: null)))));
								((java.util.List) (Object) $315e67161ea06da4920c33d48cd56a6a)
										.addAll(((java.util.Collection) (Object) PluginMain.getInstance().getConfig()
												.get("blocks")));
								PluginMain.getInstance().getConfig().set("blocks", $315e67161ea06da4920c33d48cd56a6a);
								$657e3deb01abb9adeb24b0582261a57b = new ArrayList(
										Arrays.asList(new ArrayList(Arrays.asList(
												((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) commandSender)
														.getLocation()),
												(commandArgs.length > ((int) (2d))
														? commandArgs[((int) (2d))]
														: null)))));
								((java.util.List) (Object) $657e3deb01abb9adeb24b0582261a57b)
										.addAll(((java.util.Collection) (Object) PluginMain.getInstance().getConfig()
												.get("intervals")));
								PluginMain.getInstance().getConfig().set("intervals",
										$657e3deb01abb9adeb24b0582261a57b);
								PluginMain.getInstance().saveConfig();
							} else {
								commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
										"&eChickenGenerators &7>> &fNot a valid block!"));
							}
						}
					}
					PluginMain.procedure("updateGens", new ArrayList());
				} else if (((boolean) (commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null)
						.equalsIgnoreCase("remove"))) {
					((org.bukkit.entity.Entity) (Object) commandSender).teleport(new org.bukkit.Location(
							((org.bukkit.World) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) commandSender)
									.getLocation()).getWorld()),
							(((double) ((long) Math.floor(
									((double) ((int) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) commandSender)
											.getLocation()).getBlockX())))))
									+ (0.5d)),
							((double) ((int) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) commandSender)
									.getLocation()).getBlockY())),
							(((double) ((long) Math.floor(
									((double) ((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) commandSender)
											.getLocation()).getZ()))))
									+ (0.5d))));
					if (((boolean) ((java.util.List) (Object) PluginMain.getInstance().getConfig().get("locations"))
							.contains(((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) commandSender)
									.getLocation())))) {
						$1235dda31a80c7150cac21b4a1c6dbaa = new ArrayList();
						((java.util.List) (Object) $1235dda31a80c7150cac21b4a1c6dbaa)
								.addAll(((java.util.Collection) (Object) PluginMain.getInstance().getConfig()
										.get("locations")));
						$492a8d50ee94698e3f6ffa74a8ee739e = new ArrayList();
						((java.util.List) (Object) $492a8d50ee94698e3f6ffa74a8ee739e).addAll(
								((java.util.Collection) (Object) PluginMain.getInstance().getConfig().get("blocks")));
						$71cd523f00d7d5af25724a4c54e4617a = new ArrayList();
						((java.util.List) (Object) $71cd523f00d7d5af25724a4c54e4617a)
								.addAll(((java.util.Collection) (Object) PluginMain.getInstance().getConfig()
										.get("intervals")));
						commandSender.sendMessage(
								ChatColor.translateAlternateColorCodes('&', "&eChickenGens &7>> &fGenerator deleted!"));
						for (Object FINAL_loopValue1 : ((java.util.List) (Object) $71cd523f00d7d5af25724a4c54e4617a)) {
							if (((boolean) String.valueOf(
									((java.lang.Object) ((java.util.List) (Object) FINAL_loopValue1).get(((int) (0d)))))
									.equalsIgnoreCase(String.valueOf(
											((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) commandSender)
													.getLocation()))))) {
								$95e049999c8f0b1705e0ef926e7a9638 = PluginMain.getInstance().getConfig()
										.get("intervals");
								((java.util.List) (Object) $95e049999c8f0b1705e0ef926e7a9638).remove(FINAL_loopValue1);
								PluginMain.getInstance().getConfig().set("intervals",
										$95e049999c8f0b1705e0ef926e7a9638);
								for (Object FINAL_loopValue2 : ((java.util.List) (Object) $492a8d50ee94698e3f6ffa74a8ee739e)) {
									if (((boolean) String
											.valueOf(((java.lang.Object) ((java.util.List) (Object) FINAL_loopValue2)
													.get(((int) (0d)))))
											.equalsIgnoreCase(String.valueOf(
													((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) commandSender)
															.getLocation()))))) {
										$315e67161ea06da4920c33d48cd56a6a = PluginMain.getInstance().getConfig()
												.get("blocks");
										((java.util.List) (Object) $315e67161ea06da4920c33d48cd56a6a)
												.remove(FINAL_loopValue2);
										PluginMain.getInstance().getConfig().set("blocks",
												$315e67161ea06da4920c33d48cd56a6a);
										for (Object FINAL_loopValue3 : ((java.util.List) (Object) $1235dda31a80c7150cac21b4a1c6dbaa)) {
											if (((boolean) String.valueOf(FINAL_loopValue3)
													.equalsIgnoreCase(String.valueOf(
															((org.bukkit.Location) ((org.bukkit.entity.Entity) (Object) commandSender)
																	.getLocation()))))) {
												$c285b1710832ca6cee96edb7879b767f = PluginMain.getInstance().getConfig()
														.get("locations");
												((java.util.List) (Object) $c285b1710832ca6cee96edb7879b767f)
														.remove(FINAL_loopValue3);
												PluginMain.getInstance().getConfig().set("locations",
														$c285b1710832ca6cee96edb7879b767f);
												PluginMain.getInstance().saveConfig();
												org.bukkit.Bukkit.dispatchCommand(
														((org.bukkit.command.CommandSender) (Object) ((org.bukkit.command.ConsoleCommandSender) org.bukkit.Bukkit
																.getConsoleSender())),
														"plugman restart ChickenGenerators");
											}
										}
									}
								}
							}
						}
					}
				} else if (((boolean) (commandArgs.length > ((int) (0d)) ? commandArgs[((int) (0d))] : null)
						.equalsIgnoreCase("about"))) {
					commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
							"&eChickenGenerators &7>> &fPlugin made by Preva1l (Rodney_RWR) for ChickenCraft!"));
				} else {
					commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
							"&eChickenGenerators &7>> &fInvalid sytax: /cg <add|remove> [block] [interval]"));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		return true;
	}

	public static void procedure(String procedure, List procedureArgs) throws Exception {
		if (procedure.equalsIgnoreCase("updateGens")) {
			Object $11c2d35e1d7a6e8eb32c00ea6e222a7b = null;
			Object $88ac0d14ef381707dee4b1a79439d927 = null;
			Object $4162f111d5bdd570b4592f9bfef7029a = null;
			Object $e2b0a52296738d9087d48e40de20bb51 = null;
			Object $792b414ad2346698b52d7c46b55ee093 = null;
			$e2b0a52296738d9087d48e40de20bb51 = ((java.lang.Object) (Object) (0d));
			$11c2d35e1d7a6e8eb32c00ea6e222a7b = PluginMain.getInstance().getConfig().get("locations");
			while ((((Number) $e2b0a52296738d9087d48e40de20bb51)
					.doubleValue() < ((double) ((int) ((java.util.List) (Object) $11c2d35e1d7a6e8eb32c00ea6e222a7b)
							.size())))) {
				for (Object FINAL_loopValue1 : PluginMain
						.createList(PluginMain.getInstance().getConfig().getKeys(true))) {
					if (((boolean) String.valueOf(FINAL_loopValue1).equalsIgnoreCase("blocks"))) {
						$88ac0d14ef381707dee4b1a79439d927 = PluginMain.getInstance().getConfig()
								.get(String.valueOf(FINAL_loopValue1));
						for (Object FINAL_loopValue2 : ((java.util.List) (Object) $88ac0d14ef381707dee4b1a79439d927)) {
							if (((boolean) String.valueOf(
									((java.lang.Object) ((java.util.List) (Object) $11c2d35e1d7a6e8eb32c00ea6e222a7b)
											.get(((Number) $e2b0a52296738d9087d48e40de20bb51).intValue())))
									.equalsIgnoreCase(String
											.valueOf(((java.lang.Object) ((java.util.List) (Object) FINAL_loopValue2)
													.get(((int) (0d)))))))) {
								$792b414ad2346698b52d7c46b55ee093 = ((java.lang.Object) ((java.util.List) (Object) FINAL_loopValue2)
										.get(((int) (1d))));
							}
						}
					} else if (((boolean) String.valueOf(FINAL_loopValue1).equalsIgnoreCase("intervals"))) {
						$4162f111d5bdd570b4592f9bfef7029a = PluginMain.getInstance().getConfig()
								.get(String.valueOf(FINAL_loopValue1));
						for (Object FINAL_loopValue2 : ((java.util.List) (Object) $4162f111d5bdd570b4592f9bfef7029a)) {
							if (((boolean) String.valueOf(
									((java.lang.Object) ((java.util.List) (Object) $11c2d35e1d7a6e8eb32c00ea6e222a7b)
											.get(((Number) $e2b0a52296738d9087d48e40de20bb51).intValue())))
									.equalsIgnoreCase(String
											.valueOf(((java.lang.Object) ((java.util.List) (Object) FINAL_loopValue2)
													.get(((int) (0d)))))))) {
								Object TEMP_emmgflOJxaEdOeiX = $11c2d35e1d7a6e8eb32c00ea6e222a7b;
								Object TEMP_EyWaXbinaPTwCdmd = $e2b0a52296738d9087d48e40de20bb51;
								Object TEMP_yfWAaJzOuStWNUdw = $792b414ad2346698b52d7c46b55ee093;
								new org.bukkit.scheduler.BukkitRunnable() {
									Object FINAL_OwkWkcNoSUCjwmIh = TEMP_emmgflOJxaEdOeiX;
									Object FINAL_YVKZJNlzjyJvroFA = TEMP_EyWaXbinaPTwCdmd;
									Object FINAL_LVsBvzxysnhhDTIj = TEMP_yfWAaJzOuStWNUdw;

									public void run() {
										try {
											if ((((boolean) String.valueOf(
													((double) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
															.get(((Number) FINAL_YVKZJNlzjyJvroFA).intValue())))
																	.getX()))
													.contains(String.valueOf("-")))
													&& ((boolean) String.valueOf(
															((double) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
																	.get(((Number) FINAL_YVKZJNlzjyJvroFA).intValue())))
																			.getZ()))
															.contains(String.valueOf("-"))))) {
												((org.bukkit.block.Block) ((org.bukkit.World) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
														.get(((Number) FINAL_YVKZJNlzjyJvroFA).intValue()))).getWorld())
																.getBlockAt(
																		((int) (((double) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
																				.get(((Number) FINAL_YVKZJNlzjyJvroFA)
																						.intValue()))).getX())
																				- (1d))),
																		((int) ((double) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
																				.get(((Number) FINAL_YVKZJNlzjyJvroFA)
																						.intValue()))).getY())),
																		((int) (((double) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
																				.get(((Number) FINAL_YVKZJNlzjyJvroFA)
																						.intValue()))).getZ())
																				- (1d))))).setType(
																						((org.bukkit.Material) org.bukkit.Material
																								.getMaterial(
																										((java.lang.String) String
																												.valueOf(
																														FINAL_LVsBvzxysnhhDTIj)
																												.toUpperCase()))));
											} else if (((boolean) String.valueOf(
													((double) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
															.get(((Number) FINAL_YVKZJNlzjyJvroFA).intValue())))
																	.getX()))
													.contains(String.valueOf("-")))) {
												((org.bukkit.block.Block) ((org.bukkit.World) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
														.get(((Number) FINAL_YVKZJNlzjyJvroFA).intValue()))).getWorld())
																.getBlockAt(
																		((int) (((double) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
																				.get(((Number) FINAL_YVKZJNlzjyJvroFA)
																						.intValue()))).getX())
																				- (1d))),
																		((int) ((double) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
																				.get(((Number) FINAL_YVKZJNlzjyJvroFA)
																						.intValue()))).getY())),
																		((int) ((double) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
																				.get(((Number) FINAL_YVKZJNlzjyJvroFA)
																						.intValue()))).getZ()))))
																								.setType(
																										((org.bukkit.Material) org.bukkit.Material
																												.getMaterial(
																														((java.lang.String) String
																																.valueOf(
																																		FINAL_LVsBvzxysnhhDTIj)
																																.toUpperCase()))));
											} else if (((boolean) String.valueOf(
													((double) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
															.get(((Number) FINAL_YVKZJNlzjyJvroFA).intValue())))
																	.getZ()))
													.contains(String.valueOf("-")))) {
												((org.bukkit.block.Block) ((org.bukkit.World) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
														.get(((Number) FINAL_YVKZJNlzjyJvroFA).intValue()))).getWorld())
																.getBlockAt(
																		((int) ((double) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
																				.get(((Number) FINAL_YVKZJNlzjyJvroFA)
																						.intValue()))).getX())),
																		((int) ((double) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
																				.get(((Number) FINAL_YVKZJNlzjyJvroFA)
																						.intValue()))).getY())),
																		((int) (((double) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
																				.get(((Number) FINAL_YVKZJNlzjyJvroFA)
																						.intValue()))).getZ())
																				- (1d))))).setType(
																						((org.bukkit.Material) org.bukkit.Material
																								.getMaterial(
																										((java.lang.String) String
																												.valueOf(
																														FINAL_LVsBvzxysnhhDTIj)
																												.toUpperCase()))));
											} else {
												((org.bukkit.block.Block) ((org.bukkit.World) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
														.get(((Number) FINAL_YVKZJNlzjyJvroFA).intValue()))).getWorld())
																.getBlockAt(
																		((int) ((double) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
																				.get(((Number) FINAL_YVKZJNlzjyJvroFA)
																						.intValue()))).getX())),
																		((int) ((double) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
																				.get(((Number) FINAL_YVKZJNlzjyJvroFA)
																						.intValue()))).getY())),
																		((int) ((double) ((org.bukkit.Location) (Object) ((java.lang.Object) ((java.util.List) (Object) FINAL_OwkWkcNoSUCjwmIh)
																				.get(((Number) FINAL_YVKZJNlzjyJvroFA)
																						.intValue()))).getZ()))))
																								.setType(
																										((org.bukkit.Material) org.bukkit.Material
																												.getMaterial(
																														((java.lang.String) String
																																.valueOf(
																																		FINAL_LVsBvzxysnhhDTIj)
																																.toUpperCase()))));
											}
										} catch (Exception ex) {
											ex.printStackTrace();
										}
									}
								}.runTaskTimer(PluginMain.getInstance(), 0,
										((long) (Double.parseDouble(String.valueOf(
												((java.lang.Object) ((java.util.List) (Object) FINAL_loopValue2)
														.get(((int) (1d))))))
												* (20d))));
							}
						}
					}
				}
				$e2b0a52296738d9087d48e40de20bb51 = ((java.lang.Object) (Object) (((Number) $e2b0a52296738d9087d48e40de20bb51)
						.doubleValue() + (1d)));
			}
			return;
		}
	}

	public static Object function(String function, List functionArgs) throws Exception {
		return null;
	}

	public static List createList(Object obj) {
		if (obj instanceof List) {
			return (List) obj;
		}
		List list = new ArrayList<>();
		if (obj.getClass().isArray()) {
			int length = java.lang.reflect.Array.getLength(obj);
			for (int i = 0; i < length; i++) {
				list.add(java.lang.reflect.Array.get(obj, i));
			}
		} else if (obj instanceof Collection<?>) {
			list.addAll((Collection<?>) obj);
		} else if (obj instanceof Iterator) {
			((Iterator<?>) obj).forEachRemaining(list::add);
		} else {
			list.add(obj);
		}
		return list;
	}

	public static void createResourceFile(String path) {
		Path file = getInstance().getDataFolder().toPath().resolve(path);
		if (Files.notExists(file)) {
			try (InputStream inputStream = PluginMain.class.getResourceAsStream("/" + path)) {
				Files.createDirectories(file.getParent());
				Files.copy(inputStream, file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static PluginMain getInstance() {
		return instance;
	}

	@Override
	public java.util.List<String> onTabComplete(CommandSender commandSender, Command command, String alias,
			String[] commandArgs) {
		if (command.getName().equalsIgnoreCase("chickengens")) {
			try {
				if ((((double) ((int) PluginMain.createList(commandArgs).size())) <= (1d))) {
					if (true)
						return ((false)
								? PluginMain.formatList(new ArrayList(Arrays.asList("add", "remove", "about")),
										commandArgs)
								: new ArrayList(Arrays.asList("add", "remove", "about")));
				} else {
					if (true)
						return ((true) ? PluginMain.formatList(new ArrayList(), commandArgs) : new ArrayList());
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			return null;
		}
		return null;
	}

	public static java.util.List<String> formatList(java.util.List<String> list, String[] args) {
		java.util.List<String> completions = new java.util.ArrayList<>();
		org.bukkit.util.StringUtil.copyPartialMatches(args[args.length - 1], list, completions);
		java.util.Collections.sort(completions);
		return completions;
	}
}
