package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.VehiculoController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ReservaViewController {
    VehiculoController vehiculoController;
    ObservableList<Vehiculo> listVehiculos = FXCollections.observableArrayList();
    Vehiculo selectedCliente;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="columnModelo"
    private TableColumn<Vehiculo, String> columnModelo; // Value injected by FXMLLoader

    @FXML // fx:id="btnLimpiar"
    private Button btnLimpiar; // Value injected by FXMLLoader

    @FXML // fx:id="columnNpuertas"
    private TableColumn<Vehiculo, String> columnNpuertas; // Value injected by FXMLLoader

    @FXML // fx:id="labelCostoTotal"
    private Label labelCostoTotal; // Value injected by FXMLLoader

    @FXML // fx:id="columnCliente"
    private TableColumn<Cliente, String> columnCliente; // Value injected by FXMLLoader

    @FXML // fx:id="tblListVehiculo"
    private TableView<?> tblListVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="comboVehiculos"
    private ComboBox<?> comboVehiculos; // Value injected by FXMLLoader

    @FXML // fx:id="btnCalcularCosto"
    private Button btnCalcularCosto; // Value injected by FXMLLoader

    @FXML // fx:id="btnFechaFin"
    private DatePicker btnFechaFin; // Value injected by FXMLLoader

    @FXML // fx:id="btnReservar"
    private Button btnReservar; // Value injected by FXMLLoader

    @FXML // fx:id="columnTransmision"
    private TableColumn<Vehiculo, String> columnTransmision; // Value injected by FXMLLoader

    @FXML // fx:id="btnEliminar"
    private Button btnEliminar; // Value injected by FXMLLoader
    
    @FXML // fx:id="columnApellido"
    private TableColumn<Cliente, String> columnApellido; // Value injected by FXMLLoader

    @FXML // fx:id="columnNombre"
    private TableColumn<Cliente, String> columnNombre; // Value injected by FXMLLoader

    @FXML // fx:id="lblCostoTotal"
    private Label lblCostoTotal; // Value injected by FXMLLoader

    @FXML // fx:id="columnMatricula"
    private TableColumn<Vehiculo, String> columnMatricula; // Value injected by FXMLLoader

    @FXML // fx:id="btnFechaInicio"
    private DatePicker btnFechaInicio; // Value injected by FXMLLoader

    @FXML // fx:id="columnVehiculo"
    private TableColumn<Vehiculo, String> columnVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="comboClientes"
    private ComboBox<?> comboClientes; // Value injected by FXMLLoader

    @FXML // fx:id="columnMarca"
    private TableColumn<Vehiculo, String> columnMarca; // Value injected by FXMLLoader

    @FXML // fx:id="btnActualizar"
    private Button btnActualizar; // Value injected by FXMLLoader
    private App app;

    @FXML
    void agregarReservaAction(ActionEvent event) {

    }

    @FXML
    void actualizarVehiculoAction(ActionEvent event) {

    }

    @FXML
    void onCalcularCosto(ActionEvent event) {

    }

    @FXML
    void onLimpiar(ActionEvent event) {

    }

    @FXML
    void onEliminar(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        obtenerVehiculos();
        initBinding();
    }

    private void initBinding() {
      columnMarca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
      columnNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
      columnApellido.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellido()));
        
        // Usamos SimpleObjectProperty para manejar Double y Integer correctamente
    }

    private void obtenerVehiculos() {
        listVehiculos.addAll(vehiculoController.obtenerVehiculos());
    }

    public void setApp(App app) {
        this.app = app;
        ArrayList<String> clientes = new ArrayList<>();
        ObservableList<String> options=
        FXCollections.observableArrayList(
        ""
        );
        clientes.add(""+clientes);
        comboClientes.setItems(options);
    }
}
