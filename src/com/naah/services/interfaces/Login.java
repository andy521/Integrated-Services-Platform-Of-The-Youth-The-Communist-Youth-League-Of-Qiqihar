package com.naah.services.interfaces;

import java.util.Map;

import javax.servlet.http.HttpSession;

import com.naah.PO.Users;

public interface Login {

	public abstract  Map Login(HttpSession session,Users user,String pic);

}