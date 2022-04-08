package my_1;

import java.util.Scanner;

public class College {
	
		public static void main(String[] args) {
			Scanner rc=new Scanner(System.in);
			System.out.println("Enter your College Name");
			String Clg=rc.nextLine();
			System.out.println("Enter Department Name");
			String Dpt=rc.nextLine();
			
			Bright_std VJ=new Bright_std();
			VJ.Name="Vishal Joshi ";
			VJ.DOB ="2th August 1994 ";
			VJ.city="Georai, Beed";
			VJ.Blood_group='O';
			VJ.Mob_no=405040330;
			VJ.hobby="Sleeping";
			
			rc.close();	
			
			int num;
			
			if (Dpt.equals("ENTC")) 
			{	System.out.println("The student is in Electronic and telecommunication Department");
				System.out.println("Enter digit to find info of student between 1-4");
				 num=rc.nextInt();
			
				 if (Clg.equals("DY"))
				 {   System.out.println("COLLEGE NAME");
				  if(num==1) 
				 {
					System.out.println("The student is in 1st year");
				 }
				  else if (num==2) 
				  {
					System.out.println("The student is in 2st year");
				  }
				  else if (num==3) 
				  {
					System.out.println("The student is in 3rd year");
					VJ.info();
				  }
				  else if(num==4)	
				  {
					System.out.println("The student is in 4th year");
				  }
				  else 
				  {
					  System.out.println("Invalid Number.Please enter Number between 1-4");
				  }
				
			}
			else 
			{
				System.out.println("The student is in Information technology Department");
				System.out.println("Enter digit to find info of student between 1-4");
				num=rc.nextInt();
				 if (num==1)
				{
					 System.out.println("The student is in 1st year");
				}
				 else if (num==2) 
				  {
					System.out.println("The student is in 2st year");
				  }
				  else if (num==3) 
				  {
					System.out.println("The student is in 3rd year");
				  }
				  else if(num==4) 	
				  {
					System.out.println("The student is in 4th year");
				  }
				  else {
					  System.out.println("Invalid Number.Please enter Number between 1-4");
				  }
				
			}
	}
			
	}
	}

