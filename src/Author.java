import java.util.Objects;

public class Author {
    private final String name;
    private final String surName;

    public Author(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String toString() {
        return this.name + " "+ this.surName;
    }

    public boolean equals(Object o) {
        return equals(o);
    }

    public int hashCode() {
        return Objects.hash(name, surName);
    }
}