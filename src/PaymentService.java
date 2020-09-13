
/**
 * Contoh penerapan Dependency Inversion Principle (DIP)
 */

//  CONTOH SEBELUM MENGGUNAKAN Dependency Inversion Principle (DIP)

//public class PaymentService {
//
//    private MySQLDatabase database = new MySQLDatabase();
//
//    void paymentIsValid() {
//        // Implementation code
//    }
//
//    void openDatabase() {
//        // Implementation code
//    }
//
//    void addNewPayment() {
//        // Implementation code
//    }
//
//    void removePaymentByID() {
//        // Implementation code
//    }
//
//    void updatePaymentByID() {
//        // Implementation code
//    }
//}
//
//class MySQLDatabase {
//    void insert() {
//        // Implementation code
//    }
//
//    void update() {
//        // Implementation code
//    }
//
//    void delete() {
//        // Implementation code
//    }
//}

public class PaymentService {

    private Database database;

    public PaymentService(Database database) {
        this.database = database;
    }

    void paymentIsValid() {
        // Implementation code
    }

    void openDatabase() {
        // Implementation code
    }

    void addNewPayment() {
        // Implementation code
    }

    void removePaymentByID() {
        // Implementation code
    }

    void updatePaymentByID() {
        // Implementation code
    }
}

abstract class Database {
    abstract void insert();
    abstract void update();
    abstract void delete();
}

class MySQLDatabase extends Database{

    @Override
    void insert() {
        // Implementation code
    }

    @Override
    void update() {
        // Implementation code
    }

    @Override
    void delete() {
        // Implementation code
    }
}

class MongoDatabase extends Database {

    @Override
    void insert() {
        // Implementation code
    }

    @Override
    void update() {
        // Implementation code
    }

    @Override
    void delete() {
        // Implementation code
    }
}
