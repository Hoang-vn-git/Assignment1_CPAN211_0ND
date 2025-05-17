class Professor extends Person {

    // Constructor
    public Professor(String firstName, String lastName, String title, int totalHours) {
        super(firstName, lastName, title, totalHours);
    }

    // Handle calculates hour
    public int getParticipatingHours(int courseHours) {
        int lab = (courseHours > 4) ? 2 : 1;
        return courseHours - lab;
    }
}