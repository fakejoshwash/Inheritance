public class SalaryWorker extends Worker{
    private double annualSalary = 0;

    public double getAnnualSalary() {
        return annualSalary;
    }
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    public SalaryWorker(double annualSalary) {
        super(0);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return (annualSalary / 52);
    }

    public String displayWeeklyPay(double placeholder) {
        double weeklyPay = calculateWeeklyPay(getAnnualSalary());
        String weeklyPayString = String.format("%.2f%n", weeklyPay);
        return weeklyPayString;
    }
    @Override
    public String toCSV() {
        return escapeCSV(getID()) + ", " + escapeCSV(getFirstName()) + ", " + escapeCSV(getLastName()) + ", " + escapeCSV(getTitle()) + ", " + getYOB() + ", " + getHourlyPayRate() + ", " + annualSalary;
    }
    @Override
    public String toJSON() {
        return "{\"ID\":\"" + escapeJSON(getID()) + "\","
                + "\"firstName\":\"" + escapeJSON(getFirstName()) + "\","
                + "\"lastName\":\"" + escapeJSON(getLastName()) + "\","
                + "\"title\":\"" + escapeJSON(getTitle()) + "\","
                + "\"YOB\":" + getYOB() + "\","
                + "\"hourlyPayRate\":" + getHourlyPayRate() + "\""
                + ", \"annualSalary\":" + annualSalary + "}";
    }
    @Override
    public String toXML() {
        return "<salaryWorker>"
                + "<ID>" + escapeXML(getID()) + "</ID>"
                + "<firstName>" + escapeXML(getFirstName()) + "</firstName>"
                + "<lastName>" + escapeXML(getFirstName()) + "</lastName>"
                + "<title>" + escapeXML(getTitle()) + "</title>"
                + "<YOB>" + getYOB() + "</YOB>"
                + "<hourlyPayRate>" + getHourlyPayRate() + "</hourlyPayRate>"
                + "<annualSalary>" + annualSalary + "</annualSalary>"
                + "</salaryWorker>";
    }
}
