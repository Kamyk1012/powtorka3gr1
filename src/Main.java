//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        uczen uczen=new uczen("Edek","Mela");
        System.out.println("liczba uczniow"+uczen.getLiczbaUczniow());
        System.out.println(uczen);
        uczen uczen1=new uczen("ela","fala");
        System.out.println("liczba uczniow"+uczen.getLiczbaUczniow());
        System.out.println(uczen1);
        uczen uczen4=new uczen("Edek","Mela");
        System.out.println("liczba uczniow"+uczen.getLiczbaUczniow());
        System.out.println(uczen4);

        }
    }
