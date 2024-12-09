package in.ashokit.service;

import java.util.List;

import in.ashokit.bindings.UnlockAccountForm;
import in.ashokit.bindings.UserAccountForm;

public interface AccountService {

    public boolean createUserAccount(UserAccountForm accForm);

    public List<UserAccountForm> fetchUserDetails();

    public UserAccountForm getUserAccById(Integer accId);

    public String changeAccStatus(Integer accId, String status);

    public String unLockAccStatus(UnlockAccountForm unlockAccountForm);
    
}
