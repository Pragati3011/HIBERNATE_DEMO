package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
public class Student {

    @Id
    private int studentId;
    private String studentName;
    private String about;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Address> add;

    public Student() {
        super();
    }

    public Student(int studentId, String studentName, String about, List<Address> add) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.about = about;
        this.add = add;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<Address> getAdd() {
        return add;
    }

    public void setAdd(List<Address> add) {
        this.add = add;
    }
}
