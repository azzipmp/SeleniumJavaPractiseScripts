package Package;

// First program in Java to print the value.

/*
 public class Java_Programing
 {	

	 public static void main(String []args) 
	 {
	      
		 System.out.println("Testing");
	       
	      
	    }

} 
*/
/*
public class Java_Programing
{	

	 public static void main(String []args) 
	 {
	   boolean flag=true;
	    
	    System.out.println(flag);
	       
	      
	    }

} 
*/


//Integer  Variables

//Datatype - int, string ='222 '
/*

public class Java_Programing
{
public static void main(String []args) 

{
	int age = 25;
	System.out.println(age);
	System.out.println("age value is :" + age);
   // age = age + 7;
  //  System.out.println(age);
 }
}
*/


//String Variables
/*

public class Java_Programing
{ 
public static void main(String []args) 
{
  String name = "john";
	    System.out.println("namevalue is: " + name);

 }
}
*/
/*

public class Java_Programing { 
	public static void main(String[] args) 
	{
		int i = 4523; //Can store 32 bit integer values only.
		long l = 652345; //Can store 64 bit integer values only. 
		double d1 = 56.2354; //Can store 64 bit decimal values. 
		double d2 = 12456; //We can use it for integer values too. 
		char c = 'd'; //Can store single character only.
		boolean t = false; //Can store only boolean values like true or false.
		String str = "Hello World"; //Can store any string values.
		
		System.out.println("Integer Var Is--> "+i); 
		System.out.println("Long Var Is --> "+l); 
		System.out.println("double Var d1 Is --> "+d1);
		System.out.println("double Var d2 Is --> "+d2); 
		System.out.println("char Var c Is --> "+c); 
		System.out.println("boolean Var b Is --> "+t); 
		System.out.println("string Var str Is --> "+str); 
		}
}

*/

/*
public class Java_Programing {

public static void main(String args[]){
	
	
	int number=10;
	if (number>10)
	{
		System.out.println("If conditin True:"+ number);	
	}
	else
	{
		System.out.println("If conditin false:"+ number);	
	}
	
   }

}
*/


//Decision Table - If condition

/*
public class Java_Programing {

public static void main(String args[]){
   int x=10;
   
   if (x == 15)
   {
	   System.out.println("If conditin True:"+ x);
   }
   else
   {
	   System.out.println("If conditin false:"+ x); 
   }
  
  
  }
}

*/
//Else - If
/*
public class Java_Programing {

public static void main(String args[]){
   int x = 20;

   if( x == 10 )
   {
      System.out.print("Value of X is 10");
   }
   else if( x == 20 )
   {
      System.out.print("Value of X is 45");
   }
   else if( x == 30 )
   {
      System.out.print("Value of X is 30");
   }
   else
   {
      System.out.print("This is else statement");
   }
}
}
*/


//For loop
/*
public class Java_Programing {

public static void main(String args[]){
	

	for(int number=1;number<5;number=number+1)
	{
		 System.out.print("value of number : " + number );
		 System.out.print("\n");
	}
	

}
}
*/



//While loop
/*
public class Java_Programing {

 public static void main(String args[]) {
	 
	 int i =1;	
	 while (i <10)
	 {
		 System.out.print("value of i : " + i );
	     System.out.print("\n"); 
	     i=i+1;
	 }
	 
 }
}
*/

//do while
/*
public class Java_Programing {

public static void main(String args[]){
   int x = 10;
   
   do{
	   System.out.print("value of x : " + x );
	  
		   System.out.print("\n"); 
	  
	   x=x+1;
   }while(x<20);

 
   
}
}
*/
//Arrays
//Array syntax:  dataType[] arrayRefVar;

/*
public class Java_Programing {

 public static void main(String[] args) {
  
	
	 int[] i={10,20,30,40};
	 System.out.println(i[0]);
	 System.out.println(i[3]);
	 String[] name ={"test1","test2","test3"};
	 System.out.println(name[1]);
	 System.out.println("array lenghth:"+name.length);
	 
	 
	 
    
    // Print all the array elements
   
 //  for ( int i =0;i<myList.length;i=i+1)
  //  {
  //  	System.out.println("array value is : " + myList[i]);
 //  }
    
 
 }
}
*/

//String



//String length - Length of the string  - which returns the number of characters contained in the string object.
/*
public class Java_Programing {

public static void main(String args[]) {
// Length of the string  
	String val = "Hello how are you";
	
	
	 System.out.println( "String value is : " + val );
	
	 int len= val.length();
	 
	//int len=val.length();
	 
	 System.out.println("String length is :"+ len);
	 
	 //OR
	 System.out.println("String length is :"+ val.length());
	 
	 
   //concatenation  -   Adding 2 strings
 //  String str1="how are";
   
   
  // System.out.println("hello"+ str1+"you");
   
}
}
*/
/*
//equals   - compare 2 strings
public class Java_Programing {

public static void main(String args[]) {
   //String Str1 = new String("This is really not immutable!!");
  // String Str2 = Str1;
   //String Str3 = new String("This is really not immutable!!");
  // boolean retVal;
String Str1= "hello";
String Str2 ="hello";
String Str3 ="hi";

boolean flag = Str1.equals(Str2);

//boolean  retval=Str1.equals(Str2);


  //  retVal = Str1.equals( Str2 );
   System.out.println("Returned Value = " + flag );

  // retVal = Str1.equals( Str3 );
  System.out.println("compare str1 and str3 = " + Str1.equals(Str3) );
}
}
*/

