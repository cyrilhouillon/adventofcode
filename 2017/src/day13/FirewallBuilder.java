package day13;

import static day13.Layer.emptyLayer;
import static java.util.Arrays.asList;
import static java.util.Arrays.fill;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirewallBuilder {

	public Firewall parse(String input) {
		
		String regex="(\\d+): (\\d+)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		
		int lastIndex = 0;
		Map<Integer, Layer> layers = new HashMap<>();
		
		while(matcher.find()){
			Integer index = Integer.valueOf(matcher.group(1));
			Layer layer = new Layer(Integer.valueOf(matcher.group(2)));
			layers.put(index, layer);
			if(index > lastIndex){
				lastIndex = index;
			}
		}
		
		Layer[] firewall = new Layer[lastIndex+1];
		fill(firewall, emptyLayer);
	
		layers.entrySet().forEach(e -> firewall[e.getKey()]= e.getValue());
		
		return new Firewall(asList(firewall));
	}

}
