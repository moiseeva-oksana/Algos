package chapter17;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Task15Test {

    private Task15 task = new Task15();

    @Test
    public void biggerWord() throws Exception {
        List<String> words = Arrays.asList("cat", "banana", "dog", "walker", "dogwalker", "walker", "walk");
        assertThat(task.biggestComplicatedWord(words), is("dogwalker"));

        words = Arrays.asList("cat", "banana", "dog", "walker", "dogwalker", "walker", "walk", "catanddogwalker");
        assertThat(task.biggestComplicatedWord(words), is("catanddogwalker"));
    }

}