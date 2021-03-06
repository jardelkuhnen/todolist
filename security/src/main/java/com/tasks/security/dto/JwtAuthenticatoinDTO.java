package com.tasks.security.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class JwtAuthenticatoinDTO {

    @NotEmpty(message = "Email cannot be empty!")
    @Email(message = "Email not valid!")
    private String email;

    @NotEmpty(message = "Password cannot be empty!")
    private String password;

}
