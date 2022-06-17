package TEST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public interface CompanyService {


    public void saveWorker(CompanyDTO dto); //특정 사원 등록 메소드
    public void modify(CompanyDTO dto); //특정 사원의 직급,기본급,수당 수정 메소드
    public CompanyDTO search(String name); //특정 사원 검색. 이름 값 으로 해당 값을 가진 직원 찾기은 결과 값을 main에서 출력한다.
    //출력
    public void output(); //모든 사원 출력
}
class CompanyServiceImpl implements CompanyService{
    public static HashMap map = new HashMap();
    public static ArrayList<CompanyDTO> arr = new ArrayList<CompanyDTO>();
    @Override
    public void saveWorker(CompanyDTO dto) {
        boolean bool=false;
        int k=0;
        if(map.containsKey(dto.getName())==true)
            System.out.println("동일한 이름이 존1재합니다");
        else {
            System.out.println("직급 입력");
            Scanner input = new Scanner(System.in);
            String grade = input.next();
            dto.setGrade(grade);
            map.put(dto.getName(),dto.getGrade());
            arr.add(dto);
            System.out.println("등록 되었습니다!!!");
        }
//            int k = 0;
//            boolean bool = true;
//            while (bool) {
//                for (;k<arr.size();k++) {
//                    if (arr.get(k).getName() == dto.getName()) {
//                        System.out.println("동일한 이름이 존재합니다");
//                        break;
//                    }
//                    if (k == arr.size()) {
//                        bool = false;
//                        break;
//                    }
//                }
//            }


                        }
   ///     }
        ///           System.out.println("이름 입력");
        ///           name = input.next();

//        dto.setName(name);
//        dto.setGrade(grade);
//        dto.setSalery(salary);
//        dto.setTariff(tariff);


    @Override
    public void modify(CompanyDTO dto) {
        boolean bool = true;
        Scanner input = new Scanner(System.in);
        String name = input.next();
        while( bool ) {
            int k=0;
            for( ;k<arr.size(); k++) {
                if(arr.get(k).getName() == name) {
                    System.out.println("수정할 직급 입력");
                    String grade = input.next();
                    CompanyDTO empy = arr.get(k);
                    empy.setName(name); empy.setGrade(grade);
                    arr.remove(k); arr.add(empy);
                    System.out.println("수정되었습니다");
                    bool = false;
                    break;
                }
            }
            if(k == arr.size()){
                System.out.println("해당 사원은 존재하지 않습니다");
            break;}
        }

    }

    @Override
    public void output() {

        System.out.println("------------");
        for(int k=0;k<arr.size(); k++) {
            System.out.println(arr.get(k).getName());
            System.out.println(arr.get(k).getGrade());
            System.out.println(arr.get(k).getSalery());
            System.out.println(arr.get(k).getTariff());
            System.out.println("------------");
        }
    }

    @Override
    public CompanyDTO search(String name) {
        Scanner input = new Scanner(System.in);
        String name1 = input.next();
        boolean bool = true;
        while( bool ) {
            int k = 0;
            for (; k < arr.size(); k++) {
                System.out.println("-------------");
                if (arr.get(k).getName() == name1) {
                    System.out.println(arr.get(k).getName());
                    System.out.println(arr.get(k).getGrade());
                    System.out.println(arr.get(k).getSalery());
                    System.out.println(arr.get(k).getTariff());
                    System.out.println("-------------");
                    bool = false;
                    break;
                }
                if (k == arr.size()) {
                    System.out.println("해당 사원 없음");
                    System.out.println("-------------");
                }
            }
        }
        return null;
    }
}
