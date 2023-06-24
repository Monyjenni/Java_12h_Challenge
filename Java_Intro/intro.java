public class Main {
  public static void main(String[] args) {
      System.out.printf("Hello and welcome!");
      for (int i = 1; i <= 5; i++) {
          System.out.println("i = " + i);
      }
      System.out.println(3*3);
      System.out.println("This is the first day of me trying to learn Java Language");
      String name="Jcennie";

      final int age=19;
      float floatNumber= 39.99f;
      String firstName = "Yoeun";
      String lastName = "Chansovanmony";
      String combinationName = firstName + " "+ lastName;

      int x,y,z;
      x=y=z=50;
      int TotalNumber = x+y+z;
      System.out.println(TotalNumber);
      System.out.println(x+y+z);

      System.out.println(combinationName);
      System.out.println("My is"+" "+name+"I'm"+age);
      System.out.println("This is literally a"+ floatNumber);
  }
}