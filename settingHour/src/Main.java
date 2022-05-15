import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

    public static void main(String[] args) throws ParseException { //need the throws ParseException in the program


        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");//need pass parameters in the SimpleDateFormat
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date date1 = new Date(); //x1 receive the date of the running program in GMT
        Date date2 = sdf2.parse("14/05/2022 12: 45: 33");//the date already in the variable


        System.out.println("y1: " + sdf2.format(date1));// print the variable y1
        System.out.println("X1: " + date2); // format of GMT

    }


}
