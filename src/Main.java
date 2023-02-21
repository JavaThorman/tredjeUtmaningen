import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Namn lista: " + "De sju dvärgarna" + "");
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
        // LOOP:

        //initiera en False boolean för input of choice.


        // Gör en loop för att print ut en fin lista! Den kommer att återanvändas under kodens gång!
        for (int i = 0; i < list.size(); i++) {
            System.out.print("|-----------");
            System.out.print(list.get(i));
            System.out.print("-----------|\n");
        }
        // Fråga om alternativ med CRUD! create, replace, update or delete.
        System.out.println("Redigera namnlistan? Y / N\n");
        input = new Scanner(System.in);
        // Skapa en string som kollar för värdet y / n, else.
        String inputSvar = input.nextLine();
        // Skapa en loop med olika alternativ för svar.

        if (inputSvar.equalsIgnoreCase("y")) {
            System.out.println("1. Lägg till ett namn i listan");
            System.out.println("2. Ändra ett befintligt namn i listan");
            System.out.println("4 Radera ett namn i listan");
            System.out.println("5. Visa namnen i listan");
            input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                // Lägga till ett namn i listan (CREATE)
                case 1:
                    System.out.println("du valde att lägga till ett namn i listan\n Skriv in namnet du vill lägga till: ");
                    input = new Scanner(System.in);
                    String nameAdded = input.nextLine();
                    list.add(nameAdded);
                    for (int i = 0; i < list.size(); i++) {
                        System.out.print("|-----------");
                        System.out.print(list.get(i));
                        System.out.print("-----------|\n");
                    }
                    break;
                // Ändra ett befintligt namn i listan (REPLACE)
                case 2:

                    System.out.println("du valde att ändra ett befintligt namn i listan\n\n Skriv in namnet du vill ändra: \n");
                    input = new Scanner(System.in);
                    for (int i = 0; i < list.size(); i++) {
                        System.out.print("|-----------");
                        System.out.print(list.get(i));
                        System.out.print("-----------|\n");
                    }
                    String nameWantToChange = input.nextLine();
                    // Case sensitive!
                    System.out.println("Skriv in vad du vill ändra namnet till: ");
                    input = new Scanner(System.in);
                    String nameChangedTo = input.nextLine();
                    list.add(nameChangedTo);
                    list.remove(nameWantToChange);
                    break;
                case 3:
                    System.out.println("du valde att radera ett namn i listan\n\n Skriv in namnet du vill radera: \n");
                    input = new Scanner(System.in);
                    for (int i = 0; i < list.size(); i++) {
                        System.out.print("|-----------");
                        System.out.print(list.get(i));
                        System.out.print("-----------|\n");
                    }
                    String nameWantToDelete = input.nextLine();
                    list.remove(nameWantToDelete);
                    break;

                case 4:
                    int i == list.size();

                    while (i >= 1) {
                        System.out.print("|-----------");
                        System.out.print(list.get(i));
                        System.out.print("-----------|\n");
                        i--;
                    } else {
                        System.out.println("Du har ingen namn i listan");

                }

                    break;
            }

        }

    }

}

