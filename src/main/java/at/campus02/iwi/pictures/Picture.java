package at.campus02.iwi.pictures;

public class Picture {

    public int length = 0;
    public int width  = 0;


    public int totalPixels(){
        int sumPixels = 0;

        sumPixels = length * width;
        return sumPixels;
    }

    public int totalSize(int bytePerPixel){

        bytePerPixel = bytePerPixel * totalPixels();

        return bytePerPixel;
    }

    public double scale(double factor){

        double factorScale;
        width *= factor;
        length *= factor;

        factorScale = width + length;

        return factorScale;
    }

}
