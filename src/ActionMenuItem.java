
public abstract class ActionMenuItem {

    public String textDescription;

    public abstract void execute(ActionMenuItem callingAction);

    @Override
    public String toString() {
        if (this.textDescription == null) {
            return "";
        }
        return this.textDescription;
    }
}
