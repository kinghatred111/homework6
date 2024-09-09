import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class NotebookStore {
    private List<Notebook> notebooks;

    public NotebookStore() {
        notebooks = new ArrayList<>();

        notebooks.add(new Notebook("Lenovo", 8, 512, "Windows 10", "черный"));
        notebooks.add(new Notebook("HP", 16, 1024, "Windows 11", "серебристый"));
        notebooks.add(new Notebook("Apple", 8, 256, "macOS", "золотой"));
        notebooks.add(new Notebook("Acer", 16, 512, "Linux", "белый"));
    }

    public void filterNotebooks() {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "ram");
        criteria.put(2, "storage");
        criteria.put(3, "operatingSystem");
        criteria.put(4, "color");

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        for (Map.Entry<Integer, String> entry : criteria.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        int selectedCriterion = scanner.nextInt();
        scanner.nextLine();

        List<Notebook> filteredNotebooks = new ArrayList<>();

        switch (selectedCriterion) {
            case 1:
                System.out.println("Введите минимальное значение для ОЗУ:");
                int minRam = scanner.nextInt();
                for (Notebook notebook : notebooks) {
                    if (notebook.getRam() >= minRam) {
                        filteredNotebooks.add(notebook);
                    }
                }
                break;
            case 2: // Объем ЖД
                System.out.println("Введите минимальное значение для объема ЖД:");
                int minStorage = scanner.nextInt();
                for (Notebook notebook : notebooks) {
                    if (notebook.getStorage() >= minStorage) {
                        filteredNotebooks.add(notebook);
                    }
                }
                break;
            case 3:
                System.out.println("Введите операционную систему:");
                String os = scanner.nextLine();
                for (Notebook notebook : notebooks) {
                    if (notebook.getOperatingSystem().equalsIgnoreCase(os)) {
                        filteredNotebooks.add(notebook);
                    }
                }
                break;
            case 4:
                System.out.println("Введите цвет:");
                String color = scanner.nextLine();
                for (Notebook notebook : notebooks) {
                    if (notebook.getColor().equalsIgnoreCase(color)) {
                        filteredNotebooks.add(notebook);
                    }
                }
                break;
            default:
                System.out.println("Неверный критерий!");
                return;
        }

        System.out.println("Найдены ноутбуки по критериям:");
        for (Notebook notebook : filteredNotebooks) {
            System.out.println(notebook);
        }
    }

    public static void main(String[] args) {
        NotebookStore store = new NotebookStore();
        store.filterNotebooks();
    }
}
