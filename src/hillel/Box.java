package hillel;

public class Box {
    int height;
    int length;
    int width;

    public Box(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }
    public int setBoxHeight(int heightValue) {
        return this.height = heightValue;
    }
    public int setBoxLength(int lengthValue) {
        return this.length = lengthValue;
    }
    public int setBoxWidth(int widthValue) {
        return this.width = widthValue;
    }
    public int getBoxHeight() {
        return this.height;
    }
    public int getBoxLength() {
        return this.length;
    }
    public int getBoxWidth() {
        return this.width;
    }
    public int getBoxVolume() {
        return this.height * this.length * this.width;
    }

    public static void main(String[] args){
        // 1st box
        Box firstBox = new Box(5, 5, 5);
        System.out.println("The 1st box volume is: " + firstBox.getBoxVolume());
        // 2d box
        Box secondBox = new Box(4, 4, 4);
        secondBox.setBoxHeight(7);
        System.out.println("The 2d box volume is: " + secondBox.getBoxVolume());
        // 3d box
        Box thirdBox = new Box(3, 3, 3);
        thirdBox.setBoxLength(9);
        System.out.println("The 3d box volume is: " + thirdBox.getBoxVolume());
        // 4th box
        Box fourthBox = new Box(2, 2, 2);
        System.out.println("The 4th box has: \n   height = " + fourthBox.getBoxHeight() +
                "\n   length = " + fourthBox.getBoxLength() + "\n   width = " + fourthBox.getBoxWidth());
        System.out.println("The 4th box volume is: " + secondBox.getBoxVolume());
        // 5th box
        Box fifthBox = new Box(1, 1, 1);
        fifthBox.setBoxWidth(25);
        System.out.println("The 5th box volume is: " + fifthBox.getBoxVolume());
    }
}
