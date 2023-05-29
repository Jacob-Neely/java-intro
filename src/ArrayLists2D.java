import java.util.*;

public class ArrayLists2D {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> GroceryList = new ArrayList();

        ArrayList<String> BakeryList = new ArrayList();
        BakeryList.add("pasta");
        BakeryList.add("garlic bread");
        BakeryList.add("donuts");

        ArrayList<String> ProduceList = new ArrayList();
        ProduceList.add("tomatoes");
        ProduceList.add("zucchini");
        ProduceList.add("peppers");

        ArrayList<String> DrinksList = new ArrayList();
        DrinksList.add("Soda");
        DrinksList.add("Coffee");

        GroceryList.add(BakeryList);
        GroceryList.add(ProduceList);
        GroceryList.add(DrinksList);

        System.out.println(GroceryList.get(2).get(1));
    }
}
