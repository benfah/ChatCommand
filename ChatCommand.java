package me.benfah.manager;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class ChatCommand implements ChatInfo{

	protected static List<ChatCommandListener> ccl = new ArrayList<ChatCommandListener>();
	protected static List<String> cmds = new ArrayList<String>();

	protected static Plugin instance;
	
		
		
		
		

	
	

	
	public static ChatManager get()
	{
		
		
		
		return new ChatManager() {
			
			@Override
			public void registerCommand(ChatCommandListener cmdl, String name)
{				
				if(!ccl.contains(cmdl))
				{
				ccl.add(cmdl);
				
				}
				if(!cmds.contains(name))
				{
				cmds.add(name);	
				}
			}
			
			@Override
			public void unregisterCommand(ChatCommandListener cmdl, String name)
			{
				if(ccl.contains(cmdl))
				{
				ccl.remove(cmdl);
				}
				if(cmds.contains(name))
				{
				cmds.remove(name);	
				}
			}

			@Override
			public void setInstance(Plugin p) {
				instance = p;
				Bukkit.getPluginManager().registerEvents(new ChatEvent(), instance);
			}

			@Override
			public Plugin getInstance() {
				return instance;
			}

		};
		
		
		
		
		
		
		
		
		
		
	}




	@Override
	public void sendInformation(Player sender, String[] cmd) {
		for(ChatCommandListener l : ccl)
		{
		
			l.onChatCommand(sender, cmd);
			
			
			
			
			
		}
	}
	
	
	
	
	
}
