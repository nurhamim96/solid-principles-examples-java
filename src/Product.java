
/**
 * Contoh penerapan Open/Close Principle
 */


// CONTOH SEBELUM MENGGUNAKAN Open/Close Principle

//public class Product {
//    /** Product entities */
//}
//
//class ShippingOrderService {
//    public void checkout(Product product, ShippingType type) {
//        switch (type) {
//            case JNE:
//                /** do checkout product with this shipping type */
//                break;
//            case TIKI:
//                /** do checkout product with this shipping type */
//                break;
//            default:
//                throw new IllegalArgumentException("Unsupported shipping type");
//        }
//    }
//}
//
//enum ShippingType {
//    JNE, TIKI
//}

// CONTOH SESUDAH MENGGUNAKAN Open/Close Principle

public class Product {
    /** Product entities */
}

class ShippingOrderService {
    public void checkout(Product product, Shipping shipping) {
        int costShipping = shipping.calculate(product);
    }
}

abstract class Shipping {
    abstract public int calculate(Product product);
}

class JNEShipping extends Shipping {

    @Override
    public int calculate(Product product) {
        return 0; /** calculate amount of this type with product*/
    }
}

class TIKIShipping extends Shipping {

    @Override
    public int calculate(Product product) {
        return 0; /** calculate amount of this type with product*/
    }
}
