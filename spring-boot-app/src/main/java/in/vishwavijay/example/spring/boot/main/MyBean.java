package in.vishwavijay.example.spring.boot.main;

import java.util.List;

public class MyBean {
	
	private String name;
	private String address;
	private int contactNumber;
	private List<MyBean> friends;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public List<MyBean> getFriends() {
		return friends;
	}
	public void setFriends(List<MyBean> friends) {
		this.friends = friends;
	}
	public MyBean(String name, String address, int contactNumber, List<MyBean> friends) {
		super();
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.friends = friends;
	}
	
	public MyBean() {
		super();
	}
	
	
}
