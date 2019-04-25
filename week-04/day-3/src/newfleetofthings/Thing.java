package newfleetofthings;

/*
 * Created by aze on 2017.03.29..
 */
public class Thing implements Comparable<Thing> {
  private String name;
  private boolean completed;

  public Thing(String name) {
    this.name = name;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

  @Override
  public int compareTo(Thing other) {

    Boolean thisCompleted = this.completed;
    Boolean otherCompleted = other.completed;

    int result = thisCompleted.compareTo(otherCompleted); // NOT WORKING
    {
      if (result == 0) {
        result = this.name.compareTo(other.name);
      }
    }
    return result;
  }
}
