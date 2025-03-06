package Composite;

import java.util.ArrayList;

public class Bundle  implements BundleCalculator{
    ArrayList<BundleCalculator> MyBundlesPrices;

    public Bundle() {
        MyBundlesPrices =new ArrayList<>();
    }
    public void addBundle(BundleCalculator b) {
        MyBundlesPrices.add(b);
    }


    @Override
    public double calculateBundle() {
        double total=0;
        for(int i =0;i<MyBundlesPrices.size();i++)
        {

            total=total+MyBundlesPrices.get(i).calculateBundle();
        }
        return total *0.9;
    }
}
