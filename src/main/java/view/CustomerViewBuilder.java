package view;

import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.util.Builder;
import model.CustomerModel;

public class CustomerViewBuilder implements Builder<Region> {


    private CustomerModel model;
    public CustomerViewBuilder(CustomerModel model){

        this.model = model;
    }
    @Override
    public Region build() {
        return new VBox();
    }
}
