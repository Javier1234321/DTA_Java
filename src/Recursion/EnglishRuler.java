package Recursion;

public class EnglishRuler {
    public static void drawRuler(int nlnches, int majorLenght){
        drawLine(majorLenght,0);
        for (int j=1;j<=nlnches;j++){
            drawInterval(majorLenght-1);
            drawLine(majorLenght,j);
        }
    }
    private static void drawInterval(int centralLength){
        if (centralLength>=1){
            drawInterval(centralLength-1);
            drawLine(centralLength);
            drawInterval(centralLength-1);
        }
    }
    private static void drawLine(int tickLength, int tickLabel){
        for (int j=0; j<tickLength;j++){
            System.out.print("-");
        }
        if (tickLabel>=0){
            System.out.print(" "+tickLabel);
        }
        System.out.println("\n");
    }
    private static void drawLine(int tickLength){
        drawLine(tickLength,-1);
    }

    public static void main(String[] args) {
        drawRuler(4,3);
    }
}
