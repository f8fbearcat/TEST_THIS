package TEST;

public class CompanyDTO {
    private String name, grade;
    private int salary;
    private double tariff;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getGrade() {
        return grade;
    }

    void setGrade(String grade) {
        this.grade = grade;
    }

    int getSalary() {
        return salary;
    }
    void setSalary() {
        if (this.grade == "책임")
            this.salary = 600;
        else if (this.grade == "선임")
            this.salary = 400;
        else
            this.salary = 300;
    }

    double getTariff() {
        return tariff;
    }
    void setTariff() {
        if (this.grade == "책임")
            this.tariff = 0.03;
        else if (this.grade == "선임")
            this.tariff = 0.02;
        else
            this.tariff = 0.01;
    }
}