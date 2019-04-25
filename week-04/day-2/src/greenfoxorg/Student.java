package greenfoxorg;

public class Student extends Person implements Cloneable {
  private String previousOrganization;
  private int skippedDays;

  public Student() {
    super();
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    setPreviousOrganization(previousOrganization);
    setSkippedDays(0);
  }

  @Override // needed??
  public void getGoal() {
    System.out.println("My goals is: Be a junior software developer.");
  }

  @Override // needed??
  public void introduce() {
    System.out.println(
        "Hi, I'm "
            + getName()
            + ", "
            + getAge()
            + " years old "
            + getGender()
            + " from "
            + getPreviousOrganization()
            + " who skipped "
            + getSkippedDays()
            + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    setSkippedDays(this.skippedDays + numberOfDays);
  }

  public String getPreviousOrganization() {
    return previousOrganization;
  }

  public void setPreviousOrganization(String previousOrganization) {
    this.previousOrganization = previousOrganization;
  }

  public int getSkippedDays() {
    return skippedDays;
  }

  public void setSkippedDays(int skippedDays) {
    this.skippedDays = skippedDays;
  }

  @Override
  protected Student clone() throws CloneNotSupportedException {
    return (Student) super.clone();
  }
}
