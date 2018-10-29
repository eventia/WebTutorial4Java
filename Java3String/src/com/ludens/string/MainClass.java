package com.ludens.string;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {

		// 배열
		String[] weeks = new String[7];
		weeks[0] = "월";
		weeks[1] = "화";
		weeks[2] = "수";
		weeks[3] = "목";
		weeks[4] = "금";
		weeks[5] = "토";
		weeks[6] = "일";
		
		System.out.println(weeks[3]);
		
		// 리스트
		ArrayList pitches = new ArrayList();
//		ArrayList<String> pitches = new ArrayList<String>();
		pitches.add("138");
		pitches.add("142");
		System.out.println(pitches.get(1));
		
		
	}

}
