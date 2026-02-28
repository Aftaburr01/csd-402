// UseDivision.java

public class UseDivision {

    public static void main(String[] args) {

        // Two International Divisions
        InternationalDivision intDiv1 =
                new InternationalDivision("Global Tech", 1001, "Canada", "English");

        InternationalDivision intDiv2 =
                new InternationalDivision("Euro Sales", 1002, "Germany", "German");

        // Two Domestic Divisions
        DomesticDivision domDiv1 =
                new DomesticDivision("East Coast Sales", 2001, "New York");

        DomesticDivision domDiv2 =
                new DomesticDivision("West Coast Support", 2002, "California");

        // Display all divisions
        intDiv1.display();
        intDiv2.display();
        domDiv1.display();
        domDiv2.display();
    }
}