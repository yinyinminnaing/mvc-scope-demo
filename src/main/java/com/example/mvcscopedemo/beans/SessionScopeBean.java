package com.example.mvcscopedemo.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
@Getter
@Setter
@Component
public class SessionScopeBean {
    private int value;
}
