package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Credentials {
    private String username;
    private String password;

    public Credentials(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
