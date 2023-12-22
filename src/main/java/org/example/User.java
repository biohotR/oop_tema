package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

@Getter @Setter
public abstract class User<T extends Comparable<T>> {
    public static class Information {
        private String name;
        private String country;
        private int age;
        private char gender;
        private LocalDateTime birthDate;
        private Credentials credentials;

        private Information(Builder builder) {
            this.name = builder.name;
            this.country = builder.country;
            this.age = builder.age;
            this.gender = builder.gender;
            this.birthDate = builder.birthDate;
            this.credentials = builder.credentials;
        }

        public static class Builder {
            private String name;
            private String country;
            private int age;
            private char gender;
            private LocalDateTime birthDate;
            private Credentials credentials;

            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Builder country(String country) {
                this.country = country;
                return this;
            }

            public Builder age(int age) {
                this.age = age;
                return this;
            }
            public Builder gender(char gender) {
                this.gender = gender;
                return this;
            }
            public Builder birthDate(LocalDateTime birthDate) {
                this.birthDate = birthDate;
                return this;
            }
            public Builder credentials(Credentials credentials) {
                this.credentials = credentials;
                return this;
            }

            public Information build() {
                return new Information(this);
            }
        }
    }
    public enum AccountType {
        REGULAR, CONTRIBUTOR, ADMIN
    }
    private Information information;
    private AccountType accountType;
    private int experience;
    private List<String> notifications;
    private SortedSet<T> favorites;

    public User(Information information, AccountType accountType, int experience) {
        this.information = information;
        this.accountType = accountType;
        this.experience = experience;
        this.notifications = new ArrayList<>();
        this.favorites = new TreeSet<>();
    }

    public abstract void addFavorite(T item);
    public abstract void removeFavorite(T item);
    public abstract void updateExperience(int exp);
    public abstract void logout();
}
