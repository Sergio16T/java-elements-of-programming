package Advanced;

import java.util.ArrayList;
import java.util.List;

import Advanced.ExampleClasses.ApplePie;
import Advanced.ExampleClasses.Pie;

public class SubstitutionPrinciple {

    public static void main(String[] args) {
        Pie examplePie = new Pie();
        ApplePie exampleAppliePie = new ApplePie();

        bake(examplePie);
        /* Since ApplePie is a subclass of Pie, bake which takes an argument of type Pie
        can accept this subclass as it's argument (substitution) */
        bake(exampleAppliePie);

        List<Pie> bakedGoods = new ArrayList<Pie>();
        bakedGoods.add(new Pie());
        bakedGoods.add(new ApplePie());
        printBakedGoods(bakedGoods);

        // Substitution Principle does not apply to Lists
        List<ApplePie> bakedApplePies = new ArrayList<ApplePie>();
        bakedApplePies.add(new ApplePie());

        // The method printBakedGoods(List<Pie>) is not applicable for the arguments (List<ApplePie>)
        // printBakedGoods(bakedApplePies);

    }

    static void bake(Pie pie) {
        System.out.println("Baking a new " + pie.toString());
    }

    static void printBakedGoods(List<Pie> bakedGoodsList) {
        System.out.println("\nprintBakedGoods\n\t");
        for (Pie bakedGood : bakedGoodsList) {
            bake(bakedGood);
        }
    }
}
