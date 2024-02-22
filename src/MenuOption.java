
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

    @Override
    public String toString() {
        return this.textDescription;
    }

    public void print() {
        System.out.println(this.textDescription);
    }

    public void select(ActionMenuItem callingAction) {
        this.action.execute(callingAction);
    }

}
