package day12;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdjacenceListLineParser {

	public AdjacenceListLine parse(String input) {
		String regex= "^(\\d+) <-> (\\d+(, \\d+)*)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		matcher.find();
		
		String head = matcher.group(1);
		List<String> connected = Arrays.asList(matcher.group(2).split(", "));
		return new AdjacenceListLine(head, connected);
	}

}
