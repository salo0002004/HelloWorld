import java.sql.SQLOutput;

public class Tid {

    public static void main(String[] args) {
        int sekund = 30;
        int minut = 12;
        int time = 11;
        String Sekunder = "Sekunder:";
        int sidenMidnat = ((11*60*60)+(12*60)+30);
        int indtilMidnat =((12*60*60)+(47*60)+30);
        String gåetSiden = "Der er gået";
        String sekunderSiden = "sekunder siden midnat.";
        String derEr = "Der skal gå";
        String indtilNæste = "sekunder indtil næste midnat";




        System.out.println(Sekunder + " " + sekund);
        System.out.println(sidenMidnat);
        System.out.println(gåetSiden + " " + sidenMidnat + " " + sekunderSiden);
        System.out.println(derEr + " " + indtilMidnat +" " + indtilNæste);

    }
}
