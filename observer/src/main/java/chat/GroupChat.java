package src.main.java.chat;

import java.util.ArrayList;
import java.util.List;

public class GroupChat {
  private List<GroupMember> members = new ArrayList<>();

  public void addObserver(GroupMember member) {
    System.out.println(member.getName() + " joined the chat.");
    members.add(member);
  }

  public void removeObserver(GroupMember member) {
    System.out.println(member.getName() + " left the chat.");
    members.remove(member);
  }

  public void notifyObservers(String message, GroupMember sender) {
    System.out.println(sender.getName() + " wrote: " + message);
    for (GroupMember member : members) {
      if (member != sender) {
        member.update(message);
      }
    }
  }
}
