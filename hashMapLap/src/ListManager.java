
// TODO 1: Import HashMap, Map, and Set types
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class ListManager {

    // TODO 2: Create a new hash map named studentsMap //
    Map<String, Student> studentsMap = new HashMap<>();


    public ListManager(Student [] students){
        /* TODO 3:  Iterate through the studentsArray and add the
                    data to the studentsMap. Use the students'
                    last names as the keys and the student
                    objects as the values  */
        for (Student student : students) {
            studentsMap.put(student.lastName, student);
        }
    }


    public void listStudents( ){

        // TODO 4: Check if studentsMap is empty.
        if (studentsMap.isEmpty()) {
            // TODO 5: If studentsMap is empty, print an alert saying that
            System.out.println("No students found.");
            return;
        }
        /* TODO 6: If the studentMap is not empty, print a list of all
                   student  */
        Set<String> keys = studentsMap.keySet();
        for (String key : keys) {
            Student student = studentsMap.get(key);
            System.out.println(student);
        }

    }

    public void findStudent(String lastName){

        /* TODO 7: Check to see if studentMap contains the
                   lastName as a key If the key is not found. Print an
                   error message and return.*/
        if (!studentsMap.containsKey(lastName)) {
            // TODO 10: If the student doesn't exist. Print error message */
            System.out.println("Student not found.");
            return;
        }

        /* TODO 8: Get a reference to the Student whose key is the
                   lastName */
        Student student = studentsMap.get(lastName);

        // TODO 9: If the student exists, print the Student object
        if (student != null) {
            System.out.println(student);
        }

    }


    public void updateStudentStatus(String lastName, String newStatus){
        /* TODO 12: Use the get() method on studentMap to obtain a
                    reference to the Student object */
        Student student = studentsMap.get(lastName);

        /* TODO 13: If the student exists, change the status to
                    newStatus, and print a confirmation message. */
        if (student != null) {
            student.status = newStatus;
            System.out.println("Student status updated: " + student);
        }else {
            // TODO 14: Print an error message if the student doesn't exist.
            System.out.println("Student not found.");
        }


    }


    public void removeStudent(String lastName){

        /* TODO 16: using the lastName parameter, attempt to remove
                    a student from the studentsMap */
        Student student = studentsMap.remove(lastName);

        /* TODO 17:  print a message confirmation and student
                     information if the student was successfully
                     removed. */
        if (student != null) {
            System.out.println("Student removed: " + student);
        } else {
            System.out.println("Student not found.");
        }

        /* TODO 18: If the student is not removed, print
                    a statement that the student was not removed. */
    }
}