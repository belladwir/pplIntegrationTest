import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class sequentialSearchTest {

    @Test
    public void testLinearSearch() {
        sequentialSearch ss = new sequentialSearch();
        assertEquals(-1,-1,ss.linerSearch2(15));
        assertEquals(-1,-1,ss.linerSearch(1));
        assertEquals(4,4,ss.linerSearch(15));
        assertEquals(0,0,ss.linerSearch(3));
    }
}