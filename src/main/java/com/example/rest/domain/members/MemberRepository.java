package com.example.rest.domain.members;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Optional;


public interface MemberRepository extends JpaRepository<Member, Long> {
//    @RestResource()
    Page findByName(String name, Pageable p);
}
