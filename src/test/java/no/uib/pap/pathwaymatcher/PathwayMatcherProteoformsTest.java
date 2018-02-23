package no.uib.pap.pathwaymatcher;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.google.common.io.Files;

public class PathwayMatcherProteoformsTest {

    @Test
    public void insulinTest() throws IOException{
        String[] args = {"-t", "proteoforms",
                "-i", "resources/input/Proteoforms/Simple/Insulin.txt",
                "-o", "output/",
                "-tlp"};
        PathwayMatcher.main(args);

        //Check the output file
        List<String> search = Files.readLines(new File("output/search.csv"), Charset.defaultCharset());
        assertEquals(173, search.size());

        List<String> analysis = Files.readLines(new File("output/analysis.csv"), Charset.defaultCharset());
        assertEquals(23, analysis.size());
    }

    @Test
    public void insulinWithMODTest() throws IOException{
        String[] args = {"-t", "proteoforms",
                "-i", "resources/input/Proteoforms/Simple/InsulinWithMOD.txt",
                "-o", "output/",
                "-tlp"};
        PathwayMatcher.main(args);

        List<String> search = Files.readLines(new File("output/search.csv"), Charset.defaultCharset());
        assertEquals(173, search.size());

        List<String> analysis = Files.readLines(new File("output/analysis.csv"), Charset.defaultCharset());
        assertEquals(23, analysis.size());
    }

    @Test
    public void allProteoformsTest() throws IOException{
        String[] args = {"-t", "proteoforms",
                "-i", "resources/input/ReactomeAllProteoformsSimple.csv",
                "-o", "output/",
                "-tlp"};
        PathwayMatcher.main(args);

        List<String> search = Files.readLines(new File("output/search.csv"), Charset.defaultCharset());
        assertEquals(441276, search.size());

        List<String> analysis = Files.readLines(new File("output/analysis.csv"), Charset.defaultCharset());
        assertEquals(1966, analysis.size());
    }

}