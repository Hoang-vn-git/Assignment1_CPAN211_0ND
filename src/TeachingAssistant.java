class TA extends Person {
    public TA(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public int getParticipatingHours(int courseHours) {
        return (courseHours > 4) ? 2 : 1;
    }

    public String getTitle() {
        return "TA";
    }

    public Person clone() {
        return new TA(firstName, lastName);
    }
}