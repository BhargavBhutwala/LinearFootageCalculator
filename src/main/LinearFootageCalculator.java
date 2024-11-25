import java.util.ArrayList;
import java.util.List;

public class LinearFootageCalculator {

   public static int calculateLinearFootage(List<Skid> skids) {

      double totalLinearFeet = 0.0;

      // Separate the stackable and non-stackable items
      List<Skid> stackableSkids = new ArrayList<>();
      List<Skid> nonStackableSkids = new ArrayList<>();

      for (Skid skid : skids) {

         if (skid.isStackable()) {
            stackableSkids.add(skid);
         } else {
            nonStackableSkids.add(skid);
         }
      }

      // Process stackable items
      // Arranging the skids in descending order of their heights
      stackableSkids.sort((s1, s2) -> s2.heightInches - s1.heightInches);

      boolean[] placed = new boolean[stackableSkids.size()];

      for (int i = 0; i < stackableSkids.size(); i++) {

         if (placed[i]) {
            continue;
         }
         Skid currentSkid = stackableSkids.get(i);
         placed[i] = true;

         // find another stackable skid to be placed on top
         for (int j = i + 1; j < stackableSkids.size(); j++) {

            if (!placed[j]) {
               placed[j] = true;
               // only one skid can be placed on top
               break;
            }
         }

         totalLinearFeet += currentSkid.takesFullWidth() ? currentSkid.getLengthInFeet()
               : currentSkid.getLengthInFeet() / 2.0;
      }

      // Process non-stackable items
      for (Skid skid : nonStackableSkids) {
         totalLinearFeet += skid.takesFullWidth() ? skid.getLengthInFeet() : skid.getLengthInFeet() / 2.0;
      }

      return (int) Math.ceil(totalLinearFeet);
   }

}
