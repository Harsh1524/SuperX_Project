package com.example.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class P2 {

    Stage p2Stage;
    Scene p1Scene, p2Scene, p3Scene;

    public Stage getP2Stage() {
        return p2Stage;
    }

    public void setP2Stage(Stage p2Stage) {
        this.p2Stage = p2Stage;
    }

    public Scene getP1Scene() {
        return p1Scene;
    }

    public void setP1Scene(Scene p1Scene) {
        this.p1Scene = p1Scene;
    }

    public Scene getP2Scene() {
        return p2Scene;
    }

    public void setP2Scene(Scene p2Scene) {
        this.p2Scene = p2Scene;
    }

    public Scene createP2UI(Runnable back) {
        Button prevButton = new Button("Back btn");
        prevButton.setOnAction(e -> back.run());

        Button nextButton = new Button("Next btn");
        nextButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                initializeP3();
                p2Stage.setScene(p3Scene);
            }
        });

        VBox vbox = new VBox(20, new Text("P2"), prevButton, nextButton);

        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 300, 250);
        p2Stage.setScene(scene);
        return scene;
    }

    public void initializeP3() {
        P3 p3 = new P3();
        p3Scene = p3.createP3UI(this::handleBack);
        p2Stage.setScene(p3Scene);
        p3.setP3Stage(p2Stage);
    }

    void handleBack() {
        p2Stage.setScene(p1Scene);
    }
}
