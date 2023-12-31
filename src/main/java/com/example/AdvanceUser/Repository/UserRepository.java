package com.example.AdvanceUser.Repository;

//mport com.example.ingrydspringb.model.AdvancedUser;
import com.example.AdvanceUser.Model.AdvancedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository extends JpaRepository<AdvancedUser, Long> {
//    List<AdvancedUser> findByFullName(String fullName);
//    List<AdvancedUser> findByGender(String gender);
//    AdvancedUser findByEmail(String email);
//
//
//    AdvancedUser findByPhoneNumber(String phoneNumber);



}
