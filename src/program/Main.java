package program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month, day;
		
		boolean isError = false;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the month you were born in:");
		month = in.nextInt();
		if(month < 1 || month > 12) {
			
			System.out.println("Invalid month! Plase enter a valid month.");
			month = in.nextInt();
		}
		
		System.out.println("Enter the day you were born in:");
		day = in.nextInt();
		
		
		in.close();
	       
		
		
		if(month == 1) {
			
			if (day >= 1 && day <=31) {
				
				if(day < 22) System.out.println("Copricorn");
				
				else System.out.println("Aquaris");
				
			}
			
			
		}
		
		
		 else isError = true;
		
		
		if(month == 2) {
			
			if(day >= 1 && day <= 28) {
				
				if(day < 20) System.out.println("Aquaris");
				
				else System.out.println("Pisces");
				
			}
			
			else isError = true;
		}
		
		
        if(month == 3) {
			
			if (day >= 1 && day <=31) {
				
				if(day < 21) System.out.println("Pisces");
				
				else System.out.println("Aries");
				
			}
			
			else isError = true;
			
        }
			
		if(month == 4) {
				
			if (day >= 1 && day <=30) {
					
				if(day < 21) System.out.println("Aries");
					
				else System.out.println("Bull");
					
				}
				
			else isError = true;
		
			
		}
		
        if(month == 5) {
			
			if (day >= 1 && day <=31) {
				
				if(day < 22) System.out.println("Bull");
				
				else System.out.println("Twins");
				
			}
			
			else isError = true;
		

	}
        
        
        if(month == 6) {
			
			if (day >= 1 && day <=30) {
				
				if(day < 22) System.out.println("Twins");
				
				else System.out.println("Cancer");
				
			}
			
			else isError = true;
		

	}
        
       if(month == 7) {
			
			if (day >= 1 && day <=31) {
				
				if(day < 23) System.out.println("Cancer");
				
				else System.out.println("Leo");
				
			}
			
			else isError = true;
		

	}
       
       if(month == 8) {
			
			if (day >= 1 && day <=31) {
				
				if(day < 23) System.out.println("Leo");
				
				else System.out.println("Virgo");
				
			}
			
			else isError = true;
		

	}
       
       
       if(month == 9) {
			
			if (day >= 1 && day <=30) {
				
				if(day < 23) System.out.println("Virgo");
				
				else System.out.println("Libra");
				
			}
			
			else isError = true;
		

	}
       
       
       if(month == 10) {
			
			if (day >= 1 && day <=31) {
				
				if(day < 23) System.out.println("Libra");
				
				else System.out.println("Scorpion");
				
			}
			
			else isError = true;
		

	}
       
       
       if(month == 11) {
			
			if (day >= 1 && day <=30) {
				
				if(day < 22) System.out.println("Scorpion");
				
				else System.out.println("Sagittarius");
				
			}
			
			else isError = true;
		

	}
       
       
       if(month == 12) {
			
			if (day >= 1 && day <=31) {
				
				if(day < 22) System.out.println("Sagittarius");
				
				else System.out.println("Copricorn");
				
			}
			
			else isError = true;
       
       
       }
       
       
       if(isError) {
    	   
    	   System.out.println("Invalid Date! Please enter a valid day.");
    	   
       }
       
       
       

}
	
}
