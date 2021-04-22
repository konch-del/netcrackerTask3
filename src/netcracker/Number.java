package netcracker;

public class Number {
    public static String NumberForm(String number){
        if(number.charAt(0) == '+'){
            return String.format(number.substring(0,5) + "-" +number.substring(5,8) + "-" +number.substring(8,12));
        }
        else
            return String.format("+7" + number.substring(1,4) + "-" +number.substring(4,7) + "-" +number.substring(7,11));
    }
}
