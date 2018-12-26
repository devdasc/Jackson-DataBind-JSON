package com.javaCoder.jackson.json;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DriverSampleFull {

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
			
			//print the address of the student
			Address address = theStudent.getAddress();
			
			System.out.println("Street = "+ address.getStreet());
			System.out.println("City = "+ address.getCity());
			System.out.println("State = "+ address.getState());
			System.out.println("ZIP = "+ address.getZip());
			System.out.println("Country = "+ address.getCountry());
			
			//print the languages
			for(String tmpLang : theStudent.getLanguages()) {
				System.out.print(tmpLang+" ");
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
