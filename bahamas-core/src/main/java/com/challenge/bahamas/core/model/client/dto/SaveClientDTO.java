package com.challenge.bahamas.core.model.client.dto;

import com.challenge.bahamas.core.model.client.Client;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PROTECTED)
public class SaveClientDTO {

    Client client;
}
