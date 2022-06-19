package at.campus02.iwi.pictures;

public class PicturesApp {

    public static void main(String[] args) {

        Picture picture = new Picture();

        picture.length = 5;
        picture.width = 4;

        System.out.println(picture.totalPixels());
        System.out.println(picture.totalSize(10));
        System.out.println(picture.scale(2));
    }
}
