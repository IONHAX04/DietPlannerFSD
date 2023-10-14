package com.ionhax.dietplanner.dietplanner.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;


import com.ionhax.dietplanner.dietplanner.entity.UserData;

public interface UserDataRepository extends CrudRepository<UserData, String> {
    Optional<UserData> findByEmail(String email);
    Optional<UserData> findByUid(Long Uid);
}
