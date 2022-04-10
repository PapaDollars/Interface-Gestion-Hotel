package com.example.prinved;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HomeController implements Initializable {

    private Parent fxml;

    @FXML
    private AnchorPane root;

    @FXML
    void accueil(MouseEvent event) throws IOException {
        fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Accueil.fxml")));
        root.getChildren().removeAll();
        root.getChildren().setAll(fxml);
    }

    @FXML
    void contrat(MouseEvent event) throws IOException {
        fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Contrat.fxml")));
        root.getChildren().removeAll();
        root.getChildren().setAll(fxml);
    }

    @FXML
    void facture(MouseEvent event) throws IOException {
        fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Facture.fxml")));
        root.getChildren().removeAll();
        root.getChildren().setAll(fxml);
    }

    @FXML
    void historique(MouseEvent event) throws IOException {
        fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Historique.fxml")));
        root.getChildren().removeAll();
        root.getChildren().setAll(fxml);
    }

    @FXML
    void locataire(MouseEvent event) throws IOException {
        fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Locataire.fxml")));
        root.getChildren().removeAll();
        root.getChildren().setAll(fxml);
    }

    @FXML
    void location(MouseEvent event) throws IOException {
        fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Location.fxml")));
        root.getChildren().removeAll();
        root.getChildren().setAll(fxml);
    }

    @FXML
    void logement(MouseEvent event) throws IOException {
        fxml = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Logement.fxml")));
        root.getChildren().removeAll();
        root.getChildren().setAll(fxml);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
