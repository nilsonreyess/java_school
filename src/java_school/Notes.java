import java.util.ArrayList;
import java.util.Arrays;

public class Notes {
    private String student;
    private String subject;
    private float note;

    public Notes(String student, String subject, float note) {
        this.student = student;
        this.subject = subject;
        this.note = note;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }
}
