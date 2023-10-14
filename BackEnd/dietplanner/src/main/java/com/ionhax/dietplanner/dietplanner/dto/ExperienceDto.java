package com.ionhax.dietplanner.dietplanner.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor


public class ExperienceDto {
 
    private String title;
    private String content;
    private String username;
}
