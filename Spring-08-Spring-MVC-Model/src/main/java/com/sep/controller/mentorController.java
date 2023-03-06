package com.sep.controller;

import com.sep.enums.Gender;
import com.sep.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/mentor")
public class mentorController {
    @RequestMapping("/list")
    public String info(Model model) {

        List<Mentor> mentors = new ArrayList<>();
        mentors.add(new Mentor("Nick", "Tabakh", 20, Gender.Male));
        mentors.add(new Mentor("sepehr", "Tabakh", 36, Gender.Male));
        mentors.add(new Mentor("Kimia", "Tabakh", 15, Gender.Female));
        model.addAttribute("mentors", mentors);

        return "mentor/mentor-list";
    }
}