/*
public class Java_Programing {

public static void main(String args[]) {
   String Str1 = "hello";
   String Str2 = "hello";
   
  if ( Str1== Str2)
  {
	  System.out.println("String matches" );
  }
  else
  {
	  System.out.println("Not matches" );
  }
   
}
}
*/

// Below code contains all the string functions
/*
public class Java_Programing
{
	public static void main(String[] args)
	{
		String st1 = "This World is Very Nice";
		String st2 = "    And Beautiful.  ";
		

		
		boolean retval = st1.equals(st2);
		System.out.println("st1 equals to st2? -> "+ retval); // false
		
		//Comparing two strings. Return true If both match else return false.
		System.out.println("st1 equals to st2? -> "+ st1.equals(st2)); // false
		
		
		
		//Concatenates st2 with st1. 
		System.out.println("Concatenation of st1 and st2 Is -> "+st1.concat(st2)); // "This world is very nice And Beautiful"
		
		String st3= st1+st2;
		
		System.out.println("Concatenation of st1 and st2 Is -> "+st3 );
		
		
		//Retrieve the 9th Indexed character from string. - charAt(position)
		System.out.println("Character at Index 9 Is -> "+st1.charAt(9));// d
		
		//Find the length of string. 
		System.out.println("Length Of St1 -> "+st1.length()); //23
				
		//Converting whole string In lower case. 
		System.out.println("String In Lowercase -> "+st1.toLowerCase());
		
		//Converting whole string In upper case. 
		System.out.println("String In uppercase -> "+st1.toUpperCase()); 
		
		//Trim String. - Remove spaces from leading and trailing space
				System.out.println("Trimmed st2 -> "+st2.trim());
				
				
				
		//Retrieve the Index of first 'i' character. 
		System.out.println("Index of 1st charater N Is -> "+st1.indexOf('N')); //20
		//or
		int num= st1.indexOf('N');
		System.out.println("Index of 1st charater N Is -> "+num); //20
		
		//Retrieve the index of 2nd most 'i' character.
		//System.out.println("Index of 2nd charater i Is -> "+st1.indexOf('i',3));
		//Retrieve the Index of word 'Very' from string. 
		System.out.println("Index of word Very Is -> "+st1.indexOf("Very"));// 15
	
		//Converting value From int to string. 
		int j = 75;
		
		int k = 10;
		int sum=k+j;
		System.out.println(sum); //85
		
		
		//String vale=String.valueOf(j);
		String val2= String.valueOf(j);//"75"
		
		//Converting value From int to string. 
		//String val2 = String.valueOf(j);
		System.out.println("Value Of string val2 Is -> "+val2); //  "75"
		System.out.println("I and J add -> "+ val2 + k);// 7510
		
		//	System.out.println(sum); //1075
		
		//Converting string to integer.
		
		String val1="50";
		int i = Integer.parseInt(val1); 
		System.out.println("Value Of int i Is -> "+i);// 50
		
		//Print the String starting from 6th Index to 10th Index.
	//	String st1 = "This World is Very Nice";
		System.out.println("Retrieving sub string from string -> "+st1.substring(6,10));// World
		
		//Split string. 
		
	String st4= "order number created sucessfully order number is 1234";
		
	String[] text=st4.split(" ");
		
	//   String[] text = st4.split(" ");
	
		System.out.println("number is :"+text[7]);
		
		
		// COntains method - to check string2 contains in string1
		
		String st5="hellow how are you";
		String st6="hel";
		System.out.println("Checking string6 exist in string5:"+st5.contains(st6));
		
		}
	}

*/

//********************************   DONT EXECUTE ****************************************************

//The foreach Loops:JDK 1.5 introduced a new for loop known as foreach loop or enhanced for loop, which enables you to traverse the complete array sequentially without using an index variable.

/*
public class Java_Programing {

public static void main(String[] args) {
  
	int[] values={10,12,30,41};
	
	//values[0] // 10
		//	values[1]//12
				//	values[2]=30
					//values[3]=41
  
//for each loop
  // Print all the array elements
//	synstax:  for (datatype value: array)
	//{
//	}
	
  for (int j: values) {
     System.out.println(j);
  
  }
 }
}
 */

/*

//Date and Time
import java.util.Date;

public class Java_Programing {
public static void main(String args[]) {
    // Instantiate a Date object
    Date date = new Date();
     
    // display time and date using toString()
    System.out.println(date.toString());
}
}
*/
/*
//Date format
import java.util.*;
import java.text.*;

public class Java_Programing {
 public static void main(String args[]) {

    Date dNow = new Date( );
    SimpleDateFormat ft = 
    new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
//SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
    System.out.println("Current Date: " + ft.format(dNow));
 }
}

*/

