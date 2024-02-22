import java.util.ArrayList;
import java.util.Scanner;

/**
 * This is a Console Menu Object.
 *
 * @author happy
 *
 */
public class ConsoleMenu extends ActionMenuItem {

    private String menuHeader;
    private ArrayList<ActionMenuItem> menuItems;
    private Scanner inputStream;

    /**
     * Public no arg constructor.
     */
    public ConsoleMenu(String headerText) {
        this.menuHeader = headerText;
        this.menuItems = new ArrayList<ActionMenuItem>();
        this.inputStream = new Scanner(System.in);
    }

    @Override
    public String toString() {
        return this.menuHeader;
    }

    public void addMenuItem(ActionMenuItem item) {
        this.menuItems.add(item);
    }

    public void print() {
        System.out.println(this.menuHeader);
        for (int i = 0; i < this.menuItems.size(); i++) {
            System.out.println((i + 1) + ".) " + this.menuItems.get(i));
        }
    }

    @Override
    public void execute() {
        this.print();
        if (this.menuItems.size() < 1) {
            return;
        }
        int userChoice = -1;
        do {
            System.out
                    .println("Enter the number corresponding to your choice.");
            String userInput = this.inputStream.next();

            try {
                userChoice = Integer.parseInt(userInput);
                if (userChoice > this.menuItems.size() || userChoice < 1) {
                    System.out.println(
                            "Please only enter a number displayed next to an option above.");
                    userChoice = -1;
                }
            } catch (NumberFormatException e) {
                System.out.println(
                        "Please only enter a number displayed next to an option above.");
            }

        } while (userChoice < 1);

        this.menuItems.get(userChoice - 1).execute();

    }

    /**
     * This method instantiates a ConsoleMenu object.
     *
     * @param args
     */
    public static void main(String[] args) {
        ConsoleMenu menu = new ConsoleMenu("Main Menu");
        //sub menus:
        ConsoleMenu peopleMenu = new ConsoleMenu("People");
        //Menu Actions
        ActionMenuItem registerPeople = new PostDataMenuAction(
                "Register Person");
        ActionMenuItem deactivatePeople = new PostDataMenuAction(
                "Deactivate Person");
        ActionMenuItem viewPeople = new GetDataMenuAction("View Person");

        peopleMenu.addMenuItem(registerPeople);
        peopleMenu.addMenuItem(deactivatePeople);
        peopleMenu.addMenuItem(viewPeople);
        peopleMenu.addMenuItem(menu);

        ConsoleMenu itemsMenu = new ConsoleMenu("Items");
        ConsoleMenu rentMenu = new ConsoleMenu("Rent");
        ConsoleMenu orderMenu = new ConsoleMenu("Order");
        ConsoleMenu reviewsMenu = new ConsoleMenu("Reviews");

        menu.addMenuItem(peopleMenu);
        menu.addMenuItem(itemsMenu);
        menu.addMenuItem(rentMenu);
        menu.addMenuItem(orderMenu);
        menu.addMenuItem(reviewsMenu);
        menu.addMenuItem(menu);
        menu.execute();

    }
}
