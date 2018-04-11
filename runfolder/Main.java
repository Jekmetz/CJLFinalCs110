import java.awt.Color;

class Main {
  public static void main(String[] args){
    EmojiLookupTable.buildLookupTable();

    ImageUtils imgUtils = new ImageUtils();
    Color[][] defaultImageSrc = imgUtils.loadImage("./assets/LennaCV.png");

    imgUtils.addImage(ImageUtils.cloneArray(defaultImageSrc), "Default");

    Color[][] mosaicImage = Emojify.mosaicTest( 5, ImageUtils.cloneArray(defaultImageSrc) );
    imgUtils.addImage(mosaicImage, "Mosaic Test");

    Color[][] emojiImage = Emojify.emojify( 5, ImageUtils.cloneArray(defaultImageSrc) );
    imgUtils.addImage(emojiImage, "Emoji Image");

    Color[][] lowResEmojiImage = Emojify.emojify( 10, ImageUtils.cloneArray(defaultImageSrc) );
    imgUtils.addImage(lowResEmojiImage, "Low Res Emoji Image");

    Color[][] thonkImage = Emojify.emojify( 5, imgUtils.loadImage("./assets/Thonk.png") );
    imgUtils.addImage(thonkImage, "Thonk");

    Color[][] laughingImage = Emojify.emojify( 5, imgUtils.loadImage("./assets/Laughing.png") );
    imgUtils.addImage(laughingImage, "Deaf Mutes");

    Color[][] videoTest = Emojify.emojify( 8, imgUtils.loadImage("./assets/cat-with-sunglasses.jpg") );
    imgUtils.addImage(videoTest, "Cool Cat");

    Color[][] birbImage = Emojify.emojify( 8, imgUtils.loadImage("./assets/birb.jpg") );
    imgUtils.addImage(birbImage, "Mom's Spaghetti");


    imgUtils.display();

  }
}
