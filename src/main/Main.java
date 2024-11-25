import java.util.ArrayList;
import java.util.List;

public class Main {

   public static void main(String[] args) {

      List<Skid> skids = new ArrayList<>();

      skids.add(new Skid(48, 48, 32, 500, true));
      skids.add(new Skid(48, 48, 32, 500, true));
      skids.add(new Skid(48, 62, 32, 600, false));
      skids.add(new Skid(48, 48, 40, 700, true));

      int linearFootage = LinearFootageCalculator.calculateLinearFootage(skids);
      System.out.println("Total Linear Footage: " + linearFootage);
   }

}
