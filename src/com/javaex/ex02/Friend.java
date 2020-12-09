package com.javaex.ex02;

public class Friend {

    private String name;
    private String hp;
    private String school;
    

	public Friend() {
	}
  
    
	public Friend(String[] str) {
		this.name = str[0];
		this.hp = str[1];
		this.school = str[2];
	}
	


	public void draw() {
		System.out.println("이름:"+name + " 핸도폰:" + hp + " 학교:" +school);
	}
	@Override
	public String toString() {
		return "Friend [name=" + name + ", hp=" + hp + ", school=" + school + "]";
	}


	
	

    
}
