public class Student extends Person {

    public Student(String firstName, String lastName, String title, int totalHours) {
        super(firstName, lastName, title, totalHours);
    }
    @Override
    public  int getParticipatingHours(int courseHours) {
        return courseHours;
    }
}
