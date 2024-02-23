public class PostCommunityMemberDataAction extends PostDataMenuAction {

    public PostCommunityMemberDataAction(String description) {
        super(description);
    }

    @Override
    public void execute(ActionMenuItem callingAction) {
        int id, warehouseDistance;
        String firstName, lastName, address, phoneNumber, email, status,
                joinDate;
        System.out.println("Please enter a userID: ");
        id = Integer.parseInt(this.stdin.nextLine());
        System.out.println("Please enter a first name:");
        firstName = this.stdin.nextLine();
        System.out.println("Please enter a last name:");
        lastName = this.stdin.nextLine();
        System.out.println("Please enter an address:");
        address = this.stdin.nextLine();
        System.out.println("Please enter a phone number:");
        phoneNumber = this.stdin.nextLine();
        System.out.println("Please enter an email: ");
        email = this.stdin.nextLine();
        System.out.println("Please enter a status: ");
        status = this.stdin.nextLine();
        System.out.println("Please enter a join date: ");
        joinDate = this.stdin.nextLine();
        System.out.println("Please enter a distance from the warehouse: ");
        warehouseDistance = this.stdin.nextInt();

        FakeDataStore.CommunityMemberTable.add(new CommunityMemberEntity(id,
                firstName, lastName, address, phoneNumber, email, status,
                joinDate, warehouseDistance));
        if (callingAction != null) {
            callingAction.execute(null);
        }
    }
}