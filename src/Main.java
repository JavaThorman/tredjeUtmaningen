import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        // }
        Scanner input = new Scanner(System.in);

//   Pseudokod
        // Skapa en ArrayList för att hålla koll på namnen på de sju dvärgarna
        ArrayList<String> list = new ArrayList<String>();
        list.add("Glader");
        list.add("Toker");
        list.add("Butter");
        list.add("Blyger");
        list.add("Trötter");
        list.add("Kloker");
        list.add("Prosit");

        int antalNamn = list.size();


        // Meny
        System.out.println("Namn lista: " + "De " + antalNamn + " dvärgarna" + "");
        for (int i = 0; i < list.size(); i++) {

            System.out.print("|-----------");
            System.out.print(list.get(i));
            System.out.print("-----------|\n");
        }
        System.out.println("1. Lägg till ett namn i listan");
        System.out.println("2. Ändra ett befintligt namn i listan");
        System.out.println("4 Radera ett namn i listan");
        System.out.println("5. Visa namnen i listan");
        System.out.println("6. Avsluta program.");
        // Meny avslut

        // Börja loop!
        boolean finished = false; // Initiera en boolean som håller koll på om användaren vill avlsuta loopen.

        while (!finished) {


            int choice = input.nextInt();
            switch (choice) {


                // Lägg till ett namn i listan (CREATE)
                case 1:
                    System.out.println("du valde att lägga till ett namn i listan\n Skriv in namnet du vill lägga till: ");
                    input = new Scanner(System.in);
                    String nameAdded = input.nextLine();
                    list.add(nameAdded);

                    // Visa meny:
                    System.out.println("Namn lista: " + "De " + antalNamn + " dvärgarna" + "");
                    for (int i = 0; i < list.size(); i++) {

                        System.out.print("|-----------");
                        System.out.print(list.get(i));
                        System.out.print("-----------|\n");
                    }
                    System.out.println("1. Lägg till ett namn i listan");
                    System.out.println("2. Ändra ett befintligt namn i listan");
                    System.out.println("4 Radera ett namn i listan");
                    System.out.println("5. Visa namnen i listan");
                    System.out.println("6. Avsluta program.");

                    break;

                // Ändra ett befintligt namn i listan (UPDATE)
                case 2:
                    System.out.println("du valde att ändra ett befintligt namn i listan\n Skriv in namnet du vill ändra: ");
                    input = new Scanner(System.in);
                    String nameUpdated = input.nextLine();
                    boolean foundName = false; // kontrollera om namnet finns med i listan.
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).equals(nameUpdated)) { // Kontrolla om ett namn matchar.
                            foundName = true;
                            System.out.println("Vad vill du ändra namnet: " + list.get(i) + " till?");
                            String newName = input.nextLine();
                            list.add(newName);
                            System.out.println("" + newName + " har lagts till i listan!");
                            System.out.println("Namn lista: " + "De " + antalNamn + " dvärgarna" + "");
                        }
                    }

                    // Visa meny igen för loopen.
                    for (int i = 0; i < list.size(); i++) {

                        System.out.print("|-----------");
                        System.out.print(list.get(i));
                        System.out.print("-----------|\n");
                    }
                    System.out.println("1. Lägg till ett namn i listan");
                    System.out.println("2. Ändra ett befintligt namn i listan");
                    System.out.println("4 Radera ett namn i listan");
                    System.out.println("5. Visa namnen i listan");
                    System.out.println("6. Avsluta program.");
                    break;


                    // Radera ett namn i listan (DELETE)
                case 4:
                    System.out.println("du valde att radera ett namn i listan\n Skriv in namnet du vill radera: ");
                    input = new Scanner(System.in);
                    String nameDeleted = input.nextLine();

            }
        }
    }
}












