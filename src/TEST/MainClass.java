package TEST;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        CompanyDTO dto = new CompanyDTO();
        String name;
        CompanyService sc = new CompanyServiceImpl();
        Scanner input = new Scanner(System.in);
        while (true) {
            int num;
            System.out.println("1.특정 사원 등록");
            System.out.println("2.모든 사원 출력");
            System.out.println("3.특정 사원 수정");
            System.out.println("4.특정 사원 검색");
            System.out.println("5.종료");
            num = input.nextInt();
            switch (num) {
                case 1:
                    System.out.println("------------");
                    System.out.println("사원 이름 입력");
                    name = input.next();
                    dto.setName(name);
                    sc.saveWorker(dto);
                    break;
                case 2:
                    sc.output();
                    break;
                case 3:
                    System.out.println("------------");
                    System.out.println("사원 이름 입력");
                    name = input.next();
                    dto.setName(name);
                    sc.modify(dto);
                    break;
                case 4:
                    System.out.println("------------");
                    System.out.println("사원 이름 입력");
                    name = input.next();
                    sc.search(name);
                    break;
                case 5:
                    return;
            }
        }
    }
}