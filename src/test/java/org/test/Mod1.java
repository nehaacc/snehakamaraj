package org.test;

public class Mod1 extends BaseClass {

	private static String data;

	public static void main(String[] args) {
		browserconfig();
		openurl("https://www.facebook.com/");
		maxwin();
		 Login l=new  Login();
		 type(l.getTxtEmail(), "data");
		 type(l.getTxtpass(),"pass");
		 click(l.getBtnlogin());
		

	}

}
