import java.util.Calendar;
import java.util.Objects;

public class Person {
    private String ID = "";
    private String firstName = "";
    private String lastName = "";
    private String title = "";
    private int YOB = 0;

    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFullName() {
        String fullName = this.getFirstName() + " " + this.getLastName();
        return fullName;
    }

    public String getFormalName() {
        String formalName = this.getTitle() + " " + this.getFirstName() + " " + this.getLastName();
        return formalName;
    }

    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return (currentYear - this.getYOB());
    }

    public int getAge(int year) {
        return (year - this.getYOB());
    }

    public String toCSV() {
        return escapeCSV(ID) + ", " + escapeCSV(firstName) + ", " + escapeCSV(lastName) + ", " + escapeCSV(title) + ", " + YOB;
    }

    String escapeCSV(String value) {
        return value.contains(",") ? "\"" + value + "\"" : value;
    }

    public String toJSON() {
        return "{\"ID\":\"" + escapeJSON(ID) + "\","
                + "\"firstName\":\"" + escapeJSON(firstName) + "\","
                + "\"lastName\":\"" + escapeJSON(lastName) + "\","
                + "\"title\":\"" + escapeJSON(title) + "\","
                + "\"YOB\":" + YOB + "}";
    }

    String escapeJSON(String value) {
        return value.replace("\"", "\\\"").replace("\\", "\\\\");
    }

    public String toXML() {
        return "<person>"
                + "<ID>" + escapeXML(ID) + "</ID>"
                + "<firstName>" + escapeXML(firstName) + "</firstName>"
                + "<lastName>" + escapeXML(lastName) + "</lastName>"
                + "<title>" + escapeXML(title) + "</title>"
                + "<YOB>" + YOB + "</YOB>"
                + "</person>";
    }

    String escapeXML(String value) {
        return value
                .replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&apos;");
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

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return YOB == person.YOB && Objects.equals(ID, person.ID) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(title, person.title);
    }

    @Override
    public String toString() {
        return "Person{" +
                "YOB=" + YOB +
                ", title='" + title + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, firstName, lastName, title, YOB);
    }
}
