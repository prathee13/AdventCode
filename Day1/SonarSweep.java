/******************************************************************************

Link to Q1: https://adventofcode.com/2021/day/1
Input: Input file
*******************************************************************************/
import java.util.ArrayList;

public class SonarSweep
{
    
    public int sonarSweep(ArrayList<Integer> depth){
        int count = 0;
        for(int i=1; i<depth.size(); i++){
            if(depth.get(i-1) < depth.get(i)){
                count ++;
            }
        }
        return count;
    }

	public static void main(String[] args) {
	    SonarSweep m = new Main();
		ArrayList<Integer> seaDepth = new ArrayList<Integer>();
		/* 
		Driver code with given example to get the logic right.
		seaDepth.add(199);
		seaDepth.add(200);
		seaDepth.add(208);
		seaDepth.add(210);
		seaDepth.add(200);
		seaDepth.add(207);
		seaDepth.add(240);
		seaDepth.add(269);
		seaDepth.add(260);
		seaDepth.add(263); 
		*/
		
		//Reading input files
		try {
      		File myObj = new File("input1.txt");
      		Scanner myReader = new Scanner(myObj);  
      		while (myReader.hasNextLine()) {
        		String str = myReader.nextLine();
				try {
					Integer data = Integer.valueOf(str);
					seaDepth.add(data);
				}catch (NumberFormatException ex){
            		ex.printStackTrace();
        		}
      		}
      		myReader.close();
			int increasingNumber = m.sonarSweep(seaDepth);
			System.out.println(increasingNumber);
    	} catch (FileNotFoundException e) {
      		System.out.println("An error occurred.");
      		e.printStackTrace();
        } 
	}
}
