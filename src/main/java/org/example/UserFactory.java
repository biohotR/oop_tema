package org.example;

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
