import java.util.*;

public class Diet {
    String Note;
    ArrayList<Entry> EntryList;
    int NetWeight;

    public Diet(String N) {
        Note = N;
        EntryList = new ArrayList<>();
        NetWeight = 0;
    }

    public String getNote(){
        return this.Note;
    }
    public void PrintList() {
        for (Entry a : EntryList) {
            System.out.println(a.toString());
        }
    }

    public int ClacNetWeight(){
        int nw;
        int n = EntryList.size();
        int a = EntryList.get(n-1).getWeight();
        int b = EntryList.get(0).getWeight();
        nw = a-b;
        return nw;
    }

    public void CalcWeightDiff(){
        int wd;
        int i;
        for (i = 0; i < EntryList.size()-1; i++){
            int a = EntryList.get(i).getWeight();
            int b = EntryList.get(i+1).getWeight();
            wd = b-a;
            System.out.println("weight differencial: " + wd);
        }
    }

}
//[]