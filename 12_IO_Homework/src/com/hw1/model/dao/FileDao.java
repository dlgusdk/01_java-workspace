package com.hw1.model.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileDao {
	public void fileSave(String content, String fileName) {
		
		try(BufferedWriter content = new BufferedWriter(new FileWriter("fileName.txt")); ){
			content.write("안녕하세요\n");
			content.write("반갑습니다");
			content.newLine(); 
			content.write("어서오세요");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	}
	
	

