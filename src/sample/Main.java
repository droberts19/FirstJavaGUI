package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import java.awt.Image;

public class Main extends Application {

    private boolean phillyPic;
    private boolean chicagoPic;
    private boolean laPic;
    private boolean nycPic;
    private boolean seattlePic;

    public void displayImages(Graphics g) {

        ImageIcon a = new ImageIcon("philly.png");
        Image Philly = a.getImage();
        int x = 0;
        int y = 50;
        if (phillyPic = true) {
            g.drawImage(Philly, x, y, 500, 240, null);
        }

        ImageIcon b = new ImageIcon("chicago.jpg");
        Image Chicago = b.getImage();
        if (chicagoPic = true) {
            g.drawImage(Chicago, x, y, 500, 333, null);
        }

        ImageIcon c = new ImageIcon("LA.jpg");
        Image LA = c.getImage();
        //g.drawImage(LA, x, y, 500, 225, null);

        ImageIcon d = new ImageIcon("NYC.jpeg");
        Image NYC = d.getImage();
        //g.drawImage(NYC, x, y, 500, 263, null);

        ImageIcon e = new ImageIcon("seattle.jpg");
        Image Seattle = e.getImage();
        //g.drawImage(Seattle, x, y, 500, 333, null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Image Slide Show");

        displayImages();

        ToggleGroup group = new ToggleGroup();
        RadioButton phillyPic = new RadioButton("Philly");
        phillyPic.setToggleGroup(group);
        phillyPic.setSelected(false);
        phillyPic.setOnAction(e->{
                    System.out.println("phillyPic action happened");
                }
        );
        RadioButton chicagoPic = new RadioButton("Chicago");
        chicagoPic.setToggleGroup(group);
        chicagoPic.setSelected(false);
        chicagoPic.setOnAction(e->{
                    System.out.println("chicagoPic action happened");
                }
        );
        RadioButton laPic = new RadioButton("LA");
        laPic.setToggleGroup(group);
        laPic.setSelected(false);
        laPic.setOnAction(e->{
                    System.out.println("laPic action happened");
                }
        );
        RadioButton nycPic = new RadioButton("NYC");
        nycPic.setToggleGroup(group);
        nycPic.setSelected(false);
        nycPic.setOnAction(e->{
                    System.out.println("nycPIC action happened");
                }
        );
        RadioButton seattlePic = new RadioButton("Seattle");
        seattlePic.setToggleGroup(group);
        seattlePic.setSelected(false);
        seattlePic.setOnAction(e->{
                    System.out.println("seattlePic action happened");
                }
        );


        VBox layout = new VBox();
        layout.getChildren().add(phillyPic);
        layout.getChildren().add(chicagoPic);
        layout.getChildren().add(laPic);
        layout.getChildren().add(nycPic);
        layout.getChildren().add(seattlePic);

        primaryStage.setScene(new Scene(layout, 500, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
