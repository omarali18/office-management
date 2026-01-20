package com.project.officeManagement.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequestDto {

    private String name;
    private String email;
    private ProfileRequestDto profile;
}
