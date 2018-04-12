import java.awt.Color;
import javax.imageio.*;
import java.io.*;
import java.awt.image.BufferedImage;

class pictureMain {
  public static void main(String[] args){
    EmojiLookupTable.buildLookupTable();
    ImageUtils imgUtils = new ImageUtils();
	
    Color[][] lennaDefault = imgUtils.loadImage("./assets/LennaCV.png");
    imgUtils.addImage(lennaDefault,"Default Lenna");

    Color[][] lenna = Emojify.emojify(5, imgUtils.loadImage("./assets/LennaCV.png"));
    imgUtils.addImage(lenna,"Lenna Emojified");    

    Color[][] birbImage = Emojify.emojify( 8, imgUtils.loadImage("./assets/birb.jpg") );
    imgUtils.addImage(birbImage, "Mom's Spaghetti");
	
    Color[][] bellaDefault = imgUtils.loadImage("./assets/bella.jpg");
    Color[][] bella = Emojify.emojify(5,imgUtils.cloneArray(bellaDefault));
    imgUtils.addImage(bellaDefault,"Bella");
    imgUtils.addImage(bella,"Bella!!!!!!");

    imgUtils.display();

    BufferedImage bi = ImageUtils.convertToBufferedFrom2D(bella);

	try {
		File filepath = new File(".\\bellaEmojified5.png").getCanonicalFile();
		ImageIO.write(bi, "png", filepath);
	} catch (IIOException e) {
		System.out.println("Damn it all");
	} catch (IOException e) {
		System.out.println("Damn it all again");
			
	}
  }
}
