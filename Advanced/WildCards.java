package Advanced;

import java.util.ArrayList;
import java.util.List;

import Advanced.ExampleClasses.ApplePie;
import Advanced.ExampleClasses.Pie;

// Wild Cards Give More Flexibility when writing methods
public class WildCards {

    public static void main(String[] args) {
        List<ApplePie> bakedApplePies = new ArrayList<ApplePie>();
        bakedApplePies.add(new ApplePie());

        printBakedGoods(bakedApplePies);

        List<Pie> bakedGoods = new ArrayList<Pie>();
        bakedGoods.add(new Pie());

        addBakedApplePieToList(bakedApplePies);
        addBakedApplePieToList(bakedGoods);
    }

    public static void bake(Pie pie) {
        System.out.println("Baking a new " + pie.toString());
    }

    public static void printBakedGoods(List<? extends Pie> bakedGoodsList) {
        System.out.println("\nprintBakedGoods\n\t");
        for (Pie bakedGood : bakedGoodsList) {
            bake(bakedGood);
        }
    }

    public static void addBakedApplePieToList(List<? super ApplePie> bakedGoods) {
        bakedGoods.add(new ApplePie());
        System.out.println(bakedGoods);
    }
}
