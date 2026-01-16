package java_school;

public class Teachers extends People {
    private String subject;
    private String course;
    private String room;

    public Teachers() {}

    public Teachers(String dni, String names, String last_names, String email, String mobile) {
        super(dni, names, last_names, email, mobile);
    }

    public Teachers(String dni, String names, String last_names, String email, String mobile, String subject, String course, String room) {
        super(dni, names, last_names, email, mobile);
        this.subject = subject;
        this.course = course;
        this.room = room;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
