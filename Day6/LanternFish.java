/******************************************************************************

Link to Q6: https://adventofcode.com/2021/day/6
Input: Input file
*******************************************************************************/
import java.util.ArrayList;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collections;

public class LanternFish
{
    public void getCount(ArrayList<Integer> list){
	    //to keep track of days
	    for(int j=0; j<80; j++){
		    //to manipulate list items
		    for(int i=0 ; i<80; i++){
		int a = list.get(i);
                if((a--) != 0){
                   list.set(i, a--);
            } else {
				list.add(8);
				list.set(i,6);
			}
        }
	    }

        System.out.println(list.size());
    }

	public static void main(String[] args) {
		ArrayList<Integer> fishes = new ArrayList<Integer>();
		LanternFish lf = new LanternFish();
		//Reading input files
		try {
      		File myObj = new File("/uploads/LanternFishInput.txt");
      		Scanner myReader = new Scanner(myObj);  
      		while (myReader.hasNext()) {
        		String[] str = myReader.nextLine().split(",");
        		for(int i=0; i<str.length; i++){
        		    int data = Integer.parseInt(str[i]);
        		    fishes.add(data);
        		}
      		}
      		lf.getCount(fishes);
    	} catch (Exception e) {
      		System.out.println("An error occurred.");
      		e.printStackTrace();
        } 
	}
}
