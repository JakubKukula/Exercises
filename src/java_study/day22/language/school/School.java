package java_study.day22.language.school;

import java.util.*;

public class School {

    private List<Course> courseList;

    public School(List<Course> courseList) {
        this.courseList = new ArrayList<>(courseList);
    }

    public Map<Languages, Integer> overview() {
        Map<Languages, Set<Student>> countStudents = new HashMap<>();
        for (Course course : courseList) {
            if (!countStudents.containsKey(course.getLanguages())) {
                countStudents.put(course.getLanguages(), new HashSet<>());
            }
            countStudents.get(course.getLanguages()).addAll(course.getStudents());
        }
        Map<Languages, Integer> result = new TreeMap<>();
        for (Map.Entry<Languages, Set<Student>> entry : countStudents.entrySet()) {
            result.put(entry.getKey(), entry.getValue().size());
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
