package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	System.out.println("친구를 3명 등록해 주세요");
    	
    	ArrayList<Friend>fList = new ArrayList<Friend>();
    	
    	Scanner sc = new Scanner(System.in);
   
    	for(int i = 0;i<3;i++) {
    		fList.add(new Friend(sc.nextLine().split(" ")));
    	}
    	
    	for(int i = 0;i<fList.size();i++) {
    		fList.get(i).draw();
    	}
    	
    	
    	sc.close();
    	
    }

}
