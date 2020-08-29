package LanguageBasics;

public class NestedForLoop {
    public static void main(String[] args) {
        for( int x = 0; x<3; x++) {
            for(int y = 0; y < 2; y++) {
              System.out.println(x + ", "+y);
            }
        }   
    }
}