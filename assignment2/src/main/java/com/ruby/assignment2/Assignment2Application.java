package com.ruby.assignment2;
import java.util.HashMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment2Application {
	public static HashMap<Long,Student> hmStudent;
	public static void main(String[] args) {
            hmStudent=new HashMap<Long,Student>();
            Student one=new Student("Javad Ghofrani","WIS");
            hmStudent.put(new Long(one.getId()),one);
            SpringApplication.run(Assignment2Application.class, args);
	}
}
