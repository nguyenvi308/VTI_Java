package backend.businesslayer;

import datalayer.GroupAccountRepository;

public class GroupService   {

    GroupAccountRepository groupAccountRepository;

    public GroupService(GroupAccountRepository groupAccountRepository) {
        this.groupAccountRepository = groupAccountRepository;
    }



}
