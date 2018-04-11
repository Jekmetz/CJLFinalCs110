import java.awt.Color;

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

    imgUtils.display();

  }
}
