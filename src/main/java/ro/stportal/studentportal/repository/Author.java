package ro.stportal.studentportal.repository;

public class Author extends BaseEntity{
    private Name name;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }
}
