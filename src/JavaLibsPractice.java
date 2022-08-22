import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static void main(String[] args) {
        // TODO code application logic here
        String name = JOptionPane.showInputDialog("Enter a name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        String adjective = JOptionPane.showInputDialog("Enter an adjective");
        String pet = JOptionPane.showInputDialog("Enter an animal");
        String work = JOptionPane.showInputDialog("Where does " + name + " work?");
        double pay = Double.parseDouble(JOptionPane.showInputDialog("How much does " + name + " make per hour? (include cents)"));
        String noun = JOptionPane.showInputDialog("Enter a plural noun");
        int nounNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter a number (above 1)"));
        String verb = JOptionPane.showInputDialog("Enter a verb");
        String adverb = JOptionPane.showInputDialog("Enter an adverb");

        JOptionPane.showMessageDialog(null,
                "Hi, my name is " + name + " and I am " + age + " years old.\n I own a pet " + pet +
                        " and i am a " + adjective + " person. \n" +
                        "I work at " + work + " and make " + pay + " dollars an hour.\n" +
                        " In a month, I make " + (pay * 30.0) + " dollars.\n" +
                        "I love " + noun + " and I used to have " + nounNumber + " of it before the fbi took half,\n " +
                        "leaving me with " + (nounNumber / 2) + ".\n" +
                        " My talent is " + adverb + " " + verb + "."
                , "Your story",
                0);
    }   
}