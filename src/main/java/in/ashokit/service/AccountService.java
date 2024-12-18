package in.ashokit.service;

import java.util.List;

import in.ashokit.bindings.UnlockAccForm;
import in.ashokit.bindings.UserAccForm;

public interface AccountService {

    public boolean createUserAccount(UserAccForm accForm);

    public List<UserAccForm> fetchUserDetails();

    public UserAccForm getUserAccById(Integer accId);

    public String changeAccStatus(Integer accId, String status);

    public String unLockAccStatus(UnlockAccForm unlockAccountForm);
    
}
