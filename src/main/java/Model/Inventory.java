package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Inventory {

    //VARIABLES
    private static ObservableList allParts;
    private static ObservableList allProducts;

    public static void addPart(Part newPart) {

    }

    public static void addProduct(Product newProduct){

    };

    public static Part lookupPart(int partId){
        return Part;
    };

    public static Product lookupProduct(int productId){
        return Product;
    };

    public static ObservableList<part> lookupPart(String part){
        //ObservableList<part> partName;
        //return partName;
    };

    public static ObservableList<product> lookupProduct(String productName){
        //return ObservableList<part> product;
    };

    public static void updatePart(int index, Part selectedPart){

    };

    public static void updateProduct(int index, Product newProduct){

    };

    public static boolean deletePart(Part selectedPart){
      return true;
    };

    public static boolean deleteProduct(Product selectedProduct){
        return false;
    };

    public static ObservableList<Part> getAllParts(){
        //ObservableList<Part> allParts =
        return allParts;
    }

    public static ObservableList<Product> getAllProducts(){
        return allProducts;
    };
}
