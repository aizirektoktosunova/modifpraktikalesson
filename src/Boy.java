public class Boy {
    private String lastName;
    private int yearoFbirth;
    private String gender;

    public Boy() {
    }

    public Boy(String lastName, int yearoFbirth, String gender) {
        this.lastName = lastName;
        this.yearoFbirth = yearoFbirth;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearoFbirth() {
        return yearoFbirth;
    }

    public void setYearoFbirth(int yearoFbirth) {
        this.yearoFbirth = yearoFbirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Boy{" +
                "lastName='" + lastName + '\'' +
                ", yearoFbirth=" + yearoFbirth +
                ", gender='" + gender + '\'' +
                '}';
    }
}
