package com.example.rest.domain.members;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;


public interface MemberRepository extends JpaRepository<Member, Repository> {
}
