public class CommunityMemberEntity extends PersonEntity {

    public String Status;
    public String Join_Date;
    public int Warehouse_Distance;

    public CommunityMemberEntity(int id, String firstName, String lastName,
            String address, String phoneNumber, String email, String status,
            String joinDate, int warehouseDistance) {
        super(id, firstName, lastName, address, phoneNumber, email);
        this.Status = status;
        this.Join_Date = joinDate;
        this.Warehouse_Distance = warehouseDistance;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStatus: " + this.Status + "\nJoin_Date: "
                + this.Join_Date + "\nWarehouse_Distance: "
                + this.Warehouse_Distance + "\n\n";
    }
}
