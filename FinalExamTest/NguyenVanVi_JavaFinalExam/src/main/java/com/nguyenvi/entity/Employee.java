package com.nguyenvi.entity;

/**
 * Project: TemplateExam
 * Package: com.nguyenvi.entity
 * <p>
 * User: Nguyen Vi
 * Date: 11/17/2020
 * Time: 8:14 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Employee extends User {

    private int projectId;
    private String ProSkill;

    public Employee(int userID, String fullName, String email, String password, int projectId, String proSkill) {
        super(userID, fullName, email, password);
        this.projectId = projectId;
        ProSkill = proSkill;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProSkill() {
        return ProSkill;
    }

    public void setProSkill(String proSkill) {
        ProSkill = proSkill;
    }
}
