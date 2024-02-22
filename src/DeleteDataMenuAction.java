import java.util.Scanner;

public class DeleteDataMenuAction extends ActionMenuItem {

    public Scanner stdin;

    public DeleteDataMenuAction(String description) {
        this.stdin = new Scanner(System.in);
        this.textDescription = description;
    }

    @Override
    public void execute(ActionMenuItem callingAction) {
        int id = this.stdin.nextInt();//Need error checking.
        if (id > FakeDataStore.DataList1.size() || id < 1) {
            FakeDataStore.DataList1.remove(id - 1);
        }
        if (callingAction != null) {
            callingAction.execute(null);
        }
    }
}