package vo;

import java.io.Serializable;

public class UserVO implements Serializable{
	
	String id; //varchar(10)  primary key,
	String password; //varchar(10)  not null,
	String name; //varchar(20),
	String role;
	
	
	
	public UserVO() {
	}

	public UserVO(String id, String password, String name, String role) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.role = role;
	} //varchar(10) default 'user' check(role in ('user','admin'))

	public void setPassword(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}