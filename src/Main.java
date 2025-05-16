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

        
        Person[] people = new Person[data.length]; // The size of the array doesn't really matter, this array is used to hold all of the different peopl
        int[] hours = new int[data.length]; // This array will hold the number of hours for each person
        int count = 0; // This will be used to keep track of the index of the people array


        for (String line : data) {

            String[] parts = line.split(" ");
            String role = parts[0];
            String firstName = parts[1];
            String lastName = parts[2];
            String course = parts[3];

        }
        
    }
}