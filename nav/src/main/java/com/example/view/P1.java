package com.example.view;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class P1 extends Application {

    Stage primaryStage;
    Scene p1Scene, p2Scene;

    @Override
    public void start(Stage myStage) throws Exception {

        Button button = new Button("Click me");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                initializeP2();
                primaryStage.setScene(p2Scene);
            }
        });

        VBox vbox = new VBox(20, new Text("P1"), button);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 300, 250);
        myStage.setScene(scene);
        p1Scene = scene;
        myStage.setTitle("Hello World");
        primaryStage = myStage;
        myStage.show();
    }

    void initializeP2() {
        P2 p2 = new P2();
        p2.setP2Stage(primaryStage);
        p2Scene = p2.createP2UI(this::handleBack);
        p2.setP1Scene(p1Scene);
    }

    void handleBack() {
        primaryStage.setScene(p1Scene);
    }
}
