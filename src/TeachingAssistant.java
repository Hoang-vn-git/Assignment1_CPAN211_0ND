class TeachingAssistant extends Person {

    public TeachingAssistant(String firstName, String lastName, String title, int totalHours) {
        super(firstName, lastName, title, totalHours);
    }



    // Method which returns the number of hours the TA is working
    public int getParticipatingHours(int courseHours) {
        return courseHours > 4 ? 2 : 1;
    }

    // Getter Method which returns the title
    public String getTitle() {
        return "TA";
    }

    
}