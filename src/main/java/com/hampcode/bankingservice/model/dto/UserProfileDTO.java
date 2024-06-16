package com.hampcode.bankingservice.model.dto;

import com.hampcode.bankingservice.model.entities.enums.Role;
import lombok.Data;

@Data
public class UserProfileDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String email;
    private Role role;
}
