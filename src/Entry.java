

public class Entry {

    private String date;
    private int weight;


    public Entry(String date, int weight) {
        this.date = date;
        this.weight = weight;
    }

    public String getDate() {return date;}

    public void setDate(String date) {this.date = date;}

    public int getWeight() {return weight;}

    public void setWeight(int weight) {this.weight = weight;}

    @Override
    public String toString() {
        return "Entry{" + "date='" + date + '\'' + ", weight=" + weight + '}';}

        //return "=============" + \' + "Main Menu" +  \' + "=============" + \' + "1.Add Record" + \' + "2.View Record"
        // + \' + "3.View All Record" + \' + "4.Exit" + \' + "Selection:" +
}
