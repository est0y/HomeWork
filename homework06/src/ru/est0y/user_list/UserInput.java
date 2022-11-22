package  ru.est0y.user_list;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    List<String> getList() {
        System.out.println("Введите поочередно элементы списка(оставте строку пустой для завершения ввода)");
        ArrayList<String> arrayList=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (line == "") {
                break;
            }
            arrayList.add(line);
        }
        return arrayList;
    }
    int getInteger(){
        try{
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }catch (Exception e){
            System.out.println("Введенная строка не является целым числом");
            return getInteger();
        }
    }
    String getLine(){
        return new Scanner(System.in).nextLine();
    }
    String getCommand(){
        System.out.println("Введите команду");
        return getLine();
    }
}
