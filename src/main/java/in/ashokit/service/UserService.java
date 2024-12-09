package in.ashokit.service;

import in.ashokit.bindings.DashboardCard;
import in.ashokit.bindings.LoginForm;

public interface UserService {

    public String login(LoginForm loginForm);

    public boolean forgetPassword(String email);

    public DashboardCard fetchDashboardInfo();

}