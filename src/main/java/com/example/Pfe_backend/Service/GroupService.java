package com.example.Pfe_backend.Service;


import com.example.Pfe_backend.Entity.Group;
import com.example.Pfe_backend.Repository.GroupRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GroupService {
    private GroupRepository groupRepository;

    public List<Group> getGroup(){
        return groupRepository.findAll();
    }
}
