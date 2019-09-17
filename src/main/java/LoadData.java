import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoadData {
    private int horizontal;
    private int vertical;
    private Scanner globalScanner= new Scanner(System.in);
    public void loadData(){
        System.out.println("enter length");
         horizontal = globalScanner.nextInt();
        System.out.println("enter width");
         vertical= globalScanner.nextInt();
    }


    public ArrayList<Integer> loadHorizontalCutsCost(){
        ArrayList<Integer> list =new ArrayList<Integer>();
        for (int i = 1; i < horizontal; i++) {
            System.out.println("enter the cost  x"+i+" cutting");
            int a=globalScanner.nextInt();
            list.add(a);
        }
        return list;
    }

    public ArrayList loadVerticalCutCost(){
        ArrayList<Integer> list =new ArrayList<Integer>();
        for (int i = 1; i < vertical; i++) {
            System.out.println("enter cost of y"+i+" cutting");
            int a=globalScanner.nextInt();
            list.add(a);
        }
        return list;
    }
}
