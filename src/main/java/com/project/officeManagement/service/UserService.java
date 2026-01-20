package com.project.officeManagement.service;

import com.project.officeManagement.dto.UserRequestDto;
import com.project.officeManagement.entity.ProfileEntity;
import com.project.officeManagement.entity.UserEntity;
import com.project.officeManagement.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public UserEntity createUser(UserRequestDto dto){

        UserEntity userEntity = UserEntity.builder()
                .name(dto.getName())
                .email(dto.getEmail())
                .build();

        ProfileEntity profileEntity = ProfileEntity.builder()
                .address(dto.getProfile().getAddress())
                .phone(dto.getProfile().getPhone())
                .userEntity(userEntity)
                .build();

        return userRepository.save(userEntity);
    }
}