/*
//import java.io.*;

public class Java_Programing{
 public static void main(String args[]){
    String expresult = "User has been created sucessfully";

    //Tool capture the actual result
   String actresult ="user has been created sucessfully  ";
   
   // one logic
   if (expresult.toUpperCase().trim().equals(actresult.toUpperCase().trim()))
   {
	   System.out.println("Test case is pass"); 
   }
   else
   {
	   System.out.println("Test case is fail"); 
   }
   
   
   int val = actresult.indexOf("sucessfully");  //23
   
   
   //another logic
   if (val>0)
   {
	   System.out.println("Test case is pass"); 
   }
   else
   {
	   System.out.println("Test case is fail"); 
   }
 
 }
}

*/

//index of - return the index of the specified character in the given string.
/*
//public int indexOf(int ch )or
//public int indexOf(int ch, int fromIndex)or
//int indexOf(String str)or
//int indexOf(String str, int fromIndex)

import java.io.*;

public class Java_Programing {

 public static void main(String args[]) {
    String Str = new String("Welcome to Tutorialspoint.com");
    String SubStr1 = new String("Tutorials");
    String SubStr2 = new String("Sutorials");

    System.out.print("Found Index :" );
    System.out.println(Str.indexOf( 'o' ));
    System.out.print("Found Index :" );
    System.out.println(Str.indexOf( 'o', 5 ));
    System.out.print("Found Index :" );
    System.out.println( Str.indexOf( SubStr1 ));
    System.out.print("Found Index :" );
    System.out.println( Str.indexOf( SubStr1, 15 ));
    System.out.print("Found Index :" );
    System.out.println(Str.indexOf( SubStr2 ));
 }
}
*/



//Matches () method 

//public boolean matches(String regex) //This method returns true if, and only if, this string matches the given regular expression.

/*
import java.io.*;

public class Java_Programing{
 public static void main(String args[]){
    String Str = new String("Welcome to Tutorialspoint.com");

    System.out.print("Return Value :" );
    System.out.println(Str.matches("(.*)Tutorials(.*)"));

    System.out.print("Return Value :" );
    System.out.println(Str.matches("Tutorials"));

    System.out.print("Return Value :" );
    System.out.println(Str.matches("Welcome(.*)"));
 }
}
*/

//replace() method
//This method returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
//public String replace(char oldChar, char newChar)
/*
import java.io.*;

public class Java_Programing{
 public static void main(String args[]){
    String Str = new String("Welcome to Tutorialspoint.com");

    System.out.print("Return Value :" );
    System.out.println(Str.replace('o', 'T'));

    System.out.print("Return Value :" );
    System.out.println(Str.replace('l', 'D'));
 }
}
*/


//split method
//This method has two variants and splits this string around matches of the given regular expression.
//It returns the array of strings computed by splitting this string around matches of the given regular expression.
//public String[] split(String regex)

/*
import java.io.*;

public class Java_Programing{
 public static void main(String args[]){
    String Str = new String("order has been created order number is 1234");
       String[] str1= Str.split(" ");
       System.out.println(str1[7]);
    System.out.println("Return Value :" );
    for (String retval: Str.split(" ")){
      // System.out.println(retval);
   
    }
  }
 */


//substring method
//Extract the string from the given string
//This method has two variants and returns a new string that is a substring of this string. The substring begins with the character at the specified index and extends to the end of this string or up to endIndex - 1 if second argument is given.
//public String substring(int beginIndex)
//or
//public String substring(int beginIndex, int endIndex)
/*
import java.io.*;

public class Java_Programing{
 public static void main(String args[]){
    String Str = new String("Welcome to Tutorialspoint.com");

    System.out.print("Return Value :" );
    System.out.println(Str.substring(10) );

    System.out.print("Return Value :" );
    System.out.println(Str.substring(10, 15) );
 }
}
*/

/*
//Lowercase method  - convert string to lower case.
import java.io.*;

public class Java_Programing{
public static void main(String args[]){
   String Str = new String("Welcome to Tutorialspoint.com");

   System.out.print("Return Value :");
   System.out.println(Str.toLowerCase());
}
}
*/

/*
//upper case 
//public String toUpperCase()
import java.io.*;

public class Java_Programing{
public static void main(String args[]){
   String Str = new String("Welcome to Tutorialspoint.com");

   System.out.print("Return Value :" );
   System.out.println(Str.toUpperCase() );
}
}
*/
//string  - This method returns itself a string

//public String toString()
/*
import java.io.*;

public class Java_Programing {
 public static void main(String args[]) {
    String Str = new String("Welcome to Tutorialspoint.com");

    System.out.print("Return Value :");
    System.out.println(Str.toString());
 }
}

*/

/*
//Trim - This method returns a copy of the string, with leading and trailing whitespace omitted.
//public String trim()
import java.io.*;

public class Java_Programing{
 public static void main(String args[]){
    String Str = new String("   Welcome to Tutorialspoint.com   ");

    System.out.print("Return Value :" );
    System.out.println(Str.trim() );
 }
}
*/
