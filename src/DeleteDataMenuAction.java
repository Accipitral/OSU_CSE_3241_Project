import java.util.Scanner;

public class DeleteDataMenuAction implements ActionMenuItem {

    public Scanner stdin;

    public DeleteDataMenuAction() {
        this.stdin = new Scanner(System.in);
    }

    @Override
    public void execute() {
        int id = this.stdin.nextInt();//Need error checking.
        if (id > FakeDataStore.DataList1.size() || id < 1) {
            FakeDataStore.DataList1.remove(id - 1);
        }
    }
}