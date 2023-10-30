package org.sid.transfersservice.models;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Client
{
    private Long id;
    private String name;
    private String email;
}
