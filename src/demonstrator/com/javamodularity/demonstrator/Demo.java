package com.javamodularity.demonstrator;

//import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonFactory;

public class Demo {

	public static void main(String args[]) throws Exception {
		Book modularityBook =
			new Book("Java 9 Modularity", "Learn everything about using the new module system in Java 9");

		//ObjectMapper mapper = new ObjectMapper();
		//String json = mapper.writeValueAsString(modularityBook);

		JsonFactory f = new JsonFactory();
		System.out.println(f.getCodec());
	//	System.out.println(json);
	}
}
