//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String[] data = {
                "Professor Isaac Newton Physics 6",
                "TA Marie Curie Physics 6",
                "Professor Isaac Newton Calculus 4",
                "Student Amy Adams Calculus 4",
                "Student Will Smith Calculus 4",
                "Student Brad Pitt Physics 6",
                "Student Will Smith Physics 6",
                "Professor Dmitri Mendeleev Chemistry 6",
                "TA Carl Gauss Calculus 4",
                "Student Amy Adams Economics 3",
                "Professor Adam Smith Economics 3",
                "TA Marie Curie Chemistry 6",
                "Student Brad Pitt Chemistry 6",
                "Student Will Smith Chemistry 6"
        };

        Person[] students = new Person[data.length]; // Student Array
        int countStudent = 0;


        Person[] professors = new Person[data.length]; // Professor Array
        int countProfessor = 0;


        // Haroon
        Person[] people = new Person[data.length]; // The size of the array doesn't really matter, this array is used to hold all of the different people
        int[] hours = new int[data.length]; // This array will hold the number of hours for each person
        int count = 0; // This will be used to keep track of the index of the people array

        for (String line : data) {
            boolean isFound = false; // Flag to check is found

            // Breaks apart the current line and assigns each part to a variable
            String[] parts = line.split(" ");
            String title = parts[0];
            String firstName = parts[1];
            String lastName = parts[2];
            String course = parts[3];
            int courseHours = Integer.parseInt(parts[4]);

            // Initializes the person before assiging its role, first name, last name, and
            // hours worked
            Person p;
            // Condition statement to assigning the role of the person
//            if (title.equals("Professor")) {
//                p = new Professor(firstName, lastName);
//            } else if (title.equals("TA")) {
//                p = new TA(firstName, lastName);
//            } else {
//                p = new Student(firstName, lastName, course, 0);
//            }



            // Tuan
            if (title.equalsIgnoreCase("Student")) {
                for (int i = 0; i < countStudent; i++) {
                    if(students[i] != null && students[i].getFirstName().equalsIgnoreCase(firstName) && students[i].getLastName().equalsIgnoreCase(lastName)) {
                        students[i].setTotalHours(students[i].getTotalHours() + students[i].getParticipatingHours(courseHours));
                        isFound = true;
                    }
                }
                if (!isFound) {
                    Person student = new Student(firstName, lastName, title, 0);
                    students[countStudent] = student;
                    students[countStudent].setTotalHours(students[countStudent].getParticipatingHours(courseHours));
                    countStudent++;
                }
            }

            // Hoang – Processing data for Professor objects
            if (title.equalsIgnoreCase("professor")) {  // Check if the title is "Professor"
                for (int i = 0; i < countProfessor; i++) {
                    // Check if this professor already exists in the array (based on first and last name)
                    if (professors[i] != null
                            && professors[i].getFirstName().equalsIgnoreCase(firstName)
                            && professors[i].getLastName().equalsIgnoreCase(lastName)) {
                        // If is found then add current course hours to the professor's total hours
                        professors[i].setTotalHours(professors[i].getTotalHours() + professors[i].getParticipatingHours(courseHours));
                        isFound = true; // Mark that the professor is found
                    }
                }
                // If professor was not found in the array
                if (!isFound) {
                    // Create a new Professor object with the given name and initial hours = 0
                    Person newProf = new Professor(firstName, lastName, title, 0);
                    professors[countProfessor] = newProf;
                    // Set the total hours to the course hours of the current line
                    professors[countProfessor].setTotalHours(professors[countProfessor].getParticipatingHours(courseHours));
                    // Increase the count of professors
                    countProfessor++;
                }
            }
        }


        // Tuan
        for (int i = 0; i < countStudent; i++) {
            System.out.println(students[i].getTitle() + " " + students[i].getFirstName() + " " + students[i].getLastName() + " " + students[i].getTotalHours());
        }

        // Hoang
        System.out.println("-----------------------------------------");
        // Print the total hours
        for (int i = 0; i < countProfessor; i++) {
            System.out.println(professors[i].getTitle() + " " + professors[i].getFirstName() + " " + professors[i].getLastName() + " " + professors[i].getTotalHours());
        }
       

    }
}