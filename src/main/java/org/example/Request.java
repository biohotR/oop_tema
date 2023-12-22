package org.example;

import lombok.Getter;
import lombok.Setter;

import java.net.Authenticator;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter @Setter
public class Request {
    public enum RequestType {
        DELETE_ACCOUNT, ACTOR_ISSUE, MOVIE_ISSUE, OTHERS
    }

    private RequestType type;
    private LocalDateTime creationTime;
    private String name;
    private String description;
    private String userUsername;
    private String resolverUsername;

    public Request(RequestType type, String title, String description,
                   String userUsername, String resolverUsername) {
        this.type = type;
        this.creationTime = LocalDateTime.now();
        this.name = title;
        this.description = description;
        this.userUsername = userUsername;
        this.resolverUsername = resolverUsername;
    }
    public String getFormattedDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return creationTime.format(formatter);
    }

    @Override
    public String toString() {
        return "Request{" +
                "type=" + type +
                ", creationTime=" + getFormattedDate() +
                ", title='" + name + '\'' +
                ", description='" + description + '\'' +
                ", userUsername='" + userUsername + '\'' +
                ", resolverUsername='" + resolverUsername + '\'' +
                '}';
    }
}
