package streams;

public class Informational {
    public static void main(String[] args) throws Exception {
        System.out.println(
                FileToWords.stream("Cheese.dat").count()
        );
        System.out.println(
                FileToWords.stream("Cheese.dat").max(String.CASE_INSENSITIVE_ORDER).orElse("None")
        );
        System.out.println(
                FileToWords.stream("Cheese.dat").min(String.CASE_INSENSITIVE_ORDER).orElse("None")
        );
    }
}
