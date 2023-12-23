package org.example.user_subclasses;

import org.example.user_subclasses.Admin;
import org.example.user_subclasses.Contributor;
import org.example.user_subclasses.Regular;
import org.example.user_subclasses.User;

public class UserFactory {
    public static User createUser(User.AccountType accountType, User.Information information, int experience) {
        return switch (accountType) {
            case REGULAR -> new Regular(information, experience);
            case CONTRIBUTOR -> new Contributor(information, experience);
            case ADMIN -> new Admin(information, experience);
            default -> throw new IllegalArgumentException("Invalid account type");
        };
    }
}
