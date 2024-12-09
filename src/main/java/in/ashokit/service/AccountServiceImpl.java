package in.ashokit.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.bindings.UnlockAccForm;
import in.ashokit.bindings.UserAccForm;
import in.ashokit.entities.UserEntity;
import in.ashokit.repositories.UserRepo;
import in.ashokit.utils.EmailUtils;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private EmailUtils emailUtils;

    @Override
    public boolean createUserAccount(UserAccForm accForm) {

        UserEntity entity = new UserEntity();
        BeanUtils.copyProperties(accForm, entity);

        //set random password
        entity.setPwd(generatePwd());

        //set acc status
        entity.setAccStatus("LOCKED");
        entity.setActiveSw("Y");
        userRepo.save(entity);

        //send email
        String subject ="";
        String body ="";

        return emailUtils.sendEmail(subject, body, accForm.getEmail());
    }

    @Override
    public List<UserAccForm> fetchUserDetails() {

       List<UserEntity> userEntities = userRepo.findAll();

       List<UserAccForm> users = new ArrayList<UserAccForm>();

       for (UserEntity userEntity : userEntities){
            UserAccForm user =new UserAccForm();
            BeanUtils.copyProperties(userEntity, user);
            users.add(user);
       }

        return users;
    }

    @Override
    public UserAccForm getUserAccById(Integer accId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserAccById'");
    }

    @Override
    public String changeAccStatus(Integer accId, String status) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'changeAccStatus'");
    }

    @Override
    public String unLockAccStatus(UnlockAccForm unlockAccForm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'unLockAccStatus'");
    }

     private String generatePwd(){

        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";

        // combine all strings
        String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 6;
        for(int i = 0; i < length; i++) {
            // generate random index number
            int index = random.nextInt(alphaNumeric.length());
            // get character specified by index
            // from the string
            char randomChar = alphaNumeric.charAt(index);
            // append the character to string builder
            sb.append(randomChar);
        }
        return sb.toString();
    }
}


