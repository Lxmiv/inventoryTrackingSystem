module maksim.InventoryManagementSystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens maksim.InventoryManagementSystem to javafx.fxml;
    exports maksim.InventoryManagementSystem;
}