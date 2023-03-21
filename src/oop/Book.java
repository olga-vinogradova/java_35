package oop;

public class Book {


    //Fields
    public String title;
    public String author;
    private int numberOfPages;

    public void setNumberOfPages(int numberOfPages) {
        if (isNumberOfPagesCorrect(numberOfPages)) {
            this.numberOfPages = numberOfPages;
        } else {
            System.out.println("The provided number of pages is incorrect " + numberOfPages);
        }

    }

    private boolean isNumberOfPagesCorrect(int numberOfPages) {
        return numberOfPages >= 10;
    }

    public void printBookInfo() {
        if (isNumberOfPagesCorrect(numberOfPages)) {
            System.out.printf("The book %s with author %s has %d pages\n", title, author, numberOfPages); //print formatting
        } else {
            System.out.println("Cannot print book info because number of pages are invalid");
        }


    }
}
