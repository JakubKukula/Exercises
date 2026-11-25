package java_study.day22.language.school;

import java.util.*;

public class School {

    private List<Course> courseList;

    public School(List<Course> courseList) {
        this.courseList = new ArrayList<>(courseList);
    }

    public Map<Languages, Integer> overview() {
        Map<Languages, Integer> result = new TreeMap<>();
        for (Course course : courseList) {
            result.put(course.getLanguages(), result.getOrDefault(course.getLanguages(), 0) + 1);
        }
        return result;
    }

    public Set<Student> students() {
        Set<Student> result = new HashSet<>();
        for (Course course : courseList) {
            result.addAll(course.getStudents());
        }
        return result;
    }

    public List<Course> getCourseList() {
        return new ArrayList<>(courseList);
    }
}
