package registration.models;

import registration.screens.InstructorScreen;

import javax.swing.*;

public class Instructor extends User {
    private String title;
    private int departmentId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public void login() {
        InstructorScreen screen = new InstructorScreen(this);
        showScreen(screen);
    }
}
