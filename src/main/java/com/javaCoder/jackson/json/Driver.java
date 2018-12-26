package com.javaCoder.jackson.json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		try {
			//create the object mapper
			ObjectMapper mapper = new ObjectMapper();
						
			//read JSON file and map/convert to java POJO
			//data/sample-lite.json
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			//print the file
			System.out.println("First Name = "+ theStudent.getFirstName());
			System.out.println("Last Name = "+ theStudent.getLastName());
		}catch(Exception e) {
			
		}

	}

}
