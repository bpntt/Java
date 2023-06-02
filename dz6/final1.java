package dz6;

import java.util.*;

import dz6.final2.Notebook;

public class final1 {
    public static void main(String[] args) {
        ArrayList<Notebook> Notebooks = getNotebookList();
        HashMap<Integer, String> sortingValues = getSortingMap();
        HashMap<String, ArrayList<String>> allStr = getStringChoices(sortingValues, Notebooks);
        Scanner sc = new Scanner(System.in);

        int firstChoice = filterFirst(sortingValues, sc);

        int secondChoice = filterSecond(sortingValues, Notebooks, allStr, sc, firstChoice);

        filterFinal(firstChoice, secondChoice, allStr, Notebooks);

        sc.close();
    }

    public static void filterFinal(int first, int second, HashMap<String, ArrayList<String>> strMap,
            ArrayList<Notebook> all) {
        ArrayList<Notebook> matching = new ArrayList<>();

        switch (first) {
            case 1:
                for (Notebook el : all)
                    if (el.amountRAM >= second)
                        matching.add(el);
                break;

            case 2:
                for (Notebook el : all)
                    if (el.ssd >= second)
                        matching.add(el);
                break;

            case 3:
                if (strMap.get("Операционная система").size() <= second - 1 || second < 1) {
                    System.out.println("Такого выбора нет!");
                    break;
                }

                for (Notebook el : all)
                    if (strMap.get("Операционная система").get(second - 1).equals(el.os))
                        matching.add(el);
                break;

            case 4:
                if (strMap.get("Цвет").size() <= second - 1 || second < 1) {
                    System.out.println("Такого выбора нет!");
                    break;
                }

                for (Notebook el : all)
                    if (strMap.get("Цвет").get(second - 1).equals(el.col))
                        matching.add(el);
                break;

            default:
                break;
        }

        if (matching.size() < 1)
            System.out.println("Нет подходящих вариантов(");
        else {
            System.out.println("\n---- Все подходящие варианты ----\n");
            for (Notebook el : matching)
                el.getInfo();
            System.out.println("\n---------------------------------\n");
        }
    }

    public static int filterSecond(HashMap<Integer, String> hm, ArrayList<Notebook> all,
            HashMap<String, ArrayList<String>> strMap, Scanner sc, int firstChoice) {
        int choice = -1;

        if (firstChoice > 0 && firstChoice < 3) {
            System.out.println("Напишите минимально подходящее кол-во памяти (" + hm.get(firstChoice) + ").");
            System.out.print("Кол-во памяти (ГБ): ");

            choice = sc.nextInt();
            sc.nextLine();
        }

        else if (firstChoice > 2 && firstChoice < 5) {
            ArrayList<String> strChoices = strMap.get(hm.get(firstChoice));
            System.out.println("Выберите один из подходящих вариантов (" + hm.get(firstChoice) + "):");

            for (int i = 0; i < strChoices.size(); i++) {
                System.out.println((i + 1) + ". " + strChoices.get(i));
            }

            System.out.print("\nВаш выбор: ");
            choice = sc.nextInt();
            sc.nextLine();
        }

        else {
            System.out.println("Такого выбора нет!");
        }

        return choice;
    }

    public static HashMap<String, ArrayList<String>> getStringChoices(HashMap<Integer, String> hm,
            ArrayList<Notebook> all) {
        HashMap<String, ArrayList<String>> strMap = new HashMap<>();

        HashSet<String> oses = new HashSet<>();
        HashSet<String> colors = new HashSet<>();
        ArrayList<String> osList = new ArrayList<>();
        ArrayList<String> colorList = new ArrayList<>();

        for (Notebook el : all) {
            oses.add(el.os);
            colors.add(el.col);
        }

        osList.addAll(oses);
        colorList.addAll(colors);

        strMap.put(hm.get(3), osList);
        strMap.put(hm.get(4), colorList);

        return strMap;
    }

    public static int filterFirst(HashMap<Integer, String> hm, Scanner sc) {
        System.out.println("Выберите цифру, соответствующую необходимому критерию:");

        for (var el : hm.entrySet())
            System.out.println(el.getKey() + ". " + el.getValue());

        System.out.print("\nВаш выбор: ");
        int choice = sc.nextInt();
        sc.nextLine();

        return choice;
    }

    public static HashMap<Integer, String> getSortingMap() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "ОЗУ");
        hm.put(2, "Объем ЖД");
        hm.put(3, "Операционная система");
        hm.put(4, "Цвет");

        return hm;
    }

    public static ArrayList<Notebook> getNotebookList() {
        ArrayList<Notebook> all = new ArrayList<>();
        Notebook l1 = new Notebook("NA", "Red", 16, 256, "W11");
        Notebook l2 = new Notebook("ND", "Blue", 8, 128, "Mac");
        Notebook l3 = new Notebook("NS", "Black", 2, 32, "W10");
        Notebook l4 = new Notebook("NR", "Gray", 16, 512, "W11");
        Notebook l5 = new Notebook("NT", "Black", 16, 1000, "Linux");
        all.add(l1);
        all.add(l2);
        all.add(l3);
        all.add(l4);
        all.add(l5);

        return all;
    }
}
