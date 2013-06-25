package me.armar.plugins.autorank.playerchecker.requirement;

import me.armar.plugins.autorank.Autorank;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class BlocksBrokenRequirement extends Requirement {

	private int blocksBroken = 0;
	private Autorank plugin;

	public BlocksBrokenRequirement() {
		super();
		plugin = (Autorank) Bukkit.getPluginManager().getPlugin("Autorank");
	}
	
	@Override
	public boolean setOptions(String[] options) {
		try {
			blocksBroken = Integer.parseInt(options[0]);
			return true;
		} catch (Exception e) {
			blocksBroken = 0;
			return false;
		}
	}

	@Override
	public boolean meetsRequirement(Player player) {
		// TODO Auto-generated method stub
		return plugin.getStatsHandler().isEnabled() && plugin.getStatsHandler().getTotalBlocksBroken(player.getName()) >= blocksBroken;
	}

	@Override
	public String getDescription() {
		return "Need a minimum of " + blocksBroken + " blocks broken.";
	}

}
