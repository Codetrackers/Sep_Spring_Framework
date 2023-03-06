package com.sep.model;

import com.sep.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mentor {
    private String firstName,lastName;
    private int age;
    private Gender gender;
}
