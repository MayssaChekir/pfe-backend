package com.example.Pfe_backend.Controller;


import com.example.Pfe_backend.Entity.Group;
import com.example.Pfe_backend.Service.GroupService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@CrossOrigin("*")
@RequestMapping("/api/v4")
public class GroupController {
    private GroupService groupService;

    @GetMapping("/group")
    public List<Group> getGroup(){
        return groupService.getGroup();
    }
}
