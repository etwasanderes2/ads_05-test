package ads.set5.airports;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ShortestFlightPathFinderTest {

    int[][] parseTestConfig(String path) {
        int[][] results = null;
        try {
            URL tmp = getClass().getResource(path);
            List<String> lines = Files.readAllLines(Paths.get(tmp.toURI()));

            results = new int[lines.size()][lines.size()];

            int i = 0;
            for (String line :lines) {
                String [] tokens = line.split(", ");
                for (int j = 0; j < tokens.length; j++) {
                    results[i][j] = Integer.parseInt(tokens[j]);
                }
                i++;
            }

        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return results;
    }

    int[] parseSolutionConfig(String path) {
        int[] results = null;
        try {
            URL tmp = getClass().getResource(path);
            List<String> lines = Files.readAllLines(Paths.get(tmp.toURI()));

            results = new int[lines.size()];

            int i = 0;
            for (String line :lines) {
                results[i] = Integer.parseInt(line);
                i++;
            }

        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return results;
    }

    @Test
    void test00() {
        int[][] input = parseTestConfig("test_00");
        int[] solution = parseSolutionConfig("solution_00");
        int[] answer = ShortestFlightPathFinder.findShortestFlightPath(input);
        assertArrayEquals(solution, answer, "Test 00 failed");
    }

    @Test
    void test01() {
        int[][] input = parseTestConfig("test_01");
        int[] solution = parseSolutionConfig("solution_01");
        int[] answer = ShortestFlightPathFinder.findShortestFlightPath(input);
        assertArrayEquals(solution, answer, "Test 01 failed");
    }

    @Test
    void test02() {
        int[][] input = parseTestConfig("test_02");
        int[] solution = parseSolutionConfig("solution_02");
        int[] answer = ShortestFlightPathFinder.findShortestFlightPath(input);
        assertArrayEquals(solution, answer, "Test 02 failed");
    }

    @Test
    void test03() {
        int[][] input = parseTestConfig("test_03");
        int[] solution = parseSolutionConfig("solution_03");
        int[] answer = ShortestFlightPathFinder.findShortestFlightPath(input);
        assertArrayEquals(solution, answer, "Test 03 failed");
    }

    @Test
    void test04() {
        int[][] input = parseTestConfig("test_04");
        int[] solution = parseSolutionConfig("solution_04");
        int[] answer = ShortestFlightPathFinder.findShortestFlightPath(input);
        assertArrayEquals(solution, answer, "Test 04 failed");
    }

    @Test
    void test05() {
        int[][] input = parseTestConfig("test_05");
        int[] solution = parseSolutionConfig("solution_05");
        int[] answer = ShortestFlightPathFinder.findShortestFlightPath(input);
        assertArrayEquals(solution, answer, "Test 05 failed");
    }

    @Test
    void test06() {
        int[][] input = parseTestConfig("test_06");
        int[] solution = parseSolutionConfig("solution_06");
        int[] answer = ShortestFlightPathFinder.findShortestFlightPath(input);
        assertArrayEquals(solution, answer, "Test 06 failed");
    }

    @Test
    void test07() {
        int[][] input = parseTestConfig("test_07");
        int[] solution = parseSolutionConfig("solution_07");
        int[] answer = ShortestFlightPathFinder.findShortestFlightPath(input);
        assertArrayEquals(solution, answer, "Test 07 failed");
    }
}