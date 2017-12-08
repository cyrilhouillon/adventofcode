package daytwo;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.summingInt;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SpreadsheetChecksumComputer {

	LineChecksumComputer lineChecksumComputer;

	public SpreadsheetChecksumComputer(LineChecksumComputer lineChecksumComputer) {
		this.lineChecksumComputer = lineChecksumComputer;
	}

	public int checksum(String spreadsheet) {
		return getLines(spreadsheet).stream()//
				.map(this::asNumberList)
				.collect(summingInt(lineChecksumComputer::lineChecksum));
	}

	private List<String> getLines(String spreadsheet) {
		return asList(spreadsheet.split("\n"));
	}
	
	private List<Integer> asNumberList(String line) {
		return Stream.of(line.split("\\s"))//
			.map(Integer::valueOf)//
			.collect(Collectors.toList());
	}


}
