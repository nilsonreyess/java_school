package java_school;

import java.util.ArrayList;

public class Students extends People{
    private ArrayList<String> subjects = new ArrayList<>();
    private String course;
    private String room;

    public Students() {}

    public Students(String dni, String names, String last_names, String email, String mobile) {
        super(dni, names, last_names, email, mobile);
    }

    public Students(String dni, String names, String last_names, String email, String mobile, String course, String room) {
        super(dni, names, last_names, email, mobile);
        this.course = course;
        this.room = room;
    }

    public void setSubjects(String subject) {
        this.subjects.add(subject);
    }

    public String getSubjects() {
        String subjects = "";
        for (String subject : this.subjects) {
            subjects = "%s%s\n".formatted(subjects, subject);
        }
        return subjects;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
