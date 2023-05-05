package vb.$chickenprotect;
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
			PluginMain.getInstance().getLogger().info("ChickenProtect+ Made by Yours Truly has been enabled!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onDisable() {
		try {
			PluginMain.getInstance().getLogger().info("ChickenProtect+ Made by Yours Truly has been disabled!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] commandArgs) {
		if (command.getName().equalsIgnoreCase("AHHHHTPSANDFPSDED")) {
			try {
				for (Object FINAL_loopValue1 : ((List) ((org.bukkit.World) org.bukkit.Bukkit
						.getWorld(String.valueOf(PluginMain.getInstance().getConfig().get("world"))))
								.getLivingEntities())) {
					if (PluginMain.checkEquals(String.valueOf(FINAL_loopValue1), "CraftChicken")) {
						org.bukkit.Bukkit.broadcastMessage("EMERGENCY BUTTON PRESSED!");
						((org.bukkit.entity.Entity) (Object) FINAL_loopValue1).remove();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("chickenprotect")) {
			try {
				commandSender.sendMessage(ChatColor.translateAlternateColorCodes('&',
						"&e&lChickenProtect &7>> &fThe worlds best chicken protector, made by Preva1l (Rodney_RWR)!"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		return true;
	}

	public static void procedure(String procedure, List procedureArgs) throws Exception {
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

	@EventHandler(priority = EventPriority.NORMAL)
	public void event1(org.bukkit.event.entity.EntityDamageEvent event) throws Exception {
		if (((boolean) String.valueOf(((org.bukkit.entity.EntityType) event.getEntityType()))
				.equalsIgnoreCase("chicken"))) {
			if (((boolean) String.valueOf(((org.bukkit.event.entity.EntityDamageEvent.DamageCause) event.getCause()))
					.equalsIgnoreCase("VOID"))) {
				((org.bukkit.entity.Entity) event.getEntity()).teleport(new org.bukkit.Location(
						((org.bukkit.World) org.bukkit.Bukkit
								.getWorld(String.valueOf(PluginMain.getInstance().getConfig().get("world")))),
						((Number) PluginMain.getInstance().getConfig().get("x")).doubleValue(),
						((Number) PluginMain.getInstance().getConfig().get("y")).doubleValue(),
						((Number) PluginMain.getInstance().getConfig().get("z")).doubleValue()));
			}
			event.setCancelled(true);
		}
	}

	@EventHandler(priority = EventPriority.NORMAL)
	public void event2(org.bukkit.event.entity.EntityDamageByEntityEvent event) throws Exception {
		if (((boolean) String.valueOf(((org.bukkit.entity.EntityType) event.getEntityType()))
				.equalsIgnoreCase("chicken"))) {
			event.setCancelled(true);
		}
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void event3(org.bukkit.event.entity.EntityDamageByBlockEvent event) throws Exception {
		if (((boolean) String.valueOf(((org.bukkit.entity.EntityType) event.getEntityType()))
				.equalsIgnoreCase("chicken"))) {
			event.setCancelled(true);
		}
	}

	public static boolean checkEquals(Object o1, Object o2) {
		if (o1 == null || o2 == null) {
			return false;
		}
		return o1 instanceof Number && o2 instanceof Number
				? ((Number) o1).doubleValue() == ((Number) o2).doubleValue()
				: o1.equals(o2);
	}
}
