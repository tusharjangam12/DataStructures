package com.igr.classimplimentation;

public class Message extends Helper   {
	
	public void gudMorning() 
		{System.out.println("Good Morning");}
	
	
	public void gudNight () 
		{System.out.println("Good Night");}
	

	public static void main(String[] args) {
		
           Message M = new Message ();
		M.gudMorning();
		M.gudAfternoon();
		M.gudEvening();
        M.gudNight();
	}

}
