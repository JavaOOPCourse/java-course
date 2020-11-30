package helpers;

import registration.models.*;

import java.util.ArrayList;

public class DummyDatabase {
    public static ArrayList<User> users;
    public static ArrayList<Faculty> faculties;
    public static ArrayList<Department> departments;
    public static ArrayList<Course> courses;

    public DummyDatabase() {
        faculties = new ArrayList<>();
        departments = new ArrayList<>();
        courses = new ArrayList<>();
        users = new ArrayList<>();

        Faculty fac = new Faculty();
        fac.setId(1);
        fac.setName("ENGINEERING FACULTY");
        faculties.add(fac);

        Department dep = new Department();
        dep.setId(1);
        dep.setAbbreviation("CMPE");
        dep.setFacultyId(1);
        dep.setName("COMPUTER ENGINEERING");
        departments.add(dep);

        Instructor u1 = new Instructor();
        u1.setId("oguz.ak");
        u1.setPassword("oguz123");
        u1.setName("Oğuz");
        u1.setSurname("AK");
        u1.setDepartmentId(1);

        users.add(u1);

        Student s1 = new Student();
        s1.setId("selin.yazici");
        s1.setPassword("selin321");
        s1.setName("Selin");
        s1.setSurname("Yazıcı");
        s1.setDepartmentId(1);

        users.add(s1);
    }

}
