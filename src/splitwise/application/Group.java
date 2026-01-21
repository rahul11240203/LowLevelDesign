package splitwise.application;

import java.util.ArrayList;
import java.util.List;

public class Group {
	String id;
	String name;
	List<User> member;
	
	Group(String id, String name){
		this.id=id;
		this.name=name;
	}

	public void addMember(User user) {
		if(member==null) member=new ArrayList<>();
		member.add(user);
	}
	
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the member
	 */
	public List<User> getMember() {
		return member;
	}

	/**
	 * @param member the member to set
	 */
	public void setMember(List<User> member) {
		this.member = member;
	}
}
