package java_school;

import javax.swing.*;
import java.util.Objects;

public class Main {
    static Teachers teacher;
    static Students student;

    public static void main(String[] args) {

        int opcion;
        do {
            // Menu de la aplicación
            opcion = menu();

            // Valido la opción
            if (opcion == 1) {
                //Capturar los datos para el profesor.
                create_person("teacher");

            } else if (opcion == 2) {
                //Capturar los datos para el profesor.
                create_person("student");

            } else if (opcion == 3) {
                //Mostrar datos del profesor
                show_person(teacher, "Profesor");

            } else if (opcion == 4) {
                //Mostrar datos del estudiante
                show_person(student, "Estudiante");

            } else if (opcion == 5) {
                enroll_subject();

            }

        } while (opcion != 9);

        System.out.println("Gracias por usar mi aplicación...");

    }

    private static Integer menu() {
        String menu_app = "..:: Menú de la aplicación ::.. \n1-. Crear profesor \n2-. Crear estudiante \n3-. Leer profesor \n4-. Leer estudiante \n5-. Matricular asignatura \n9-. Terminar \n \n Seleccione su opción: ";

        // Capturo la opción
        return Integer.parseInt(JOptionPane.showInputDialog(menu_app, JOptionPane.WARNING_MESSAGE));
    }

    private static void create_person(String people) {
        String person;
        if (Objects.equals(people, "teacher")) {
            person = "Profesor";
        } else {
            person = "Estudiante";
        }

        String dni = JOptionPane.showInputDialog("Digite el DNI del " + person, JOptionPane.INFORMATION_MESSAGE);
        String names = JOptionPane.showInputDialog("Digite los nombres del " + person, JOptionPane.INFORMATION_MESSAGE);
        String last_names =JOptionPane.showInputDialog("Digite los apellidos del " + person, JOptionPane.INFORMATION_MESSAGE);
        String email = JOptionPane.showInputDialog("Digite el correo del " + person, JOptionPane.INFORMATION_MESSAGE);
        String mobile = JOptionPane.showInputDialog("Digitel el celular del " + person, JOptionPane.INFORMATION_MESSAGE);

        if (people.equals("teacher")) {
            teacher = new Teachers(dni, names, last_names, email, mobile);
        } else {
            student = new Students(dni, names, last_names, email, mobile);
        }
    }

    private static void show_person(People person, String message) {
        if (person != null) {
            String data = "Documento No. : " + person.getDni() + "\n Nombre completo: " + person.getFullName() + "\n Correo: " + person.getEmail() + "\n Celular No.: " + person.getMobile();
            if (!student.getSubjects().isEmpty()){
                data += "\n --- Asignaturas matriculadas --- \n Las asignaturas.";
            }

            JOptionPane.showMessageDialog(null, data, "Datos del " + message, JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido procesar la petición.", "Error: Datos nulos", JOptionPane.ERROR_MESSAGE);

        }

    }

    private static void enroll_subject() {
        if (student != null) {
            String message = "Matrícular asignatura para el estudiante \n" + student.getFullName();
            String subject = JOptionPane.showInputDialog(message, JOptionPane.INFORMATION_MESSAGE);
            student.setSubjects(subject);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido procesar la petición.", "Error: Datos nulos", JOptionPane.ERROR_MESSAGE);
        }

    }

}