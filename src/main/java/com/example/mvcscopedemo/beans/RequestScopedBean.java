package com.example.mvcscopedemo.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@RequestScope
@Getter
@Setter
@Component
public class RequestScopedBean {
    private int value;
}
