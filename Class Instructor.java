import java.util.*;

Class Instructor extends person {
    @Size(max = 1)
    Set<Course> teacher; // teacher select course

    public void assign() {
        System.out.println("-- Assign --");
    }
}