
/**
 * This class represents a menu option: Text Description Execute Option
 *
 * @author happy
 *
 */
public class MenuOption {
    private String textDescription;

    private ActionMenuItem action;

    public MenuOption(String description, ActionMenuItem MenuAction) {
        this.textDescription = description;
        this.action = MenuAction;
    }

    public void print() {
        System.out.println(this.textDescription);
    }

    public void select() {
        this.action.execute();
    }

}
