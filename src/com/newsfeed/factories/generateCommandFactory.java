package com.newsfeed.factories;

import java.util.HashMap;
import java.util.Map;

import com.newsfeed.command.Command;
import com.newsfeed.command.FollowCommand;
import com.newsfeed.command.LoginCommand;
import com.newsfeed.command.PostCommand;
import com.newsfeed.command.ReplyCommand;
import com.newsfeed.command.ShowNewsFeedCommand;
import com.newsfeed.command.SignUpCommand;
import com.newsfeed.command.DownvoteCommand;
import com.newsfeed.command.UpvoteCommand;
import com.newsfeed.exception.CommandNotFoundException;
import com.newsfeed.exception.NotLoggedInException;
import com.newsfeed.models.NewsFeedApp;

public class generateCommandFactory {
	static Map<String, Command> map = new HashMap<>();
	
	public static Command createFactory(String commandInput) throws NotLoggedInException, CommandNotFoundException {
		if(map.containsKey(commandInput)) {
			return map.get(commandInput);
		}
		
		switch(commandInput) {
			case "signup" : map.put(commandInput, new SignUpCommand()); return map.get(commandInput);
			case "login" : map.put(commandInput, new LoginCommand()); return map.get(commandInput);
			case "post" :
				if(!NewsFeedApp.getIsLoggedIn()) {
					throw new NotLoggedInException();
				}
				map.put(commandInput,new PostCommand()); 
				return map.get(commandInput);
			case "follow" : map.put(commandInput,new FollowCommand()); return map.get(commandInput);
			case "reply" : map.put(commandInput,new ReplyCommand()); return map.get(commandInput);
			case "upvote" : 
				map.put(commandInput,new UpvoteCommand()); 
				return map.get(commandInput);
			case "downvote" : 
				map.put(commandInput,new DownvoteCommand()); 
				return map.get(commandInput);
			case "shownewsfeed" : map.put(commandInput,new ShowNewsFeedCommand()); return map.get(commandInput);
 			default : throw new CommandNotFoundException();
		}
		
	}
}
