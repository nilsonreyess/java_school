package java_school;

public class People {
    private String dni;
    private String names;
    private String last_names;
    private String age;
    private String email;
    private String mobile;

    public People() {}

    public People(String dni, String names, String last_names, String email, String mobile) {
        this.dni = dni;
        this.names = names;
        this.last_names = last_names;
        this.email = email;
        this.mobile = mobile;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLast_names() {
        return last_names;
    }

    public void setLast_names(String last_names) {
        this.last_names = last_names;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    // Methods
    public String getFullName() {
        return this.names + " " + this.last_names;
    }
}
