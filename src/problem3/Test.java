package problem3;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter the library capacity (at least 2): ");
            n = scan.nextInt();
        } while (n < 2);
        scan.nextLine();
        Library library = new Library(n);
        library.add(new Book("Java Programming", "James Gosling", 350));
        library.add(new Novel("1984", "George Orwell", 328, 95));
        int choice;
        do {
            System.out.println("\n===== LIBRARY MENU =====");
            System.out.println("1. Add a document");
            System.out.println("2. Display all documents");
            System.out.println("3. Delete a document");
            System.out.println("4. Search for a document");
            System.out.println("5. Display authors");
            System.out.println("0. Exit");
            System.out.print("Your choice: ");

            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Select document type:");
                    System.out.println("1. Book");
                    System.out.println("2. Novel");
                    System.out.println("3. Textbook");
                    System.out.println("4. Magazine");
                    System.out.println("5. Dictionary");

                    int type = scan.nextInt();
                    scan.nextLine();

                    Document doc = null;

                    if (type >= 1 && type <= 3) {
                        System.out.print("Title: ");
                        String title = scan.nextLine();

                        System.out.print("Author: ");
                        String author = scan.nextLine();

                        System.out.print("Number of pages: ");
                        int pages = scan.nextInt();
                        scan.nextLine();

                        if (type == 1) {
                            doc = new Book(title, author, pages);
                        } else if (type == 2) {
                            System.out.print("Price: ");
                            double price = scan.nextDouble();
                            scan.nextLine();

                            doc = new Novel(title, author, pages, price);
                        } else {
                            System.out.print("Level: ");
                            String level = scan.nextLine();

                            doc = new TextBook(title, author, pages, level);
                        }

                    } else if (type == 4) {
                        System.out.print("Title: ");
                        String title = scan.nextLine();

                        System.out.print("Month: ");
                        String month = scan.nextLine();

                        System.out.print("Year: ");
                        int year = scan.nextInt();
                        scan.nextLine();
                        doc = new Magazine(title, month, year);
                    } else if (type == 5) {
                        System.out.print("Title: ");
                        String title = scan.nextLine();
                        System.out.print("Language: ");
                        String language = scan.nextLine();
                        doc = new Dictionary(title, language);
                    }

                    if (library.add(doc)) {
                        System.out.println("Document added successfully!");
                    } else {
                        System.out.println("Failed to add document.");
                    }
                    break;

                case 2:
                    library.displayDocuments();
                    break;

                case 3:
                    System.out.print("Enter document number to delete: ");
                    int deleteNum = scan.nextInt();
                    scan.nextLine();

                    Document toDelete = library.document(deleteNum);

                    if (library.delete(toDelete)) {
                        System.out.println("Document deleted!");
                    } else {
                        System.out.println("Document not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter document number: ");
                    int searchNum = scan.nextInt();
                    scan.nextLine();

                    Document found = library.document(searchNum);

                    if (found != null) {
                        System.out.println(found.toString());
                    } else {
                        System.out.println("Document not found!");
                    }
                    break;

                case 5:
                    library.displayAuthors();
                    break;

                case 0:
                    System.out.println("Exiting library...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);
        scan.close();
    }
}
