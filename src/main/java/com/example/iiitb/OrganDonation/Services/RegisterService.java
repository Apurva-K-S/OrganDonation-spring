package com.example.iiitb.OrganDonation.Services;

import com.example.iiitb.OrganDonation.Beans.primaryUser;
import com.example.iiitb.OrganDonation.Controller.LoginController;
import com.example.iiitb.OrganDonation.DAO.primaryUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Named;
import javax.validation.constraints.Null;
@Named
@Slf4j
public class RegisterService {

    primaryUserRepository prmUsrRepo ;
    private static final Logger logger = LoggerFactory.getLogger(RegisterService.class);
    //private static final Logger logger = LogManager.getLogger(LoginController.class);

    @Autowired
    public RegisterService(primaryUserRepository prmUsrRepo)
    {
        logger.info("[INFO]: inside RegisterService()");
        this.prmUsrRepo = prmUsrRepo;
    }

    public boolean registerUser(primaryUser prmUser)
    {
        logger.info("[INFO]: inside registerUser()");
        primaryUser n = new primaryUser();


        n.setFirstName(prmUser.getFirstName());
        n.setSecondary_first_name(prmUser.getSecondary_first_name());

        n.setLastName(prmUser.getLastName());
        n.setSecondary_last_name(prmUser.getSecondary_last_name());

        n.setEmail(prmUser.getEmail());
        n.setSecondary_email(prmUser.getSecondary_email());

        n.setAadhar(prmUser.getAadhar());
        n.setSecondary_aadhar(prmUser.getSecondary_aadhar());

        n.setPhone(prmUser.getPhone());
        n.setSecondary_phone(prmUser.getSecondary_phone());

        n.setGender(prmUser.getGender());
        n.setSecondary_relationship(prmUser.getSecondary_relationship());
        n.setTermsConditionsCheckbox(prmUser.getTermsConditionsCheckbox());
        n.setBloodGroup(prmUser.getBloodGroup());
        n.setPassword(prmUser.getPassword());
        n.setAge(prmUser.getAge());

        primaryUser temp= prmUsrRepo.save(n);

        if(temp == null)
            return false;
        return true;
    }
}
