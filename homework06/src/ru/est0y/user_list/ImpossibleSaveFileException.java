package  ru.est0y.user_list;
public class ImpossibleSaveFileException extends Exception{
    private final Throwable cause;
    public ImpossibleSaveFileException(Throwable cause) {
        this.cause=cause;
    }
}
