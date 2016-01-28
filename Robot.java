import java.util.Random;

public class Robot {
  public String robotName;
  
  public Robot () {
    robotName = "";
  }
	
  public String getName() {
    if (robotName.equals("")) {
      Random rGen = new Random();
      char[] rName = new char[] { ' ', ' ', ' ', ' ', ' '};
    
      rName[0] = (char) (rGen.nextInt(26)+65);
      rName[1] = (char) (rGen.nextInt(26)+65);
      rName[2] = (char) (rGen.nextInt(10)+48);
      rName[3] = (char) (rGen.nextInt(10)+48);
      rName[4] = (char) (rGen.nextInt(10)+48);
    
      robotName = String.valueOf(rName);
	}
     
    return robotName;
  }
  
  public void reset() {
	robotName = "";
  }
}
