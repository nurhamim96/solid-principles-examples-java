import java.util.Date;

/**
 * Contoh penerapan prinsip Liskov’s substitution.
 */

//  CONTOH SEBELUM MENGGUNAKAN prinsip Liskov’s substitution.

//abstract class Product1 {
//    abstract String setName();
//    abstract Date setExpiredDate();
//
//    /**
//     * Function to get all of information about product
//     */
//
//    public void getProductInfo() {
//        // some magic code
//    }
//}
//
//class Vegetable extends Product1 {
//
//    @Override
//    String setName() {
//        return "Mangga";
//    }
//
//    @Override
//    Date setExpiredDate() {
//        return new Date();
//    }
//}
//
//class Smartphone extends Product1 {
//
//    @Override
//    String setName() {
//        return "Sumsang";
//    }
//
//    @Override
//    Date setExpiredDate() {
//        return new Date(); // ??????? property nya ga terpakai
//    }
//}

//  CONTOH SESUDAH MENGGUNAKAN prinsip Liskov’s substitution.

abstract class Product1 {
    abstract String setName();

    /**
     * Function to get all of information about product
     */

    public void getProductInfo() {
        // some magic code
    }
}

abstract class FoodProduct extends Product1 {
    abstract Date setExpiredDate();
}

class Vegetable extends FoodProduct {

    @Override
    String setName() {
        return "Mangga";
    }

    @Override
    Date setExpiredDate() {
        return new Date();
    }


    class Smartphone extends Product1 {

    @Override
    String setName() {
        return "Sumsang";
    }
  }
}
