package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class Main extends Application {

    private boolean phillyPic2 = true;
    private boolean chicagoPic2 = false;
    private boolean laPic2 = false;
    private boolean nycPic2 = false;
    private boolean seattlePic2 = false;

    private Image phillyImage;
    private Image chicagoImage;
    private Image laImage;
    private Image nycImage;
    private Image seattleImage;

    private ImageView myImageView;

    public void displayImages() {

        if (phillyPic2 = true) {
            myImageView.setImage(phillyImage);
        }

        if (chicagoPic2 = true) {
            myImageView.setImage(chicagoImage);
        }

        if (laPic2 = true) {
            myImageView.setImage(laImage);
        }

        if (nycPic2 = true) {
            myImageView.setImage(nycImage);
        }

        if (seattlePic2 = true) {
            myImageView.setImage(seattleImage);
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Image Slide Show");

        phillyImage = new Image("philly.png");
        myImageView = new ImageView(phillyImage);
        chicagoImage = new Image("chicago.jpg");
        laImage = new Image("LA.jpg");
        nycImage = new Image("NYC.jpeg");
        seattleImage = new Image("seattle.jpg");


        ToggleGroup group = new ToggleGroup();
        RadioButton phillyPic = new RadioButton("Philly");
        phillyPic.setToggleGroup(group);
        phillyPic.setSelected(true);
        phillyPic.setOnAction(e->{
                    System.out.println("phillyPic action happened");
                    phillyPic2 = true;
                    chicagoPic2 = false;
                    laPic2 = false;
                    nycPic2 = false;
                    seattlePic2 = false;
                    displayImages();
                }
        );
        RadioButton chicagoPic = new RadioButton("Chicago");
        chicagoPic.setToggleGroup(group);
        chicagoPic.setSelected(false);
        chicagoPic.setOnAction(e->{
                    System.out.println("chicagoPic action happened");
                    phillyPic2 = false;
                    chicagoPic2 = true;
                    laPic2 = false;
                    nycPic2 = false;
                    seattlePic2 = false;
                    displayImages();
                }
        );
        RadioButton laPic = new RadioButton("LA");
        laPic.setToggleGroup(group);
        laPic.setSelected(false);
        laPic.setOnAction(e->{
                    System.out.println("laPic action happened");
                    phillyPic2 = false;
                    chicagoPic2 = false;
                    laPic2 = true;
                    nycPic2 = false;
                    seattlePic2 = false;
                    displayImages();
                }
        );
        RadioButton nycPic = new RadioButton("NYC");
        nycPic.setToggleGroup(group);
        nycPic.setSelected(false);
        nycPic.setOnAction(e->{
                    System.out.println("nycPIC action happened");
                    phillyPic2 = false;
                    chicagoPic2 = false;
                    laPic2 = false;
                    nycPic2 = true;
                    seattlePic2 = false;
                    displayImages();
                }
        );
        RadioButton seattlePic = new RadioButton("Seattle");
        seattlePic.setToggleGroup(group);
        seattlePic.setSelected(false);
        seattlePic.setOnAction(e->{
                    System.out.println("seattlePic action happened");
                    phillyPic2 = false;
                    chicagoPic2 = false;
                    laPic2 = false;
                    nycPic2 = false;
                    seattlePic2 = true;
                    displayImages();
                }
        );

        VBox layout = new VBox();
        layout.getChildren().add(phillyPic);
        layout.getChildren().add(chicagoPic);
        layout.getChildren().add(laPic);
        layout.getChildren().add(nycPic);
        layout.getChildren().add(seattlePic);
        layout.getChildren().add(myImageView);

        primaryStage.setScene(new Scene(layout, 500, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
