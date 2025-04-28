public class Worker extends Person {
    private double hourlyPayRate = 0;

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public Worker(double hourlyPayRate) {
        super("", "", "", "", 0);
        this.hourlyPayRate = hourlyPayRate;
    }



    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked > 40) {
            return (((hoursWorked-40) * 1.5) + 40) * hourlyPayRate;
        } else {
            return hoursWorked * hourlyPayRate;
        }
    }


    public String displayWeeklyPay(int hoursWorked) {
        double weeklyPay;
        String weeklyPayString;
        if (hoursWorked > 40) {
            weeklyPay = (((hoursWorked-40) * 1.5) + 40) * hourlyPayRate;
        } else {
            weeklyPay = hoursWorked * hourlyPayRate;
        }
        weeklyPayString = String.format("%.2f%n", weeklyPay);
        return weeklyPayString;
    }

    @Override
    public String toCSV() {
        return escapeCSV(getID()) + ", " + escapeCSV(getFirstName()) + ", " + escapeCSV(getLastName()) + ", " + escapeCSV(getTitle()) + ", " + getYOB() + ", " + hourlyPayRate;
    }

    @Override
    public String toJSON() {
        return "{\"ID\":\"" + escapeJSON(getID()) + "\","
                + "\"firstName\":\"" + escapeJSON(getFirstName()) + "\","
                + "\"lastName\":\"" + escapeJSON(getLastName()) + "\","
                + "\"title\":\"" + escapeJSON(getTitle()) + "\","
                + "\"YOB\":" + getYOB() + "\","
                + "\"hourlyPayRate\":" + getHourlyPayRate() + "}";
    }

    @Override
    public String toXML() {
        return "<worker>"
                + "<ID>" + escapeXML(getID()) + "</ID>"
                + "<firstName>" + escapeXML(getFirstName()) + "</firstName>"
                + "<lastName>" + escapeXML(getFirstName()) + "</lastName>"
                + "<title>" + escapeXML(getTitle()) + "</title>"
                + "<YOB>" + getYOB() + "</YOB>"
                + "<hourlyPayRate>" + getHourlyPayRate() + "</hourlyPayRate>"
                + "</worker>";
    }
}
