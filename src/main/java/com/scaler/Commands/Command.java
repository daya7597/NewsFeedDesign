package com.scaler.Commands;

import java.io.BufferedReader;
import java.io.IOException;

public abstract class Command {
	String command;
	BufferedReader br;
	
	public Command(String command, BufferedReader br) {
		this.command = command;
		this.br = br;
	}


	abstract public void execute() throws IOException;
}
