package competetive.dynamicProg;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class stockAnalyze {
    public static void main(String[] args) {
        List<Integer> onHand= new ArrayList<>();
        onHand.add(1);
        onHand.add(0);
        onHand.add(1);

        List<Integer> supplier= new ArrayList<>();
        supplier.add(2);
        supplier.add(2);       supplier.add(0);       supplier.add(2);       supplier.add(0);       supplier.add(0);


        int demand=2;


        System.out.println(stockAnalyzeCode(onHand, supplier,demand));
    }

    private static int stockAnalyzeCode(List<Integer> onHand, List<Integer> supplier, int demand) {
        Collections.sort(onHand);
        Collections.sort(supplier);
        int currentDay=0;
        int i=0;
        int j=0;
        int demandGlobal= demand;
        while(onHand.size() >0 && supplier.size()>0){
            i=0;
            j=0;
            while(demand >0) {
                onHand.stream().forEach(System.out::print);
                System.out.println("========");
                supplier.stream().forEach(System.out::print);
                System.out.println("====sp====");
                System.out.println(onHand.size() + "***");
                System.out.println( supplier.size());
                System.out.println(i +":"+onHand.get(i) );
                if (onHand.get(i) <= supplier.get(j) ) {
                    onHand.remove(i);


                } else if (onHand.get(i) > supplier.get(j)) {
                    supplier.remove(j);
                }
                demand--;

            }
            int finalCurrentDay = currentDay;
            onHand.removeIf(l->l.equals(finalCurrentDay));
            supplier.removeIf(l->l.equals(finalCurrentDay));
            demand =demandGlobal;
            currentDay++;
        }
        while(onHand.size() >0 ){
            i=0;
            j=0;
            while(demand >0) {
                onHand.stream().forEach(System.out::print);
                System.out.println("========");
                supplier.stream().forEach(System.out::print);
                System.out.println("====sp====");
                System.out.println(onHand.size() + "***");
                System.out.println( supplier.size());
                System.out.println(i +":"+onHand.get(i) );
                if (onHand.get(i) <= supplier.get(j) ) {
                    onHand.remove(i);


                }
                demand--;

            }
            int finalCurrentDay = currentDay;
            onHand.removeIf(l->l.equals(finalCurrentDay));
            supplier.removeIf(l->l.equals(finalCurrentDay));
            demand =demandGlobal;
            currentDay++;
        }
        return currentDay;
    }
}
