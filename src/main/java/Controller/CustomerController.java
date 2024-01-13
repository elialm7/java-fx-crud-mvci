package Controller;

import javafx.scene.Parent;
import javafx.scene.layout.Region;
import javafx.util.Builder;
import model.CustomerModel;
import view.CustomerViewBuilder;

public class CustomerController {


    private Builder<Region> viewBuilder;
    private CustomerInteractor interactor;


    public CustomerController(){

        CustomerModel model = new CustomerModel();
        viewBuilder = new CustomerViewBuilder(model);
        interactor = new CustomerInteractor(model);
    }

    public Region getView() {

        return viewBuilder.build();
    }
}
