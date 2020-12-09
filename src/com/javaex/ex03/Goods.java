package com.javaex.ex03;

public class Goods {

	private String name;
	private int price;
	private int count;
		
	
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getPrice() {
		return price;
	}
	protected void setPrice(int price) {
		this.price = price;
	}
	protected int getCount() {
		return count;
	}
	protected void setCount(int count) {
		this.count = count;
	}
	public Goods() {

	}
	public Goods(String name, int price, int count) {
		super();
		this.name = name;
		this.price = price;
		this.count = count;
	}

	public void draw() {
		System.out.println(name + "(가격:" + price + "원)이 " + count + " 개 입고 되었습니다");
	}
	

}
