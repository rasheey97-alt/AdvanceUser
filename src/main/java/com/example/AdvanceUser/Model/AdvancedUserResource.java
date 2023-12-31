package com.example.AdvanceUser.Model;

import lombok.Data;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

@Data
public class AdvancedUserResource extends RepresentationModel<AdvancedUserResource> {
    private AdvancedUser advancedUser;
}
