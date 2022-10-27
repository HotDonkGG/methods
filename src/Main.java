import test1.Util;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a = 1;
        int[] arr = {1, 2, 3};
        changeValues(a, arr);
        System.out.println(a); //5
        System.out.println(Arrays.toString(arr)); // 523
    }

    public static void changeValues(int a, int[] arr2) {
        a = 5;
        arr2[0] = 5;
    }
    /*
 int i = 0;
        Iterator<Integer> itr = map.keySet().iterator();
        while (itr.hasNext()){
            double profit = 0d;
            double expenses = 0d;
            for (MonthlyStat monthlyStat : map.get(i)) {
                double sum = monthlyStat.quantity * monthlyStat.sumOfOne;
                if (monthlyStat.isExpense) {
                    expenses += sum;
                } else {
                    profit += sum;
                }
            }
            yearlyStatMap.get(i);
            i++;
        }
 */
}