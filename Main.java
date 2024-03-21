import java.util.*;

public class Main {

    public static void main(String[] args) {
        Collection<Lecturer> lecturers = new LinkedList<>();
        Collection<Course> courses = new LinkedList<>();
        Collection<Institute> institutes = new LinkedList<>();
        Collection<Faculty> faculties = new LinkedList<>();
        Collection<AdminEmployee> adminEmployees = new LinkedList<>();

        Lecturer lecturer = new Lecturer(1, 22, "malykhin@mail.ru",
                "Малыхин А.Ю.", 4);
        lecturers.add(lecturer);

        AdminEmployee adminEmployee = new AdminEmployee("Долженко Максим Сергеевич 007", 100000.99,
                "maxim_2003@mail.ru", 5, 2);
        adminEmployees.add(adminEmployee);

        Project project = new Project("Крутой важный проект",
                new Date(2020, Calendar.APRIL, 11),
                new Date(2020, Calendar.DECEMBER, 11));

        ResearchAssociate assistant = new ResearchAssociate();
        assistant.name = "Сычев А.В.";
        assistant.fieldOfStudy = "IS";

        Dean dean = new Dean("Крыловецкий А. А.", 900000.99,
                "lil_kryl@mail.ru", 6, 3);

        Participation participation = new Participation(85);

        Course course = new Course("МиСПИС", 69, 420);
        courses.add(course);

        Institute institute = new Institute();
        institute.name = "ПИИТ";
        institute.address = "Россия, г. Воронеж, Университетская пл., д. 1, ауд. 381а";
        institutes.add(institute);

        Faculty faculty = new Faculty(dean, institute, "ФКН");
        faculties.add(faculty);

        lecturers.forEach(System.out::println);
        courses.forEach(System.out::println);
        faculties.forEach(System.out::println);
        institutes.forEach(System.out::println);
        adminEmployees.forEach(System.out::println);
        System.out.println(participation);
        System.out.println(assistant);
        System.out.println(project);
    }
}
