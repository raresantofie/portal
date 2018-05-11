package ro.stportal.studentportal.repository;

public class Student extends User{

    private Faculty faculty;
    private int facultyYear;
    private Gender gender;
    private boolean accommodationStatus = false;

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getFacultyYear() {
        return facultyYear;
    }

    public void setFacultyYear(int facultyYear) {
        this.facultyYear = facultyYear;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean isAccommodationStatus() {
        return accommodationStatus;
    }

    public void setAccommodationStatus(boolean accommodationStatus) {
        this.accommodationStatus = accommodationStatus;
    }
}
