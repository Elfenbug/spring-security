package ru.ibs.security.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.ibs.security.entity.Role;
import ru.ibs.security.repository.RoleRepository;

@Service
@RequiredArgsConstructor
public class RoleService {
    private final RoleRepository roleRepository;

    public Role getUserRole() {
        return roleRepository.findByName("ROLE_USER").get();
    }
}
