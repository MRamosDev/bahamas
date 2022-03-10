package com.challenge.bahamas.core.model.contact;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Email;


@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PreferredContact {

    @NonNull
    String name;

    @Email
    String email;

    @NonNull
    String phone;

}
