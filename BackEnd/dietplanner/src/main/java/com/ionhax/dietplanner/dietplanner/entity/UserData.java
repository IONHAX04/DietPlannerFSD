package com.ionhax.dietplanner.dietplanner.entity;


import com.ionhax.dietplanner.dietplanner.entity.Enumerate.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;
  
    private String name;
    private String email;
    private String password;
    private Role role;
}
