public class Subclass extends Superclass {
   Subclass(int age) {
      super(age);
   }

   public static void main(String argd[]) {
      Subclass s = new Subclass(24);
      s.getAge();
   }
}