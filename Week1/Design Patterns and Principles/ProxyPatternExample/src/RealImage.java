public class RealImage implements Image {
    String imagePath;

    public RealImage(String imagePath) {
        this.imagePath = imagePath;
        loadImageFromServer();
    }

    private void loadImageFromServer() {
        System.out.println("Loading image from server: " + imagePath);
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + imagePath);
    }
}
