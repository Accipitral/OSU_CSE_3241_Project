import java.util.Scanner;

public class PostDataMenuAction extends ActionMenuItem {

    public Scanner stdin;

    public PostDataMenuAction(String description) {
        this.stdin = new Scanner(System.in);
        this.textDescription = description;
    }

    @Override
    public void execute() {
        FakeDataStore.DataList1.add(this.stdin.next());
    }
}