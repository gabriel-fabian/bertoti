package src.main.java.chat;

public class GroupMember implements Observer {
  private String name;

  public GroupMember(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void update(String message) {
    System.out.println(name + " received message: " + message);
  }
}
