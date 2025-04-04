public class ExceptionHandling2 {
    public static void main(String[] args) {
        String[] availableBooks = {"Java", "Python", "C++"};
        String requestedBook = "Java";
        int maxBooksAllowed = 3;
        int currentlyBorrowed = 3;

        try {
            boolean bookFound = false;
            for (String book : availableBooks) {
                if (book.equalsIgnoreCase(requestedBook)) {
                    bookFound = true;
                    break;
                }
            }

            if (!bookFound) {
                throw new Exception("Book not available in library.");
            }

            if (currentlyBorrowed >= maxBooksAllowed) {
                throw new Exception("Borrowing limit reached.");
            }

            System.out.println("Book issued successfully: " + requestedBook);
        } catch (Exception e) {
            System.out.println("Library Error: " + e.getMessage());
        } finally {
            System.out.println("Visit again!");
        }
    }
}
