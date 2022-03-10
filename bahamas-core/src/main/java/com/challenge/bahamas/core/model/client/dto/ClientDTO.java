package com.challenge.bahamas.core.model.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class ClientDTO {

    @NonNull
    String name;

    @Email
    @NonNull
    String email;

    @JsonProperty("fiscal_id")
    @NonNull
    String fiscalId;

    @JsonProperty("api_key")
    String apiToken;

}
