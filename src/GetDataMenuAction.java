
public class GetDataMenuAction extends ActionMenuItem {

    public GetDataMenuAction(String description) {
        this.textDescription = description;
    }

    @Override
    public void execute() {
        for (int i = 0; i < FakeDataStore.DataList1.size(); i++) {
            System.out.println(FakeDataStore.DataList1.get(i));
        }
    }
}