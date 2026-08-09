package com.example.view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class P3 {

    Stage p3Stage;
    // Scene p1Scene, p2Scene, p3Scene;

    public Stage getP3Stage() {
        return p3Stage;
    }

    public void setP3Stage(Stage p3Stage) {
        this.p3Stage = p3Stage;
    }

    public Scene createP3UI(Runnable back) {
        Button prevButton = new Button("Back btn");
        prevButton.setOnAction(e -> back.run());

        VBox vbox = new VBox(20, new Text("P3"), prevButton);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 300, 250);
        return scene;
    }

}
