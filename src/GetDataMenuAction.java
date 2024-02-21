
public class GetDataMenuAction implements ActionMenuItem {

    @Override
    public void execute() {
        for (int i = 0; i < FakeDataStore.DataList1.size(); i++) {
            System.out.println(FakeDataStore.DataList1.get(i));
        }
    }
}