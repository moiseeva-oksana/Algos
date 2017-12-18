package exam_part_2;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TaskTest {

    private Task task = new Task();

    @Test
    public void longestSubstring() throws Exception {
        Set<String> set = new HashSet<>();
        set.add("ATGCTTATCGGT");
        set.add("TATTGCTTCATGG");
        set.add("CGCTATGCTTTCA");
        assertThat(task.longestSubstring(set), is("TGCTT"));
        set.add("GCC");
        assertThat(task.longestSubstring(set), is("GC"));
    }

}