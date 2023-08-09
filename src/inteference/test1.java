package inteference;

import java.util.Scanner;


public class test1 {
	
      
	
	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("please enter the group ===");
		
		inst k;
		
		
		
		String group = s.next();
		
		if(group.equals("bsc")){
			
			k = new bsc();
			
			k.programlang();
			k.fee();
		}
		else if(group.equals("btech"))
		{
			k = new btech();
			
			k.programlang();
			k.fee();
			
			
		}
		
		else if(group.equals("msc")) {
			
			k = new msc();
			
			k.programlang();
			
			k.fee();
			
			
		}
			
		
		
			
			else {
				System.out.println("please select proper group");
			}
			}
		
		
		
	}



