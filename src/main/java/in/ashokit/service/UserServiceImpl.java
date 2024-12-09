package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.bindings.DashboardCard;
import in.ashokit.bindings.LoginForm;

@Service
public class UserServiceImpl implements UserService{

    @Override
    public String login(LoginForm loginForm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }

    @Override
    public boolean forgetPassword(String email) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'forgetPassword'");
    }

    @Override
    public DashboardCard fetchDashboardInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fetchDashboardInfo'");
    }

}
