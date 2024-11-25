public class Skid {

   int lengthInches;

   int widthInches;

   int heightInches;

   int weightLbs;

   boolean stackable;

   public Skid() {
   }

   public Skid(int lengthInches, int widthInches, int heightInches, int weightLbs, boolean stackable) {
      this.lengthInches = lengthInches;
      this.widthInches = widthInches;
      this.heightInches = heightInches;
      this.weightLbs = weightLbs;
      this.stackable = stackable;
   }

   public double getLengthInFeet() {
      return lengthInches / 12.0;
   }

   // Here I have assumed that trailer's width is a fixed value of 96 inches
   public boolean takesFullWidth() {
      return widthInches > 48;
   }

   public boolean isStackable() {
      return stackable;
   }
}
