package GolfioPackage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;

public class Ball {
    private Double xPos;
    private Double yPos;
    private int height;
    private int width;
    ImageView ballView;

    public Ball(Double xPos, Double yPos, int height, int width) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.height = height;
        this.width = width;
    }

    public void initialiseBall(Image ball) {
        ballView = new ImageView(ball);
        ballView.setX(xPos);
        ballView.setY(yPos);
        ballView.setFitHeight(height);
        ballView.setFitWidth(width);
        ballView.setPreserveRatio(true);
    }

    public ImageView getView() {
        return ballView;
    }
}
