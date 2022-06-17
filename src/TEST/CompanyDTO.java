package TEST;

public class CompanyDTO {
    private String name, grade;
    private int salary;
    private double tariff;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getSalary() {
        if (this.grade=="책임")
            this.salary = 600;
        else if (this.grade=="선임")
            this.salary = 400;
        else
            this.salary = 300;
        return salary;
    }

    public void setSalary(int salary) {
    }

    public double getTariff() {
        if (this.grade=="책임")
            this.tariff = 600;
        else if (this.grade=="선임")
            this.tariff = 400;
        else
            this.tariff = 300;
        return tariff;
    }
}