import java.util.ArrayList;

// public class Array_List {
  // public static void main(String[] args) {
    // ArrayList<String> cars = new ArrayList<String>();
    // cars.add("Volvo");
    // cars.add("BMW");
    // cars.add("Ford");
    // cars.add("Mazda");
    // System.out.println(cars);
	// System.out.println(cars.get(0));
	
  // }
// }

public class Array_List {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
	System.out.println(cars);
  }
}

