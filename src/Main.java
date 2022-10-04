import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        

                Scanner scanner = new Scanner(System.in);
                ArrayList<String> names_A = new ArrayList<>();
                ArrayList<String> names_B = new ArrayList<>();
                ArrayList<String> list_C = new ArrayList<>();
                int length, increment, decrement;


                System.out.println("Введите имена для списка А.");
                for (int i = 0; i < 5; i++) {
                    names_A.add(scanner.next());
                }

                System.out.println("Список А(Только мужские имена): " + names_A);
                System.out.println("\nВведите имена для списка B.");
                for (int i = 0; i < 5; i++) {
                    names_B.add(scanner.next());
                }

                System.out.println("Список B(Только женские имена): " + names_B);
                increment = 0;
                decrement = names_B.size();
                length = names_A.size() + names_B.size();

                for (int i = 0; i < length; i++) {
                    if (i % 2 == 0) {
                        list_C.add(names_A.get(increment));
                        increment++;
                    } else {
                        list_C.add(names_B.get(decrement - 1));
                        decrement--;
                    }
                }
                System.out.println("\nСписок C: " + list_C + "\n");

                boolean isSorted = false;

                while (!isSorted) {
                    isSorted = true;
                    for (int i = 1; i < list_C.size(); i++) {
                        if (list_C.get(i).length() < list_C.get(i - 1).length()) {
                            String temp = list_C.get(i - 1);
                            list_C.set(i - 1, list_C.get(i));
                            list_C.set(i, temp);
                            isSorted = false;
                        }
                    }
                }
                System.out.println(list_C);


            }
}