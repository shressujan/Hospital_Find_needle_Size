/**
 * Purpose to calculate the length of tube to be given to the infant according to the entered information
 * Author:Sujan Shrestha
 * Algorithm
 * *************************************************************************
 *Algorithm
 *1.	Display the purpose of the program
 *2.	Ask the nurse to enter the type  of tube i.e. either oral or nasal
 *3.	Ask the nurse to enter the child’s age in day 
 *4.	Ask the nurse to enter the length of the child ( in centimeters)
 *5.	Convert the age of child in months by dividing by 30.4
 *      o	if “oral”  yes
 *      		if the age of child <20 
 *      ask if the baby is premature
 *      		due days= age of child in days -due days
 *           due month=due days/30.4
 *           	if due days<12 months age
 *	            	Distance = 13.3 cm + 0.19*(length in cm)
 *				Else
 *              	Distance = 16.8 cm + 0.19*( length in cm)
 *      o	if “nasal” yes
 *            	if due date< 12 months of age
 *		       		Distance = 14.8 cm + 0.19*(length in cm) 
 *			 	Else 
 *				    Distance = 18.3 cm + 0.19*(length in cm
 *	•	if no, age of child =age of child/30.4
 *		o	if “oral”  yes
 *				if age of child<12 months age
 *					Distance = 13.3 cm + 0.19*(length in cm)
 * 				Else
 *					Distance = 16.8 cm + 0.19*( length in cm)
 *		o	if “nasal” yes
 *				if age of child< 12 months of age
 *				    Distance = 14.8 cm + 0.19*(length in cm) 
 *	 		Else 
 *			     	Distance = 18.3 cm + 0.19*(length in cm
 *	print all the information entered and length of the tube to be used(Distance)
 *	Display the Termination Message

 *   
 */

