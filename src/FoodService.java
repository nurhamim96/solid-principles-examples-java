import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Contoh Single Responsibility Principle (SRP)
 */

// CONTOH SEBELUM MENGGUNAKAN Single Responsibility Principle (SRP)

//public class FoodService {
//    int id;
//    String name;
//    String date;
//
//    public FoodService(int id, String name, String date) {
//        this.id = id;
//        this.name = name;
//        this.date = date;
//    }
//
//    void addToStore() {
//        if(!isExpired()) {
//            // add to store
//        }
//    }
//
//    private boolean isExpired() {
//        Date foodDate = new Date();
//        Date now = new Date();
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH);
//        try {
//            foodDate = dateFormat.parse(this.date);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return foodDate.getTime() >= now.getTime();
//    }
//
//}

// CONTOH SESUDAH MENGGUNAKAN Single Responsibility Principle (SRP)

public class FoodService {
    int id;
    String name;
    String date;

    public FoodService(int id, String name, String date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    void addToStore() {
        if(!FoodExpiry.isExpired(date)) {
            // add to store
        }
    }

}

class FoodExpiry {
    public static boolean isExpired(String date) {
        Date foodDate = new Date();
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd",  Locale.ENGLISH);
        try {
            foodDate = dateFormat.parse(date);
        } catch(ParseException e) {
            e.printStackTrace();
        }
        return foodDate.getTime() >= now.getTime();
    }
}