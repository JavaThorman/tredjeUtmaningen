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
        System.out.println("3. Radera ett namn i listan");
        System.out.println("4. Visa namnen i listan");
        System.out.println("5. Avsluta program.");
        // Meny avslut

        // Börja loop!
        boolean finished = false; // Initiera en boolean som håller koll på om användaren vill avlsuta loopen.

        while (!finished) {
            int choice = input.nextInt();
            if (choice > 5 || choice < 1) { // kolla om svaret är felaktigt
                System.out.println("Mata in ett val, 1-5:");
            }


            switch (choice) {

                // Lägg till ett namn i listan (CREATE)
                case 1:
                    System.out.println("du valde att lägga till ett namn i listan\n Skriv in namnet du vill lägga till: ");
                    input = new Scanner(System.in);
                    String nameAdded = input.nextLine();
                    list.add(nameAdded); // lägg till det nya namnet

                    // Visa meny:
                    int antalNamn2 = list.size(); // Uppdatera antal namn som finns i listan.
                    System.out.println("Namn lista: " + "De " + antalNamn2 + " dvärgarna" + "");
                    for (int i = 0; i < list.size(); i++) {

                        System.out.print("|-----------");
                        System.out.print(list.get(i));
                        System.out.print("-----------|\n");
                    }
                    System.out.println("1. Lägg till ett namn i listan");
                    System.out.println("2. Ändra ett befintligt namn i listan");
                    System.out.println("3. Radera ett namn i listan");
                    System.out.println("4. Visa namnen i listan");
                    System.out.println("5. Avsluta program.");

                    break;

                // Ändra ett befintligt namn i listan (UPDATE)
                case 2:
                    System.out.println("du valde att ändra ett befintligt namn i listan\n Skriv in namnet du vill ändra: ");
                    input = new Scanner(System.in);
                    String nameUpdated = input.nextLine();
                    boolean foundNameUpdate = false; // kontrollera om namnet finns med i listan.
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).equals(nameUpdated)) { // Kontrolla om ett namn matchar.
                            foundNameUpdate = true;
                            System.out.println("Vad vill du ändra namnet: " + list.get(i) + " till?");
                            String newName = input.nextLine();
                            list.remove(list.get(i)); // Radera namnet
                            list.add(newName); // Lägg till namnet
                            int antalNamn3 = list.size(); // Uppdatera antal namn

                            System.out.println("" + list.get(i) + " har nu ändrats till: " + newName);
                            System.out.println("Namn lista: " + "De " + antalNamn3 + " dvärgarna" + "");
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
                    System.out.println("3. Radera ett namn i listan");
                    System.out.println("4. Visa namnen i listan");
                    System.out.println("5. Avsluta program.");
                    break;


                // Radera ett namn i listan (DELETE)
                case 3:
                    System.out.println("Du valde att radera ett namn i listan:\nSkriv in namnet du vill radera: ");
                    input = new Scanner(System.in);
                    String nameDeleted = input.nextLine();

                    boolean foundNameDelete = false; // kontrollera om namnet finns med i listan.
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).equals(nameDeleted)) { // Kontrolla om ett namn matchar.
                            foundNameDelete = true;
                            list.remove(i); // Radera namnet
                            System.out.println("" + nameDeleted + " har tagits bort från listan!");
                            int antalNamn4 = list.size(); // Uppdatera antal namn3
                            System.out.println("Namn lista: " + "De " + antalNamn4 + " dvärgarna" + "");

                        }
                    }
                    if (!foundNameDelete) { // om namnet inte finns med i listan, skriv ut:
                        System.out.println("Namnet finns inte i listan");
                    }


                    // Visa meny igen för loopen.
                    for (int i = 0; i < list.size(); i++) {

                        System.out.print("|-----------");
                        System.out.print(list.get(i));
                        System.out.print("-----------|\n");
                    }
                    System.out.println("1. Lägg till ett namn i listan");
                    System.out.println("2. Ändra ett befintligt namn i listan");
                    System.out.println("3. Radera ett namn i listan");
                    System.out.println("4. Visa namnen i listan");
                    System.out.println("5. Avsluta program.");
                    break;


                // Visa listan (REPEAT)
                case 4:
                    // Printa ut menyn, med alternativ
                    int antalNamn3 = list.size(); // Uppdatera antal namn


                    System.out.println("Namn lista: " + "De " + antalNamn + " dvärgarna" + "");
                    for (int i = 0; i < list.size(); i++) {

                        System.out.print("|-----------");
                        System.out.print(list.get(i));
                        System.out.print("-----------|\n");
                    }
                    System.out.println("1. Lägg till ett namn i listan");
                    System.out.println("2. Ändra ett befintligt namn i listan");
                    System.out.println("3. Radera ett namn i listan");
                    System.out.println("4. Visa namnen i listan");
                    System.out.println("5. Avsluta program.");
                    break;

                case 5:
                    finished = true; // finished, som vi satt i loopen ändrar vi till true, för att avsluta loopen.
                    System.out.println("---------------------------");
                    System.out.println("Programmet har nu avslutats");
                    System.out.println("---------------------------");
                    break;


            }

        }
    }
}











