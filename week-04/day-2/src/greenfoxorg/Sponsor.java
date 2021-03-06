package greenfoxorg;

public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  public Sponsor() {
    super();
    setCompany("Google");
    setHiredStudents(0);
  }

  public Sponsor(String name, int age, String gender, String company) {
    setName(name);
    setAge(age);
    setGender(gender);
    setCompany(company);
    setHiredStudents(0);
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
            + " who represents "
            + getCompany()
            + " and hired "
            + getHiredStudents()
            + " students so far.");
  }

  public void hire() {
    setHiredStudents(getHiredStudents() + 1);
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public int getHiredStudents() {
    return hiredStudents;
  }

  public void setHiredStudents(int hiredStudents) {
    this.hiredStudents = hiredStudents;
  }
}
