package me.benfah.manager;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvent implements Listener{

	
	
	
	
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e)
	{
		String[] cmd = e.getMessage().split(" ");
	for(String c : ChatCommand.cmds)
		if(c.equalsIgnoreCase(cmd[0]))
		{
		
			e.setCancelled(true);
			try{
			Player sender = e.getPlayer();
	
			
			//String tmps = null;
			//for(int i = 1; i < s.length; i++)
			//{
				
				//tmps = tmps +  " "  + s[i];
				
				
				
				
				
				
				
			//}
			ChatInfo ci = new ChatCommand();
			ci.sendInformation(sender,cmd);
			}catch(Exception e1)
			{
				e.setCancelled(false);
			}
		
		}
	}
}
