import javax.swing.JOptionPane;

public class Door {
    public static void main(String[] args) {
        // Titles
        final String LauncherTitle = "Door Game Launcher";
        final String UpdateTitle = "Update";
        final String Title = "Door Game Story";

        // Messages
        final String Win = "You Win!";
        final String Failed = "You Failed!";
        final String Error = "Error";
        final String Correct = "Correct!";
        final String Wrong = "Wrong way!";

        JOptionPane.showMessageDialog(null, "Door Game Story is being worked on.", LauncherTitle, 2);

        String pickadoor = JOptionPane.showInputDialog(null, "Door Game Story is being worked on.", UpdateTitle, 2);

        JOptionPane.showMessageDialog(null,
                "You entered a cave and you're holding a lantern then in the distance you see 3 doors.", Title, 3);

        while (pickadoor.isBlank()) {
            pickadoor = JOptionPane.showInputDialog(null, "Pick the correct door", Title, 3);
        }

        JOptionPane.showMessageDialog(null, "You picked door " + pickadoor, Title, 3);

        switch (pickadoor) {
            case "1":
                JOptionPane.showMessageDialog(null, Failed, Title, 2);
                break;
            case "2":
                JOptionPane.showMessageDialog(null, Failed, Title, 2);
                break;
            case "3":
                JOptionPane.showMessageDialog(null, Win, Title, 3);
                break;
            default:
                JOptionPane.showMessageDialog(null, Error, Title, 0);
                pickadoor = JOptionPane.showInputDialog(null, "You came accross 3 doors choose wisely.", Title, 3);
        }

        JOptionPane.showMessageDialog(null,
                "You have passed the 3 doors and continued your journey through the cave and end up in a bit of trouble.",
                Title, 3);

        JOptionPane.showMessageDialog(null,
                "Thanks for playing the Demo!", Title, 1);

        JOptionPane.showMessageDialog(null, Error, LauncherTitle, 0);
    }
}