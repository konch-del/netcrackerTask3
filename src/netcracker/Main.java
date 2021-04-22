package netcracker;

public class Main {
    public static String insertToTable(String id_Group, int dolgCount){
        String sql = "INSERT INTO T_GroupSelected "
                     +"(id_Student, firstName, lastName, id_Group) "
                     +"SELECT id_Student, firstName, lastName, id_Group "
                     +"FROM T_Student "
                     +"WHERE dolgCount > " + dolgCount + " AND "
                     +"id_Group=\'" + id_Group + "\';";
        return sql;
    }
    public static void main(String[] args) {
        //System.out.println(insertToTable("BSBO-15-18", 5));

        /*Address abc = Address.addressCommaToken("Россия,Москва,Красная Площадь, 1, 2, 3");
        Address abc1 = Address.addressOtherToken("Россия,Казань,Проспект Ленина,4,5,6");
        Address abc2 = Address.addressOtherToken("Россия.Казань.Проспект Ленина.4.5.6");
        Address abc3 = Address.addressOtherToken("Россия;Казань;Проспект Ленина;4;5;6");
        Address abc4 = Address.addressOtherToken("Россия-Казань-Проспект Ленина-4-5-6");
        System.out.println(abc.getFullAddress());
        System.out.println(abc1.getFullAddress());
        System.out.println(abc2.getFullAddress());
        System.out.println(abc3.getFullAddress());
        System.out.println(abc4.getFullAddress());
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        for(int i = 0; i < 11; i++){
            String[] a = shirts[i].split(",");
            Shirt b = new Shirt(a[0],a[1],a[2],a[3]);
            System.out.println(b.toString());
        }*/
        System.out.println(Number.NumberForm("+79175655655"));
        System.out.println(Number.NumberForm("89175655655"));
        System.out.println(Number.NumberForm("+104289652211"));
    }
}
