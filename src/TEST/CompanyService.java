package TEST;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public interface CompanyService {
    public void saveWorker(CompanyDTO dto); //특정 사원 등록 메소드
    public void modify(CompanyDTO dto); //특정 사원의 직급,기본급,수당 수정 메소드
    public CompanyDTO search(String name); //특정 사원 검색. 이름 값 으로 해당 값을 가진 직원 찾기은 결과 값을 main에서 출력한다.
    public void output(); //모든 사원 출력
}
class CompanyServiceImpl implements CompanyService{
///    public static HashMap map = new HashMap();
    public static ArrayList<CompanyDTO> arr = new ArrayList<CompanyDTO>();
    @Override
    public void saveWorker(CompanyDTO dto) {
        boolean bool = false;
        for (int i = 0; i < arr.size(); i++) {
            if (dto.getName().equals(arr.get(i).getName())) {
                System.out.println("동일한 이름이 존재합니다");
                bool = true;
                break;
            }
        }
        if(bool==false){
            System.out.println("직급 입력");
            Scanner input = new Scanner(System.in);
            String grade = input.next();
            dto.setGrade(grade);
            arr.add(dto);
            System.out.println("등록 완료");
        }
        System.out.println("------------");
    }
    @Override
    public void modify(CompanyDTO dto) {
        boolean bool = false;
        for (int i = 0; i < arr.size(); i++) {
            if (dto.getName().equals(arr.get(i).getName())) {
                System.out.println("직급 입력");
                Scanner input = new Scanner(System.in);
                String grade = input.next();
                dto.setGrade(grade);
                arr.remove(i);
                arr.add(dto);
                System.out.println("수정 완료");
                bool = true;
                break;
            }
        }
        if(bool==false)
            System.out.println("해당 사원은 존재하지 않습니다");
        System.out.println("------------");
    }
    @Override
    public void output() {
        System.out.println("------------");
        for(int i=0;i<arr.size(); i++) {
            System.out.println(arr.get(i).getName());
            System.out.println(arr.get(i).getGrade());
            System.out.println(arr.get(i).getSalary());
            System.out.println(arr.get(i).getTariff());
            System.out.println("------------");
        }
    }

    @Override
    public CompanyDTO search(String name) {
        boolean bool = false;
            for (int i=0; i < arr.size(); i++) {
                if (Objects.equals(arr.get(i).getName(), name)) {
                    System.out.println(arr.get(i).getName());
                    System.out.println(arr.get(i).getGrade());
                    System.out.println(arr.get(i).getSalary());
                    System.out.println(arr.get(i).getTariff());
                    bool = true;
                    break;
                }
            }
            if(bool==false)
                System.out.println("해당 사원은 존재하지 않습니다");
        System.out.println("-------------");
        return null;
    }
}
