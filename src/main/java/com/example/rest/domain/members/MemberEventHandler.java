package com.example.rest.domain.members;


import lombok.extern.slf4j.Slf4j;
import org.springframework.data.rest.core.annotation.*;

@RepositoryEventHandler(Member.class)
@Slf4j
public class MemberEventHandler {

    @HandleAfterLinkSave
    @HandleBeforeCreate
    public void handleMemberBeforeCreate(Member member) {
        log.info("Member Handling Before Create!!");
    }

    @HandleBeforeSave
    public void handleMemberBeforeSave(Member member) {
        log.info("Member Handling Before Save!!");
    }

    @HandleAfterSave
    public void handleMemberAfterSave(Member member) {
        log.info("Member Handling After Save!!");
    }


}
