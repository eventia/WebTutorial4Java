package com.ludens.string;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {

		// �迭
		String[] weeks = new String[7];
		weeks[0] = "��";
		weeks[1] = "ȭ";
		weeks[2] = "��";
		weeks[3] = "��";
		weeks[4] = "��";
		weeks[5] = "��";
		weeks[6] = "��";
		
		System.out.println(weeks[3]);
		
		// ����Ʈ
		ArrayList pitches = new ArrayList();
//		ArrayList<String> pitches = new ArrayList<String>();
		pitches.add("138");
		pitches.add("142");
		System.out.println(pitches.get(1));
		
		
	}

}
