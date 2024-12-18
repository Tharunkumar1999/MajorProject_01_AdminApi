package in.ashokit.service;

import in.ashokit.bindings.DashboardCard;
import in.ashokit.bindings.LoginForm;

public interface UserService {

    public String login(LoginForm loginForm);

    public boolean recoverPassword(String email);

    public DashboardCard fetchDashboardInfo();

}
