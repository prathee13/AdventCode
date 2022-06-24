/******************************************************************************

Link to Q2: https://adventofcode.com/2021/day/1
Input: Input file
*******************************************************************************/
import java.util.ArrayList;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collections;

public class BinaryDiagnostic
{

	public static void main(String[] args) {
		ArrayList<HashMap<Character, Integer>> binCount = new ArrayList<HashMap<Character, Integer>>();
// 		ArrayList<HashMap<Character, Integer>> oxygenReport = new ArrayList<HashMap<Character, Integer>>();
// 		ArrayList<HashMap<Character, Integer>> carbonReport = new ArrayList<HashMap<Character, Integer>>();

		//Reading input files
		try {
      		File myObj = new File("/uploads/BinaryDiagnosticInput.txt");
      		Scanner myReader = new Scanner(myObj);  
      		while (myReader.hasNextLine()) {
        		String str = myReader.nextLine();
        		if(binCount.size() == 0) {
				        for (int i=0;i<str.length();i++) {
				            HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
				            hm.put('1', 0);
				            hm.put('0', 0);    
				            binCount.add(hm);   
				        }
				    }
				// System.out.println(str);
				for(int i=0;i<str.length(); i++) {
				    HashMap<Character, Integer> hm = binCount.get(i);
				    if (String.valueOf(str.charAt(i)).equals("1")) {
				            hm.put('1', hm.get('1') + 1);
			        } else {
				            hm.put('0', hm.get('0') + 1);
			        }
			        binCount.set(i, hm);
				}
			}
			String gamma = "";
			String epsilon = "";
			ArrayList oxygenReport  = (ArrayList)binCount.clone();
			ArrayList carbonReport  = (ArrayList)binCount.clone();

			//Collections.copy(oxygenReport, binCount);
			//Collections.copy(carbonReport, binCount);
			for(HashMap<Character, Integer> hm: binCount) {
			    if (hm.get('1') > hm.get('0')) {
			        gamma+="1";
			        epsilon+="0";
					oxygenReport.remove(hm.get(0));
			    } else {
			        gamma+="0";
			        epsilon+="1";
			        carbonReport.remove(hm.get(1));
			    }
			}
            System.out.println("####### output ##########");
			System.out.println(Integer.parseInt(gamma, 2) * Integer.parseInt(epsilon, 2));
			//Ans: 2261546
			System.out.println("Size - oxygenReport " + oxygenReport.size());
			for(HashMap<Character, Integer> hm: oxygenReport) {
			    System.out.println("Key : " + hm.get + " & Value : " + hm.get())
			}
			System.out.println("Size - carbonReport " + carbonReport.size());

    	} catch (Exception e) {
      		System.out.println("An error occurred.");
      		e.printStackTrace();
        } 
	}
}
