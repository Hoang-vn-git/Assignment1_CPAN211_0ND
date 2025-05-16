class Professor extends Person {
    public Professor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public int getParticipatingHours(int courseHours) {
        int lab = (courseHours > 4) ? 2 : 1;
        return courseHours - lab;
    }

    public String getTitle() {
        return "Professor";
    }

    
}