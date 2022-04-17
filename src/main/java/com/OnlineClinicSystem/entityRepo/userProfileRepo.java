package com.OnlineClinicSystem.entityRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OnlineClinicSystem.entity.userProfile;


@Repository
public interface userProfileRepo extends JpaRepository<userProfile, Long>{
userProfile findByemailID(String email);
}
