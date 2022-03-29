import java.util.Scanner;

public class Manager {

    public static void main(String[] args) {
        Diet MrInfantozzi = new Diet("Eat less cheese");
        String boole = "y";
        while (boole.equals("y")) {
            System.out.println("New Entry?");
            Scanner myVar = new Scanner(System.in);
            boole = myVar.nextLine();
            if (boole.equals("y")) {
                System.out.println("Enter date:");
                myVar = new Scanner(System.in);
                String date = myVar.nextLine();

                System.out.println("Enter weight:");
                myVar = new Scanner(System.in);
                int weight = myVar.nextInt();

                Entry g = new Entry(date, weight);
                MrInfantozzi.EntryList.add(g);
            }
        }





        MrInfantozzi.PrintList();
        System.out.println(MrInfantozzi.getNote());
        int NetW = MrInfantozzi.ClacNetWeight();
        System.out.println(NetW);
        MrInfantozzi.CalcWeightDiff();


    }

}
