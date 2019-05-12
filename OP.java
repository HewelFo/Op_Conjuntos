package Indiscretas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class OP {
	
	static String lee;
	String []cap;
	static int com,co0,co1,full=0;
	public  String tec() {
		InputStreamReader lec = new InputStreamReader(System.in);
		BufferedReader got = new BufferedReader (lec);
		try {
			lee=got.readLine();
		}catch (IOException e) {}
		return lee;
	}
	public static int tecI() {
		InputStreamReader lec = new InputStreamReader(System.in);
		BufferedReader got = new BufferedReader (lec);
		try {
			lee=got.readLine();
			com=Integer.parseInt(lee);
		}catch (IOException e) {}
		return com;
	}
	
	public void uni (String []con0,String [] con1) {
		
		if (con0.length<con1.length) {
			
			int c=0;
			for (int x=0;x<con1.length-1;x++) {
				for (int e=0;e<con0.length;e++) {
					if (con1[x]!=con0[e]) {
						System.out.print(con0[e]+","+con1[c]+",");
						
					}else {
						System.out.print(con1[e]);
						
					}
					c=c+1;
				}
			}
				
			}
		
		if (con1.length<con0.length) {
			
			int c=0;
			for (int x=0;x<con0.length-1;x++) {
				for (int e=0;e<con1.length;e++) {
					if (con1[x]!=con0[e]) {
						System.out.print(con0[e]+","+con1[c]+",");
						
					}else {
						System.out.print(con1[e]);
						
					}
					c=c+1;
				}
			}
				
			}



			if (con0.length==con1.length) {

					int c=0;
					for (int x=0;x<con1.length-1;x++) {
						for (int e=0;e<con0.length;e++) {
							if (con1[x]!=con0[e]) {
								System.out.print(con0[e]+","+con1[c]+",");
		
								}else {
									System.out.print(con1[e]);
		
								}
							c=c+1;
						}
					}

			}
			
		}
	public void inter (String []con0, String []con1) {
			if (con0.length<con1.length) {
			int c=0;
			for (int x=0;x<con1.length-1;x++) {
				for (int e=0;e<con0.length;e++) {
					if (con1[x]==con0[e]) {
						System.out.print(con0[e]+","+con1[c]+",");
					}
					c=c+1;
				}
			}
				
			}
		
			if (con1.length<con0.length) {
			int c=0;
			for (int x=0;x<con0.length-1;x++) {
				for (int e=0;e<con1.length;e++) {
					if (con1[x]==con0[e]) {
						System.out.print(con0[e]+","+con1[c]+",");
					}
					c=c+1;
				}
			}
				
			}
			if (con0.length==con1.length) {
					int c=0;
					for (int x=0;x<con1.length-1;x++) {
						for (int e=0;e<con0.length;e++) {
							if (con1[x]==con0[e]) {
								System.out.print(con0[e]+","+con1[c]+",");
								}
							c=c+1;
						}
					}

			}
		
		
	}
	
	public void dife(String []con0,String []con1) {
			if (con0.length<con1.length) {
			int c=0;
			for (int x=0;x<con1.length-1;x++) {
				for (int e=0;e<con0.length;e++) {
					if (con1[c]!=con0[e]) {
						System.out.print(con1[c]+",");
						}
					c=c+1;
				}
			}
			}
			if (con1.length<con0.length) {
			int c=0;
			for (int x=0;x<con0.length-1;x++) {
				for (int e=0;e<con1.length;e++) {
					if (con1[c]!=con0[e]) {
						System.out.print(con1[c]+",");
					}
					c=c+1;
				}
			}
			}
			if (con0.length==con1.length) {
					int c=0;
					for (int x=0;x<con1.length-1;x++) {
						for (int e=0;e<con0.length;e++) {
							if (con1[c]!=con0[e]) {
								System.out.print(con1[c]+",");
								}
							c=c+1;
						}
					}
			}
		
	}
	
	public void difesi(String []con0, String []con1) {
			if (con0.length<con1.length) {
			int c=0;
			for (int x=0;x<con1.length-1;x++) {
				for (int e=0;e<con0.length;e++) {
					if (con1[x]!=con0[e]) {
						System.out.print(con0[e]+","+con1[c]+",");	
					}
					c=c+1;
				}
			}	
			}
			if (con1.length<con0.length) {
			int c=0;
			for (int x=0;x<con0.length-1;x++) {
				for (int e=0;e<con1.length;e++) {
					if (con1[x]!=con0[e]) {
						System.out.print(con0[e]+","+con1[c]+",");			
					}
					c=c+1;
				}
			}	
			}
			if (con0.length==con1.length) {
					int c=0;
					for (int x=0;x<con1.length-1;x++) {
						for (int e=0;e<con0.length;e++) {
							if (con1[x]!=con0[e]) {
								System.out.print(con0[e]+","+con1[c]+",");
								}
							c=c+1;
						}
					}
			}
	}
	
	public void pla_car(String []con0, String []con1) {
		if (con0.length<con1.length) {
		int c=0;
		for (int x=0;x<con1.length-1;x++) {
			for (int e=0;e<con0.length;e++) {
					System.out.print(con0[e]+","+con1[c]+",");
				c=c+1;
			}
		}	
		}
		if (con1.length<con0.length) {
		int c=0;
		for (int x=0;x<con0.length-1;x++) {
			for (int e=0;e<con1.length;e++) {
					System.out.print(con0[e]+","+con1[c]+",");
				c=c+1;
			}
		}	
		}
		if (con0.length==con1.length) {
				int c=0;
				for (int x=0;x<con1.length-1;x++) {
					for (int e=0;e<con0.length;e++) {
							System.out.print(con0[e]+","+con1[c]+",");
						c=c+1;
					}
				}
		}

	}
	
	
		
		
	
	
	
	
	


	
}
	
	

	
	
	
	


	

