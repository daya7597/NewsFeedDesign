package com.scaler.services;

import java.io.BufferedReader;
import java.io.IOException;

import com.scaler.payloads.UserDTO;

public interface UserSignUpService {
	UserDTO createUser(UserDTO dto);
	UserDTO UserInput(BufferedReader br) throws IOException;
}