import javax.swing.JOptionPane;
public class Baby{ 
	public static void main(String[] args) {
		String age,tube,length,prematurebaby,numofPrematuredays;		//Defines the variables as string variables
		int numofPrematuredays1;			// defines the variable as integer
		double distanceofTube,lengthbabyInCm,ageMonth,ageindays,dueageMonth;		// Defines the variable as a double integer
		final double totaldaysinMonth=30.4,val1=13.3,// Fixes the value for the variable as constants
				val2=16.8,val=0.19,val3=14.8,// Fixes the value for the variable as constants
				val4=18.3;		// Fixes the value for the variable as constants
		// Display the purpose of the program and gives the introduction of the whole program to the user
		JOptionPane.showMessageDialog(null, "This Program will Ask You"
				+" ,\t\t\t\t\t\tTo Enter the type of tube,"
				+"\nAge of the child in days,"
				+"\nLength of the Child in Centimeters,"
				+"\nIf the Child is Premature,"
				+"\nIf yes, How many Days Premature,"
				+"\nFinally Calculates The Length of Tube and \nDisplays "
				+"The Length of the Tube with all Informations Entered "
				,"\t\tLength of Tube",1);
		//For THE BONUS!!!!! PART
		boolean done=false;				// using the boolean datatype to create a loop
		while(!done)
		{
			tube=JOptionPane.showInputDialog(null,"Enter the Type of Tube to be inserted"+
					"\ni.e. Either \"oral\" or \"nasal\"",
					"\t\tLength of Tube",1);		// Ask the user to input the type of tube
			tube=tube.toLowerCase(); 		//Converts the String to lowercase
			if(tube.equals("oral"))// start of the if condition , value of tube is compared to "oral"
			{
				done=true;
				age=JOptionPane.showInputDialog(null,"Enter the Childs Age in days"
						,"\t\tLength of Tube",1);//ask the user to input childs age in day
				double agE=Double.parseDouble(age);		//converting a string to a double integer datatype
				ageindays=agE;
				length=JOptionPane.showInputDialog(null,"Enter the Length of the Child in Centimeters"
						,"\t\tLength of Tube",1);//ask the user to input childs length in centimeters
				lengthbabyInCm=Double.parseDouble(length);		//converting a string to a double integer datatype
				ageMonth=agE/totaldaysinMonth;
				if((int)ageMonth<20)		// checks if the child is less thatn 20 months  and then do the necessary calculation
				{
					prematurebaby=JOptionPane.showInputDialog(null,"Is the baby born premature "
							+"if Yes type \"y\" and \n if No type\"n\""
							,"\t\tLength of Tube",1); //ask the user to input if the baby is born premature of not
					prematurebaby=prematurebaby.toLowerCase();		//Converts the String to lowercase
					if(prematurebaby.equals("y"))
					{
						numofPrematuredays=JOptionPane.showInputDialog("How many days Premature is Child Born?");//ask the user to input how many day premature is the baby born
						numofPrematuredays1=Integer.parseInt(numofPrematuredays);			//converting a string value to integer data type
						agE-=numofPrematuredays1;
						dueageMonth=agE/totaldaysinMonth;
						if((int)dueageMonth<12)// compares the value of variable with 12
						{
							distanceofTube= val1 + val*lengthbabyInCm;		// calculate the length of the tube and assigns it to variable "distance of Tube"
						}	
						else
						{
							distanceofTube = val2  + val*lengthbabyInCm;		//Calculates the length of the tube assigns it to variable distanceofTube 
						}
						JOptionPane.showMessageDialog(null,"For a Premature Child of Age "+(int)ageindays		//Displays the informations entered and the length of the oral tube to be given to the child
								+" days \nheight "+lengthbabyInCm
								+" cm \nThe lenght of \"oral\" tube should be "
								+distanceofTube+" cm","\t\tLength of Tube",1);
					}
					else
					{
						if((int)ageMonth<12)		// use of if and else condition to check and compare the value of ageMonth with 12
						{
							distanceofTube= val1 + val*lengthbabyInCm;		//Calculates the length of the tube assigns it to variable distanceofTube 
						}
						else
						{
							distanceofTube = val2  + val*lengthbabyInCm;		//Calculates the length of the tube assigns it to variable distanceofTube 
						}
						JOptionPane.showMessageDialog(null,"For a Non-premature Child of Age "	//Displays the information of Non-Premature baby  and the length of the tube to be given to the baby
								+(int)ageindays+" days \nheight "+lengthbabyInCm
								+" cm \nThe length of \"oral\" tube should be "
								+distanceofTube+" cm","\t\tLength of Tube",1);
					}
				}
				else		// if the child is greater the 20 months than following calculation is done and output is displayed
				{
					distanceofTube = val2  + val*lengthbabyInCm;		//Calculates the length of the tube assigns it to variable distanceofTube 
					JOptionPane.showMessageDialog(null,"For a  Child of Age "+(int)ageindays		//Displays the informations entered and the length of the  tube to be given to the child
							+" days \nheight "+lengthbabyInCm
							+" cm \nThe length of \"oral\" tube should be "
							+distanceofTube+" cm","\t\tLength of Tube",1);
				}
			}
			else if(tube.equals("nasal")) 		// checks if the value of tube is equal to "nasal" or not
			{
				done=true;
				age=JOptionPane.showInputDialog(null,"Enter the Childs Age in Days"
						,"\t\tLength of Tube",1);//ask the user to input child's age in days
				double agE=Double.parseDouble(age);
				ageindays=agE;
				length=JOptionPane.showInputDialog(null,"Enter the Length of the Child in Centimeters"
						,"\t\tLength of Tube",1);//ask the user to input length of the child in centimeters
				lengthbabyInCm=Double.parseDouble(length);// converting the string value to a double value
				ageMonth=(double)agE/totaldaysinMonth;
				if(ageMonth<20)
				{
					prematurebaby=JOptionPane.showInputDialog(null,"Is the Baby born Premature "
							+"if Yes type \"y\" and \n if No type\"n\""
							,"\t\tLength of Tube",1);//ask the user to input if the child is prematurely born or not?
					prematurebaby=prematurebaby.toLowerCase();		//Converts the String to lowercase
					if(prematurebaby.equals("y"))		//conditon to check if the child is premature or not
					{
						numofPrematuredays=JOptionPane.showInputDialog("How many Days premature is Child born?");//ask the user to input how many day prematurely is the baby born
						numofPrematuredays1=Integer.parseInt(numofPrematuredays);	// converting the string value to the integer value
						agE-=numofPrematuredays1;
						dueageMonth=agE/totaldaysinMonth;
						if((int)dueageMonth<12)
							distanceofTube= val3 + val*lengthbabyInCm;		//Calculates the length of the tube assigns it to variable distanceofTube 
						else
							distanceofTube = val4  + val*lengthbabyInCm;		//Calculates the length of the tube assigns it to variable distanceofTube 
						JOptionPane.showMessageDialog(null,"For a Premature Child of Age "		//display the length of the tube for a premature child with all the information entered.
								+(int)ageindays+" days \nheight "
								+lengthbabyInCm+" cm \nThe length of \"nasal\" tube shoudl be "
								+distanceofTube+" cm","\t\tLength of Tube",1);
					}
					else
					{
						if((int)ageMonth<12)
							distanceofTube= val3 + val*lengthbabyInCm;		//Calculates the length of the tube assigns it to variable distanceofTube 
						else
							distanceofTube = val4  + val*lengthbabyInCm;		//Calculates the length of the tube assigns it to variable distanceofTube 
						JOptionPane.showMessageDialog(null,"For a Non-premature Child of Age "		//Displays the informations entered and the length of the nasal tube to be given to the child
								+(int)ageindays+" days \nheight "
								+lengthbabyInCm+" cm \nThe length of \"nasal\" tube should be "
								+distanceofTube+" cm"
								,"\t\tLength of Tube",1);;

					}
				}
				else
				{
					distanceofTube = val4  + val*lengthbabyInCm;		//Calculates the length of the tube assigns it to variable distanceofTube 
					JOptionPane.showMessageDialog(null,"For a Child of Age "		//Displays the informations entered and the length of the nasal tube to be given to the child
							+(int)ageindays+" days \nheight "
							+lengthbabyInCm+" cm \nThe Length of \"nasal\" tube should be "
							+distanceofTube+" cm"
							,"\t\tLength of Tube",1);
				}
			}

		}

		JOptionPane.showMessageDialog(null,"The Program Developed by  \"Sujan Shrestha\""		//Displays the termination message at the end of the program
				+" is Now Terminating"
				,"\t\tLength of Tube",1);

	}
}



