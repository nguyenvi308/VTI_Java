package backend.entity;

/*
GroupID int AI PK
GroupName varchar(10)
CreatorID mediumint
CreateDate date

 */
public class Group {

    private int groupId;
    private String groupName;

    public Group(int groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }

    public int getGroupId() {
        return groupId;
    }


    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return groupId + "   " + groupName;
    }
}
