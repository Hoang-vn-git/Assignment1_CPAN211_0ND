public abstract class Person implements ParticipateHours {
    private String firstName;
    private String lastName;
    private String title;
    private int totalHours;

    // Constructor
    public Person(String firstName, String lastName, String title, int totalHours) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.totalHours = totalHours;
    }

    // Getter & Setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

}