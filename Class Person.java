import java.util.*;

class person {
       // This is Attribute
       protected String name;
       protected int age;

      // This is Methods
      public void setName(String name) {
              this.name = name;
}

public void setAge(int age) {
        this.age = age;
}

public String getName() {
}

public int getAge() { 
        return this.age;
}

Public void printInformation() {

        System.out.printIn(“Name : ’’ + getName());
        System.out.printIn(“Age : ” + getAge());

}

Public static void main(String[] args) {
        Instructor assign = new Intructor();
        assign.setName(“Matsa”);  //excemple name student is miss matsa
        assign.setAge(21);   //age is 21 years old
        assign.printInformation(); 
        assign.assign();
}
}




       
