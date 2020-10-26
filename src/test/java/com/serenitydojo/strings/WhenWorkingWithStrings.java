package com.serenitydojo.strings;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithStrings {
    /**
     * Adding strings together
     */
    @Test
    public void addingStringsTogether() {

        var colorA = "red";
        var colorB = "green";
        var colorC = "blue";

        // TODO: turn these values into a comma separated list
        var result = String.format("%s,%s,%s", colorA, colorB, colorC);

        assertThat(result).isEqualTo("red,green,blue");
    }

    /**
     * Take two strings (e.g. Duck, Orange) and return them in reverse order, separated by spaces
     */
    @Test
    public void reverseAPairOfStrings() {

        var result = reverse("Duck", "Orange");
        assertThat(result).isEqualTo("Orange Duck");
    }

    @Test
    public void reverseAListOfStrings() {
        var result = reverseList("Duck", "Orange");
        assertThat(result).containsExactly("Orange","Duck");
    }

    private String reverse(String... values) {
        StringBuilder result = new StringBuilder();
        int lastIndexValue = values.length - 1;
        for(int i = lastIndexValue; i>=0;i--){
            result.append(values[i]).append(" ");
        }
        return result.toString().trim();
    }

    private List<String> reverseList(String... values) {
        List<String> reverseList = Arrays.asList(values);
        Collections.reverse(reverseList);

        return reverseList;
    }

    /**
     * Convert a list of words into capitalised form
     */
    @Test
    public void capitaliseWords() {

        var result = capitalise("RED", "green","BluE");
        assertThat(result).isEqualTo("Red Green Blue");
    }

    private String capitalise(String... words) {
        StringBuilder result = new StringBuilder();
        for(String word :words){
            String firstCapitalLetter = word.substring(0,1).toUpperCase();
            String nextLowerLetters = word.substring(1).toLowerCase();
            result.append(firstCapitalLetter).append(nextLowerLetters).append(" ");
        }

        return result.toString().trim();
    }

    /**
     * Replace all of the red shirts by orange shirts
     */
    @Test
    public void colourSwitch() {
        List<String> colouredShirts = List.of("red shirt", "light red shirt", "blue shirt", "green shirt");

        List<String> updatedShirts = new ArrayList<>();
        for(String shirt : colouredShirts){
            updatedShirts.add(shirt.replace("red", "orange"));
        }

        assertThat(updatedShirts).containsExactly("orange shirt", "light orange shirt", "blue shirt", "green shirt");
    }

    /**
     * Find all the string values that contain red (reguardless of case)
     */
    @Test
    public void colourFilter() {
        List<String> terms = List.of("red", "Light Red", "Orange-red wash", "green","ruby red", "blue");

        List<String> reds = new ArrayList<>();
        for(String term:terms){
            if(term.toLowerCase().contains("red"))
                reds.add(term);
        }

        assertThat(reds).containsExactly("red", "Light Red", "Orange-red wash", "ruby red");
    }

    //
    // Using the Collections utility class
    //
    @Test
    public void sortingElementsInAList() {
        List<String> terms = List.of("red", "yellow", "orange", "green","ruby red", "blue");

        List<String> sortedTerms = new ArrayList<>(terms);

        Collections.sort(sortedTerms);

        assertThat(sortedTerms).containsExactly("blue", "green", "orange", "red", "ruby red", "yellow");

    }

    @Test
    public void replacingElements() {
        List<String> terms = List.of("red", "yellow", "orange", "green","ruby red", "blue");

        List<String> sortedTerms = new ArrayList<>(terms);

       Collections.replaceAll(sortedTerms,"yellow","beige");

        assertThat(sortedTerms).containsExactly("red", "beige", "orange", "green","ruby red", "blue");

    }


    @Test
    public void findingMaximumAndMinimums() {
        List<Integer> numbers = List.of(10,20,30,40,50);

        // FIXME
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        assertThat(max).isEqualTo(50);
        assertThat(min).isEqualTo(10);

    }
}
