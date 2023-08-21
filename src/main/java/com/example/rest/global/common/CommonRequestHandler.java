package com.example.rest.global.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Configuration
public class CommonRequestHandler extends AbstractRepositoryEventListener {

    @Override
    protected void onBeforeCreate(Object entity) {
        log.info("All Entity Messaging Before Create");
        super.onBeforeCreate(entity);
    }

    @Override
    protected void onBeforeSave(Object entity) {
        log.info("All Entity Messaging Before Save");
        super.onBeforeSave(entity);
    }


    @Override
    protected void onAfterSave(Object entity) {
        log.info("All Entity Messaging After Save");
        super.onAfterSave(entity);
    }
}
