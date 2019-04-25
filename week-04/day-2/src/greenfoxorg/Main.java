package greenfoxorg;

public class Main {
  public static void main(String[] args) throws CloneNotSupportedException {

    Student john = new Student("John", 20, "Male", "BME");
    john.introduce();

    Student johnTheClone = john.clone();
    johnTheClone.introduce();
  }
}
