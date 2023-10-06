/* This program processes arrays of stock
prices data to analyze the time and space
complexities of the implemented algorithms.
*/

import java.util.*;

public class StockPrices {

    public static void main(String[] args){


        float[] arrayStockPrices = {100.0f, 105.0f, 102.0f, 98.0f, 110.0f, 115.0f, 120.0f, 125.0f, 130.0f, 135.0f};



        ArrayList<Float> arrayListStockPrices = new ArrayList<>(Arrays.asList(100.0f, 105.0f, 102.0f, 98.0f, 110.0f, 115.0f, 120.0f, 125.0f, 130.0f, 135.0f));


        System.out.println(calculateAveragePrice(arrayStockPrices));
        System.out.println(calculateAveragePrice(arrayListStockPrices));

        System.out.println(findMaximumPrice(arrayStockPrices));
        System.out.println(findMaximumPrice(arrayListStockPrices));

        System.out.println(countOccurences(arrayStockPrices, 105.0f));
        System.out.println(countOccurences(arrayListStockPrices, 105.0f));

        System.out.println(computeCumulativeSum(arrayListStockPrices));
        System.out.println(computeCumulativeSum(arrayStockPrices)[0]);



    }

    public static float calculateAveragePrice(float[] prices) {

        float counter = 0.0f;
        int size = prices.length;

        for (int i = 0; i < prices.length; i++) {

            float item = prices[i];
            counter += item;
        }

        return counter / size;

    }

    public static float calculateAveragePrice(ArrayList<Float> prices) {

        float counter = 0.0f;
        int size = prices.size();

        for (int i = 0; i < prices.size(); i++) {

            float item = prices.get(i);
            counter += item;
        }

        return counter / size;

    }

    public static float findMaximumPrice(float[] prices) {

        float max = 0.0f;

        for (int i = 0; i < prices.length; i++) {

            float item = prices[i];
            if (item > max) {
                max = item;
            }
        }


        return max;
    }

    public static float findMaximumPrice(ArrayList<Float> prices) {

        float max = 0.0f;

        for (int i = 0; i < prices.size(); i++) {

            float item = prices.get(i);
            if (item > max) {
                max = item;
            }
        }

        return max;
    }

    public static int countOccurences(float[] prices, float target) {

        int counter = 0;

        for (int i = 0; i < prices.length; i++) {

            float item = prices[i];
            if (item == target) {
                counter++;
            }
        }

        return counter;
    }

        public static int countOccurences(ArrayList<Float> prices, float target) {

        int counter = 0;

        if (!prices.contains(target)) {
            return 0;
        }

        for (int i = 0; i < prices.size(); i++) {

            float item = prices.get(i);
            if (item == target) {
                counter++;
            }
        }

        return counter;
    }

    public static float[] computeCumulativeSum(float[] prices) {

        float sum = 0.0f;

        for (int i = 0; i < prices.length; i++) {

            float item = prices[i];

            sum += item;
        }

        float[] arraysum = {sum};

        return arraysum;

    }

    public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> prices) {

        float sum = 0;

        for (int i = 0; i < prices.size(); i++) {

            float item = prices.get(i);

            sum += item;
        }

        ArrayList<Float> arraysum = new ArrayList<>();
        arraysum.add(sum);

        return arraysum;

    }

}
