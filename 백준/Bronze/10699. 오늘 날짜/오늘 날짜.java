import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDate.now()));
    }
}