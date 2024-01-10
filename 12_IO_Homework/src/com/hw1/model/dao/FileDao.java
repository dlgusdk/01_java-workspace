package com.hw1.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDao {
	public void fileSave(String content, String fileName) {
		
		try(BufferedWriter i = new BufferedWriter(new FileWriter("fileName.txt")); ){
			i.write("안녕하세요\n");
			i.write("반갑습니다");
			i.newLine(); 
			i.write("어서오세요");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	}
	
	

