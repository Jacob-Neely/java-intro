import java.util.Scanner;
import javax.swing.JOptionPane;

public class DoorGame {

  public static void main(String[] args) {
    // Messages
    final String WELCOME_MESSAGE = "Welcome to Door Game";
    final String UpdateTitle = "Update 1.1";
    final String Title = "Door Game";
    final String Failed = "You failed!";
    final String Win = "You win!";
    final String Error = "Error";
    final String Secret = "Welcome to door -2 nothing much is going on here so I'll just give you a win";
    final String Error2 = "No Funny number";
    final String LauncherTitle = "Door Game Launcher";

    // JOptionPane message types
    final int X_Mark = 0;
    final int InfoMark = 1;
    final int WarningMark = 2;
    final int QuestionMark = 3;

    JOptionPane.showMessageDialog(null, WELCOME_MESSAGE, LauncherTitle, InfoMark);
    // JOptionPane.showMessageDialog(null, " ", game, 2);

    String pickadoor = JOptionPane.showInputDialog(null, "Update: You can now type instead of numbers now words!",
        UpdateTitle, InfoMark);

    while (pickadoor.isBlank()) {
      pickadoor = JOptionPane.showInputDialog(null, "You came accross  3 doors pick wisely\nPick a door", Title,
          QuestionMark);

    }

    JOptionPane.showMessageDialog(null, "You picked door " + pickadoor, Title, QuestionMark);

    switch (pickadoor) {
      case "1":
        JOptionPane.showMessageDialog(null, Failed, Title, WarningMark);
        break;
      case "2":
        JOptionPane.showMessageDialog(null, Failed, Title, WarningMark);
        break;
      case "3":
        JOptionPane.showMessageDialog(null, Win, Title, QuestionMark);
        break;
      case "-2":
        JOptionPane.showMessageDialog(null, Secret, Title, QuestionMark);
        break;
      case "69":
        JOptionPane.showMessageDialog(null, Error2, Title, WarningMark);
        break;
      case "420":
        JOptionPane.showMessageDialog(null, Error2, Title, WarningMark);
        break;
      case "One":
        JOptionPane.showMessageDialog(null, Failed, Title, WarningMark);
        break;
      case "Two":
        JOptionPane.showMessageDialog(null, Failed, Title, WarningMark);
        break;
      case "Three":
        JOptionPane.showMessageDialog(null, Win, Title, QuestionMark);
        break;
      case "one":
        JOptionPane.showMessageDialog(null, Failed, Title, WarningMark);
        break;
      case "two":
        JOptionPane.showMessageDialog(null, Failed, Title, WarningMark);
        break;
      case "three":
        JOptionPane.showMessageDialog(null, Win, Title, QuestionMark);
      case "ONE":
        JOptionPane.showMessageDialog(null, Failed, Title, WarningMark);
        break;
      case "TWO":
        JOptionPane.showMessageDialog(null, Failed, Title, WarningMark);
        break;
      case "THREE":
        JOptionPane.showMessageDialog(null, Win, Title, QuestionMark);
      default:
        JOptionPane.showMessageDialog(null, Error, Title, X_Mark);
        pickadoor = JOptionPane.showInputDialog(null, "You came accross  3 doors pick wisely\nPick a door", Title,
            QuestionMark);
    }

    // if (pickadoor == "2") {
    // JOptionPane.showMessageDialog(null, Win, Title, QuestionMark);
    // } else if ( <= "4"){
    // JOptionPane.showMessageDialog(null, Error, Title, X_Mark, null);
    // }
    // else {
    // JOptionPane.showMessageDialog(null, Failed, Title, WarningMark);
    // }

  }
}
