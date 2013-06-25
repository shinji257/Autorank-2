package me.armar.plugins.autorank.language;

import me.armar.plugins.autorank.Autorank;

/**
 * @author Vincent
 * English Language Class
 *
 */
public class English extends Language {
	
	private Autorank autorank;
	private String language = "English";
	private String playerNotOnline;
	private String noPermission;
	private String cannotCheckConsole;
	private String playTimeChanged;
	private String invalidFormat;
	private String autorankReloaded;
	private String hasPlayedFor;
	private String isIn;
	private String noGroups;
	private String oneGroup;
	private String multipleGroups;
	private String noNextRankup;
	private String meetsRequirements;
	private String rankedUpNow;
	private String doesntMeetRequirements;
	private String dataImported;
	private String timeRequirement;
	private String worldRequirement;
	private String voteRequirement;
	private String moneyRequirement;
	
	public English(Autorank autorank) {
		setAutorank(autorank);
		playerNotOnline = "%player% is not online!";
		noPermission = "You need to have (%permission%) to do this!";
		cannotCheckConsole = "Cannot check for console.";
		playTimeChanged = "Changed playtime of %player% to %value%.";
		invalidFormat = "Invalid format, use %format%";
		autorankReloaded = "Reloaded Autorank!";
		hasPlayedFor = " has played for ";
		isIn = "is in ";
		noGroups = "no groups.";
		oneGroup = "group ";
		multipleGroups = "groups ";
		noNextRankup = "and doesn't have a next rankup.";
		meetsRequirements = "meets all the requirements for rank ";
		rankedUpNow = " and will now be ranked up.";
		doesntMeetRequirements = "and doesn't meet the requirements for rank ";
		dataImported = "New data has been imported!";
		timeRequirement = "Playtime needs to be %time% or higher.";
		worldRequirement = "Need to be in world %world%.";
		voteRequirement = "Need to have voted at least %votes% times.";
		moneyRequirement = "Need to have at least %money%.";
	}
	
	@Override
	public String getPlayerNotOnline(String playerName) {
		// TODO Auto-generated method stub
		return playerNotOnline.replace("%player%", playerName);
	}

	@Override
	public void setAutorank(Autorank autorank) {
		this.autorank = autorank;
		
	}

	@Override
	public Autorank getAutorank() {
		return autorank;
	}

	@Override
	public String getNoPermission(String permission) {
		return noPermission.replace("%permission%", permission);
	}


	@Override
	public String getLanguage() {
		// TODO Auto-generated method stub
		return language;
	}

	@Override
	public String getCannotCheckConsole() {
		// TODO Auto-generated method stub
		return cannotCheckConsole;
	}

	@Override
	public String getPlayTimeChanged(String playerName, int value) {
		// TODO Auto-generated method stub
		return playTimeChanged.replace("%player%", playerName).replace("%value%", value + "");
	}

	@Override
	public String getInvalidFormat(String format) {
		// TODO Auto-generated method stub
		return invalidFormat.replace("%format%", format);
	}

	@Override
	public String getAutorankReloaded() {
		// TODO Auto-generated method stub
		return autorankReloaded;
	}

	@Override
	public String getHasPlayedFor() {
		// TODO Auto-generated method stub
		return hasPlayedFor;
	}

	@Override
	public String getIsIn() {
		// TODO Auto-generated method stub
		return isIn;
	}

	@Override
	public String getNoGroups() {
		// TODO Auto-generated method stub
		return noGroups;
	}

	@Override
	public String getOneGroup() {
		// TODO Auto-generated method stub
		return oneGroup;
	}

	@Override
	public String getMultipleGroups() {
		// TODO Auto-generated method stub
		return multipleGroups;
	}

	@Override
	public String getNoNextRankup() {
		// TODO Auto-generated method stub
		return noNextRankup;
	}

	@Override
	public String getMeetsRequirements() {
		// TODO Auto-generated method stub
		return meetsRequirements;
	}

	@Override
	public String getRankedUpNow() {
		// TODO Auto-generated method stub
		return rankedUpNow;
	}

	@Override
	public String getDoesntMeetRequirements() {
		// TODO Auto-generated method stub
		return doesntMeetRequirements;
	}
	
	@Override
	public String getDataImported() {
		// TODO Auto-generated method stub
		return dataImported;
	}
	
	@Override
	public String getTimeRequirement(String time) {
		// TODO Auto-generated method stub
		return timeRequirement.replace("%time%", time);
	}
	
	@Override
	public String getWorldRequirement(String world) {
		// TODO Auto-generated method stub
		return worldRequirement.replace("%world%", world);
	}
	
	@Override
	public String getVoteRequirement(int votes) {
		// TODO Auto-generated method stub
		return voteRequirement.replace("%votes%", votes + "");
	}
	
	@Override
	public String getMoneyRequirement(int money) {
		// TODO Auto-generated method stub
		return moneyRequirement.replace("%money%", money + "");
	}
}
