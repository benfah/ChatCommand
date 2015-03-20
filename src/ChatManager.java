package me.benfah.manager;

import org.bukkit.plugin.Plugin;

public interface ChatManager {
	
	
	
	public void registerCommand(ChatCommandListener cmdl, String name);
	
	public void unregisterCommand(ChatCommandListener cmdl, String name);
	
	public void setInstance(Plugin p);
	
	public Plugin getInstance();
	
	
	
	
}
