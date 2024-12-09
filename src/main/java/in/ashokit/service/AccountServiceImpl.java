package in.ashokit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.ashokit.bindings.UnlockAccountForm;
import in.ashokit.bindings.UserAccountForm;

@Service
public class AccountServiceImpl implements AccountService {

    @Override
    public boolean createUserAccount(UserAccountForm accForm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUserAccount'");
    }

    @Override
    public List<UserAccountForm> fetchUserDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fetchUserDetails'");
    }

    @Override
    public UserAccountForm getUserAccById(Integer accId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserAccById'");
    }

    @Override
    public String changeAccStatus(Integer accId, String status) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changeAccStatus'");
    }

    @Override
    public String unLockAccStatus(UnlockAccountForm unlockAccountForm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'unLockAccStatus'");
    }

}
