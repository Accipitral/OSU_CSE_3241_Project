
public class GetCommunityMembersDataAction extends GetDataMenuAction {

    public GetCommunityMembersDataAction(String description) {
        super(description);
    }

    @Override
    public void execute(ActionMenuItem callingAction) {
        for (int i = 0; i < FakeDataStore.CommunityMemberTable.size(); i++) {
            System.out.println(FakeDataStore.CommunityMemberTable.get(i));
        }

        if (callingAction != null) {
            callingAction.execute(null);
        }
    }
}