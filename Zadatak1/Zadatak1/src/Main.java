import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);       //kreiranje skenera

        boolean valid = true;               //pomocna varijabla za izvršavanje do while petlje dok se ne unese 'stop'

        Map<String, String> treeMap = new TreeMap<>();      //kreiranje TreeMap koja automatski uklanja duplikate

            System.out.println("Enter your favorite books and authors. Enter 'stop' to finish.");

            //do while petlja za unos podataka od strane korisnika
        do{
            System.out.println("Book title: ");
            String bookTitle = scanner.nextLine();

            if (Objects.equals(bookTitle, "stop")){     //prekid petlje u slučaju unosa 'stop'
                break;
            }

            System.out.println("Author name: ");
            String authorName = scanner.nextLine();

            if (Objects.equals(authorName, "stop")){    //prekid petlje u slučaju unosa 'stop'
                break;
            }

            treeMap.put(bookTitle, authorName);         //unos podataka 'knjiga - autor' u mapu

        }while(valid);


            //ispis automatski sortirane mape
            for (String book : treeMap.keySet()){
                String author = treeMap.get(book);
                System.out.println(book + " by " + author);
            }

    }
}
