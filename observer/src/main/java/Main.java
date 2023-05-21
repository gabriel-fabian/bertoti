package src.main.java;

import src.main.java.chat.*;

public class Main {
  public static void main(String[] args) {
    GroupChat chat = new GroupChat();

    GroupMember member1 = new GroupMember("John");
    GroupMember member2 = new GroupMember("Alice");
    GroupMember member3 = new GroupMember("Bob");

    chat.addObserver(member1);
    chat.addObserver(member2);
    chat.addObserver(member3);

    chat.notifyObservers("Hello everyone!", member1); // member1 sends a message

    chat.removeObserver(member3);

    chat.notifyObservers("How are you?", member2); // member2 sends a message
  }
}
