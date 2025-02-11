package com.tiagostmg.first_spring_app.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.PostMapping;

@Getter
@Setter
@AllArgsConstructor
public class User {

    private String name;
    private String email;
}
