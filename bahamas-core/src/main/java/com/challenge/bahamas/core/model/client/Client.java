package com.challenge.bahamas.core.model.client;

import com.challenge.bahamas.core.model.contact.PreferredContact;
import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {

    Long id;

    @NotBlank
    String name;

    @Email
    @NonNull
    String email;

    String address;

    String city;

    @JsonAlias("postal_code")
    String postalCode;

    @NonNull
    @NotBlank
    @JsonAlias("fiscal_id")
    String fiscalId;

    String website;

    String country;

    String phone;

    String fax;

    @JsonAlias("preferred_contact")
    PreferredContact preferredContact;

    String observations;

    @JsonAlias("send_options")
    Integer sendOptions;

    @JsonAlias("open_account_link")
    String openAccountLink;

}
