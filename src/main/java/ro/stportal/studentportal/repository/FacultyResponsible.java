package ro.stportal.studentportal.repository;

public class FacultyResponsible extends User {

    private String phoneNumber;
    private User responsible;
    private Faculty faculty;
    private FacultyResponsibleType facultyResponsibleType;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User getResponsible() {
        return responsible;
    }

    public void setResponsible(User responsible) {
        this.responsible = responsible;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public FacultyResponsibleType getFacultyResponsibleType() {
        return facultyResponsibleType;
    }

    public void setFacultyResponsibleType(FacultyResponsibleType facultyResponsibleType) {
        this.facultyResponsibleType = facultyResponsibleType;
    }
}
