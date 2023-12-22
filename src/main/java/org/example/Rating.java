package org.example;
import lombok.Getter;
import lombok.Setter;

public class Rating {
    @Getter @Setter
    private String username;
    @Getter
    private int grade;
    @Getter @Setter
    private String comments;

    public Rating(String username, int grade, String comments) {
        this.username = username;
        this.grade = grade;
        this.comments = comments;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10)
            this.grade = grade;
        else
            throw new IllegalArgumentException("Score must be between 1 and 10");
    }

    public String toString()
    {
        return "Rating{" +
                "username " + username +
                " score " + grade +
                " comments " + comments;
    }
}
