package oopConcepts.dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysVsCollections {
    public static void main(String[] args) {

        // If the task is to store 4 colors: red, blue, green, yellow
        String[] colors1 = new String[4];    //create an array with the capacity of 4 elements
        colors1[0] = "Red";
        colors1[1] = "Black";
        colors1[2] = "Yellow";
        colors1[3] = "White";

        System.out.println("colors1 = " + Arrays.toString(colors1));


        // what if my color numbers may change, then where to store?
        List<String> colorsList = new ArrayList<>();
        colorsList.add("yellow");
        colorsList.add("black");
        colorsList.add("red");
        colorsList.add("white");

        System.out.println("colorsList = " + colorsList);

        List<String> colorsArray = new ArrayList<>();
        colorsArray.add("yellow");
        colorsArray.add("black");
        colorsArray.add("red");
        colorsArray.add("white");

        System.out.println("colorsArray = " + colorsArray);


    }
}
