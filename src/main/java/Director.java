public class Director {
    private String firstName;
    private String lastName;

    public Director(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Director() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
