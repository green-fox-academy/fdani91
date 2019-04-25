package greenfoxorg;

public class Mentor extends Person {
  private String level;

  public Mentor() {
    super();
    setLevel("Intermediate");
  }

  public Mentor(String name, int age, String gender, String level) {
    setName(name);
    setAge(age);
    setGender(gender);
    setLevel(level);
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println(
        "Hi, I'm "
            + getName()
            + " , "
            + getAge()
            + " years old "
            + getGender()
            + " "
            + getLevel()
            + " mentor.");
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }
}
