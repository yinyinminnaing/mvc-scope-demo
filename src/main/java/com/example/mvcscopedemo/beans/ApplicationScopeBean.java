package com.example.mvcscopedemo.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@ApplicationScope
@Component
@Getter @Setter
public class ApplicationScopeBean {
    private int value;
}
