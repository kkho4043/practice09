package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

	public static void main(String[] args) {

		ArrayList<Goods> gList = new ArrayList<Goods>();
		Scanner sc = new Scanner(System.in);
		String in;
		String[] iArr;
		

		while (true) {
			in = sc.nextLine();
			iArr = in.split(",");
			if (in.equals("q")) {
				System.out.println("[입력완료]");
				System.out.println("================");
				break;
			} else if (iArr.length != 3) {
				System.out.println("잘못입력하셨습니다");
				continue;
			} 
			else {
				gList.add(new Goods(iArr[0],Integer.parseInt(iArr[1]),Integer.parseInt(iArr[2])));
			}
		}
		
		for(int i = 0; i < gList.size();i++) {
			gList.get(i).draw();
		}
		
		
		int sum = 0;
		for (int i = 0; i < gList.size(); i++) {
			sum += gList.get(i).getCount();
		}
		
		
		//모든 사각형의 합 출력
		System.out.println("모든 상품의 갯수는" + sum + " 입니다.");

		sc.close();
	}

}
