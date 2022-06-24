/******************************************************************************

Link to Q2: https://adventofcode.com/2021/day/1
Input: Input file
*******************************************************************************/
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Drive
{

	public static void main(String[] args) {
		ArrayList<Integer> seaDepth = new ArrayList<Integer>();
		int horizontal = 0;
		int depth = 0;
		int aim = 0;
		int newDepth = 0;
		//Reading input files
		try {
      		File myObj = new File("/driveInput.txt");
      		Scanner myReader = new Scanner(myObj);  
      		while (myReader.hasNextLine()) {
        		String str = myReader.nextLine();
					String[] arrOfStr = str.split(" ", 2);
					Integer data = Integer.valueOf(arrOfStr[1]);
					switch(arrOfStr[0]){
					    case "forward": horizontal += data;
						                newDepth = newDepth + (aim * data); 
					                    break;
					    case "up": depth -= data;
						           aim -= data; 
					              break;
					    case "down": depth += data;
						             aim += data;
					              break;
						default: System.out.println("Invalid input");
						         break;
					}
			}
			System.out.println("Part 1: ")
        	System.out.println(depth * horizontal);
        	//Ans: 1648020

        	System.out.println("Part 2: ")
			System.out.println(horizontal * newDepth);
			//Ans: 1759818555
    	} catch (FileNotFoundException e) {
      		System.out.println("An error occurred.");
      		e.printStackTrace();
        } 
	}
}
