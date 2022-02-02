package com.example.analyzer;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.Scanner;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;
    @FXML
    private BarChart graf;


    @FXML
    protected void onHelloButtonClick(MouseEvent event)  {
        Window window = ((Node) event.getTarget()).getScene().getWindow();
        FileChooser fileChooser = new FileChooser();
        File file = fileChooser.showOpenDialog(window);
        System.out.println(file);

        try {

            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                HashMap<Character, Integer> map = new HashMap<Character, Integer>();
                String s = "aasjjikkk";
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    Integer val = map.get(c);
                    if (val != null) {
                        map.put(c, val + 1);
                    }
                    else {
                        map.put(c, 1);
                    }

            }}
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();


        }}

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }
}

 class Curves extends Application {

    @Override
    public void start(Stage p) {
        CategoryAxis x=new CategoryAxis();
        NumberAxis y=new NumberAxis();
        x.setLabel("Years");
        y.setLabel("Income");

        BarChart barchart=new BarChart<>(x,y);

        barchart.setTitle("UK");


        XYChart.Series series=new XYChart.Series<>();

        series.getData().add(new XYChart.Data<>("2001",5));
        series.getData().add(new XYChart.Data<>("2002",40));
        series.getData().add(new XYChart.Data<>("2003",100));
        series.getData().add(new XYChart.Data<>("2004",10));
        series.getData().add(new XYChart.Data<>("2005",150));
        series.getData().add(new XYChart.Data<>("2006",70));
        series.getData().add(new XYChart.Data<>("2007",79));

        series.setName("ECONOMICS");
        barchart.getData().add(series);
        BorderPane bpane=new BorderPane();
        bpane.setCenter(barchart);




        p.setTitle("UK");
        Scene scene=new Scene(bpane,800,500);
        p.setScene(scene);
        p.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}




