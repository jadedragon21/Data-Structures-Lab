Submit: Loop Map Exercise

Loop and Map.Entry Exercises

    1.Write a program that does the following:
        Asks the user for 5 numbers
        Stores them in an array list
        Finds the sum, product, largest, and smallest of those numbers
      
	import java.util.*;  
     	public class ArrayListExample1{  
     	public static void main(String args[]){  
      	ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
          list.add("Mango");//Adding object in arraylist    
          list.add("Apple");    
          list.add("Banana");    
          list.add("Grapes");    
          //Printing the arraylist object   
          System.out.println(list);  
     }  
    }   

    2.You are a car dealer. Create a hash map of vehicles.
        The model is the Key, the make is the Value.
        Ask the customer what car (model) they are looking for. 
	Use the Hash Map to determine if you have that vehicle, and what make it is.
        (e.g. "Oh, you're looking for a Civic? Our Honda selection is right over here...")