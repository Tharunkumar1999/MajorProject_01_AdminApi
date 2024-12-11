package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.ashokit.bindings.DashboardCard;
import in.ashokit.bindings.LoginForm;
import in.ashokit.entities.UserEntity;
import in.ashokit.repositories.UserRepo;
import in.ashokit.utils.EmailUtils;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private EmailUtils emailUtils;

    @Override
    public String login(LoginForm loginForm) {
        
        UserEntity entity =  userRepo.findByEmailAndPwd(loginForm.getEmail(), loginForm.getPwd());

        if(entity == null){
            return "Invalid Credentials";
        }

        if("Y".equals(entity.getActiveSw()) && "UNLOCKED".equals(entity.getAccStatus())){
            return "Success";
        }else{
            return "Account Locked/In-Active";
        }
    }

    @Override
    public boolean recoverPassword(String email) {
        
        UserEntity userEntity = userRepo.findByEmail(email);

        if(null == userEntity){
            return false;
        }else{
            String subject="";
            String body="";
            return emailUtils.sendEmail(subject, body, email);
        }
    }

    @Override
    public DashboardCard fetchDashboardInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fetchDashboardInfo'");
    }

}
