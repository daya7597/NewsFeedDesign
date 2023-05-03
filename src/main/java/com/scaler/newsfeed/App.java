package com.scaler.newsfeed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.scaler.Commands.Command;
import com.scaler.Commands.SignUp;
import com.scaler.service.impl.UserSignUpServiceImpl;
import com.scaler.services.UserSignUpService;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = { "com.scaler.services" })
public class App 
{
    public static void main( String[] args ) throws IOException
    {
                
        InputStreamReader in = new InputStreamReader(System.in);     
		BufferedReader br = new BufferedReader(in);
		
		Command c;
		
		while(true) {
			String command=br.readLine(); 
			if(command.equals("exit")) {
				System.out.println("thanks for using news feed app");
				break;
			}
			
			System.out.println("Command : " + command);
			if(command.equals("signup")) {
				c = new SignUp(command, br);
				c.execute();
			}
		}
    }
}
