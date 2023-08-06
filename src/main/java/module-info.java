module com.game.textgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.game.textgame to javafx.fxml;
    exports com.game.textgame;
    exports com.game.textgame.controllers;
    opens com.game.textgame.controllers to javafx.fxml;
}