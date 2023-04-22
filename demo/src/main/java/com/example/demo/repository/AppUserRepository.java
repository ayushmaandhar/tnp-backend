package com.example.demo.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.AppUser;


@Repository
@Transactional(readOnly = true)
public interface AppUserRepository {
	Optional<AppUser> findByEmail (String email);

}
