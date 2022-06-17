package TEST;

import java.util.Objects;

public class CompanyDTO {
///    public static ArrayList<CompanyDTO> arr = new ArrayList<CompanyDTO>();
 ///   private Scanner input = new Scanner(System.in);
    private String name, grade;

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

    public int getSalery() {
        int salery;
        if (Objects.equals(this.grade, "책임"))
            salery = 600;
        else if (Objects.equals(this.grade, "선임"))
            salery = 400;
        else
            salery = 300;
        return salery;
    }


    public double getTariff() {
        double tariff;
        if (Objects.equals(this.grade, "책임"))
            tariff = 0.03;
        else if (Objects.equals(this.grade, "선임"))
            tariff = 0.02;
        else
            tariff = 0.01;
        return tariff;
    }
}