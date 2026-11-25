package java_study.day22.language.school;

import java.util.*;

public class School {

    private List<Course> courseList = new ArrayList<>();

    public School(List<Course> courseList) {
        this.courseList = new ArrayList<>(courseList);
    }

    public Map<Languages, List<Student>> overview(List<Course> courses) {
        Map<Languages, List<Student>> result = new TreeMap<>();
        for (Course course : courses) {
            Languages language = course.getLanguages();
            if (!result.containsKey(language)) {
                result.put(language, new ArrayList<>());
            }
            for (Student student : course.getStudents()) {
                result.get(language).add(student);
            }
        }
        return result;
    }

    public Set<Student> students(List<Course> courses) {
        Set<Student> result = new HashSet<>();
        for (Course course : courses) {
            result.addAll(course.getStudents());
        }
        return result;
    }

    public List<Course> getCourseList() {
        return new ArrayList<>(courseList);
    }
}
