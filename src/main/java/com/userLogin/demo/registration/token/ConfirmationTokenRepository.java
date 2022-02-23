package com.userLogin.demo.registration.token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken, Long> {

    //ADD QUERY
    Optional<ConfirmationToken> findByToken(String token);
}
