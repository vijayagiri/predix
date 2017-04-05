package in.vishwavijay.example.spring.boot.main;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ApplicationMain {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationMain.class);

	@RequestMapping("/")
	MyBean init(){
		LOGGER.info("Request came to root url... ");
		List<MyBean> friends = getFriends();
		return new MyBean("VaijayGiri", "Capgemini", 99052257, friends );
	}
	
	
	@RequestMapping("/sum/{a}/{b}") //Path Param
	public String calcualteTax(@PathParam("a") String a, @PathParam("b") String b){
		return a+b;
	}
	
	@RequestMapping("/hello/{name}")
	public String hello(@PathParam("name") String name){
		return "hello "+ name;
		
		
	}
	@RequestMapping("/sayhello/{name}")
	public Message hello2(@PathParam("name") String name){
		return new Message("Hello "+name);
		
		
	}
	
	//Homework : Query Param
	
	private List<MyBean> getFriends() {
		List<MyBean> list = new ArrayList<MyBean>();
		list.add(new MyBean("A1", "B1", 111, null));
		list.add(new MyBean("A2", "B2", 112, null));
		list.add(new MyBean("A3", "B3", 113, null));
		list.add(new MyBean("A4", "B4", 114, null));
		list.add(new MyBean("A5", "B5", 115, null));
		list.add(new MyBean("A6", "B6", 116, null));
		return list;
	}



	public static void main(String[] args) {
		LOGGER.info("Application is starting....");
		try{
			SpringApplication.run(ApplicationMain.class, args);
		}catch(Throwable t){
			LOGGER.error("Error in application... "+t.toString());
			t.printStackTrace();
		}
		
		
	}

}
