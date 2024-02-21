import java.util.Scanner;

public class PostDataMenuAction implements ActionMenuItem {

    public Scanner stdin;

    public PostDataMenuAction() {
        this.stdin = new Scanner(System.in);
    }

    @Override
    public void execute() {
        FakeDataStore.DataList1.add(this.stdin.next());
    }
}