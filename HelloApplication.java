package com.example.tpc8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane root = new Pane();
        root.setStyle("-fx-background-color: cyan;");
        //texto
        Label texto = new Label("TPC8");
        texto.setTextFill(Color.GREEN);
        texto.setFont(Font.font("verdana", FontWeight.NORMAL, FontPosture.REGULAR, 42));
        texto.setLayoutX(30);



        //quadrado(Rectangle)
        Rectangle q = new Rectangle(90, 90,Color.BLUE);
        q.setStroke(Color.BLACK);
        q.setStrokeWidth(5);
        q.setX(70);
        q.setY(80);

        //triangulo(polygon)
        Polygon trian = new Polygon();
        trian.setFill(Color.YELLOW);
        trian.getPoints().addAll(new Double[]{60.0, 0.0, 60.0, 140.0,160.0,140.0});
        trian.setLayoutY(170);
        trian.setLayoutX(100);

        //linha
        Line linha = new Line(100, 150, 350,400);
        linha.setStroke(Color.RED);
        linha.setStrokeWidth(3);
        linha.setLayoutY(-80);
        linha.setLayoutX(100);

        //circulo
        Circle circulo = new Circle(50, Color.ORANGE);
        circulo.setLayoutX(290);
        circulo.setLayoutY(370);

        //imagem
        File file = new File("src/main/java/com/example/tpc8/utacv.png");
        Image imagem = new Image(file.toURI().toString());
        ImageView img = new ImageView();
        img.setImage(imagem);
        img.setLayoutX(70);
        img.setLayoutY(430);

        root.getChildren().addAll(texto, q, trian, linha, circulo, img);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(root, 620, 540);
        stage.setTitle("TPC8-Trabalhar com Scene");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}