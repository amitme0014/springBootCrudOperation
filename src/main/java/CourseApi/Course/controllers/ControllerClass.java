package CourseApi.Course.controllers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.Spring;
import javax.validation.constraints.AssertTrue.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class ControllerClass {
	/**
	 *
	 * @param name the name to greet
	 * @return greeting text
	 */
	
	  @RequestMapping(value = "/topics/{name}", method = RequestMethod.GET) 
	  @ResponseStatus(HttpStatus.OK)
	   public String greetingText(@PathVariable  String name) 
	  { return "Hello " + name + "Amit"; 
	  //return ""; 
	  }
	  
	  @SuppressWarnings("unused")
	//@RequestMapping(value="/connection", method=RequestMethod.GET)
	//  @ResponseStatus(HttpStatus.OK)
	  public void checkConnection() {
		 try {
			 
			 Properties prop=new Properties();
			 InputStream input=null;
			 
			 input=new FileInputStream("application.properties");
			 
			 //load a properties file
			 prop.load(input);
			String DB_URL=prop.getProperty("spring.datasource.url");
			String DB_Username=prop.getProperty("spring.datasource.username");
			String DB_Password=prop.getProperty("spring.datasource.password");
			 
			 
			 
		//	Connection connection;
		Connection connection=DriverManager.getConnection(DB_URL,DB_Username,DB_Password);
		connection.getMetaData();
		
		if(connection!=null) {
			System.out.println("Connection taken");
		} else
		{
			System.out.println("connection refused due to some reason");
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("some issue while getting a connection");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			System.out.println("properties file not found");
        	e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("In IOException Block");
			e.printStackTrace();
		}
	  }
	 
	
	
	
	

}
