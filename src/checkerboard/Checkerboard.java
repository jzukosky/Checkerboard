/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author jonahzukosky
 */
public class Checkerboard extends Application {
    
    private int numRows;
    private int numColumns;
    
    private double boardWidth;
    private double boardHeight;
    
    private final Color DEFAULT_DARK = Color.BLACK;
    private final Color DEFAULT_LIGHT = Color.RED;
    
    private Color darkColor;
    private Color lightColor;
    
    public void Checkerboard(int numRows,int numColumns,double boardWidth, double boardHeight){
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
    }
    
    public void Checkerboard(int numRows,int numColumns,double boardWidth,double boardHeight,Color darkColor,Color lightColor){
        this.darkColor = darkColor;
        this.lightColor = lightColor;
        
        Checkerboard(numRows,numColumns,boardWidth,boardHeight);
    }
    
    
    
    public AnchorPane build(){
        //Builds the board UI and returns an AnchorPane
        AnchorPane anchorPane = new AnchorPane();
        
        
        return anchorPane;
    }
    
    public AnchorPane getBoard(){
       //returns the AnchorPane generated by build() or null if one hasn’t been built yet.
       AnchorPane anchorPane = build();
       
       
       return anchorPane;
    }
    
        public int getNumRows() {
        return numRows;
    }

    public int getNumColumns() {
        return numColumns;
    }

    public double getBoardWidth() {
        return boardWidth;
    }

    public double getBoardHeight() {
        return boardHeight;
    }

    public Color getDarkColor() {
        return darkColor;
    }

    public Color getLightColor() {
        return lightColor;
    }
    
    
    @Override
    public void start(Stage stage) throws Exception {  
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CheckerboardFXML.fxml"));
        Parent root = loader.load();
        Startable controller = loader.getController();
        
        
        
        controller.start(stage);
       
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
