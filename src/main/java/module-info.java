module Tetris {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.media;
    exports tetris;
    exports tetris.controllers;
    exports tetris.Helper;
    opens tetris.controllers to javafx.fxml;
    opens tetris.fxml to javafx.fxml;

}