import javax.swing.*;
import java.sql.Connection;
import java.util.Scanner;
public class sequentialSearch {
    private static int[] n= {3,6,8,11,15,22};
    private static int[] m= {};
    String result;
    public static int linerSearch(int x){
        int size = n.length;
        int i;
        String result;
        for(i=0; i<size; i++){
            if(n[i] == x) {
                result = "key " +x+ " fount at index " + i;
                System.out.println(result);
                savedata(result);
                break;
            }
        }
        if (i == size){
            result = "Key " + x + " not found.";
            System.out.println(result);
            savedata(result);
        }
        return i;
    }

    public static int linerSearch2(int x2){
        int size = m.length;
        int i;
        String result;
        for(i=0; i<size; i++){
            if(m[i] == x2) {
                result = "Key "+x2+" found at index: "+i;
                savedata(result);
                break;
            }
        }
        if (i == size){
            result = "Key " + x2 + " not found.";
            savedata(result);
        }
        return i;
    }

    public static void savedata(String result){
        try {
            String sql = "INSERT INTO result (result) VALUES ('"+result+"')";
            java.sql.Connection conn=(Connection)config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            System.out.println("Berhasil menambahkan data ke database");
        } catch (Exception e) {
            System.out.println("Gagal menambahkan data" + e.getMessage());
        }
    }

    public static void main(String a[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the search value:");
        int find = input.nextInt();
        int result = linerSearch(find);
    }
}
