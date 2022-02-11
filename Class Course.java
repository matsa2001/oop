import java.util.*;

Class Course {
    protected String name;
    protected Double grade;
    Set<Instructor> teach;
    @Size(max = 1) Set<Select> lesson;
}