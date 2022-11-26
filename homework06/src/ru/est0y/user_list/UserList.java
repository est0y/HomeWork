package  ru.est0y.user_list;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class UserList<T> {
    private final ArrayList<T> list;
    UserList(Collection<T> collection){
        this.list=new ArrayList<>(collection);
    }
    public void shuffle(){
        Collections.shuffle(this.list);
    }
    public ArrayList<T> getRandomElements(int elementsCount){
        if(elementsCount>list.size()){
            throw new IllegalArgumentException("Недостаточно элементов в списке");
        }
        ArrayList<T> list=new ArrayList<>(this.list);
        Collections.shuffle(list);
        ArrayList<T> elements=new ArrayList<>();
        for (int i=0;i<elementsCount;i++){
            elements.add(list.get(i));
        }
        return elements;
    }
    public void saveToFile(String fileName) throws  ImpossibleSaveFileException {
        try(FileWriter fw = new FileWriter(fileName)) {
            for(T t : this.list) {
                fw.write(t +"\n");
            }
        }
        catch (IOException e){
            throw new ImpossibleSaveFileException(e);
        }
    }
    @Override
    public  String  toString() {
        String string= "";
        int i=1;
        for (T element:list){
            string+=i+")"+element+"\n";
            i++;
        }
        return string;
    }
}
