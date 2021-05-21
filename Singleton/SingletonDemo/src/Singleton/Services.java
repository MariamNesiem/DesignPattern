package Singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Services {
	private String[] strings= {"A","B","C"};
	private List<String> service =Arrays.asList(strings);
    private static Services Services;

private Services() {
	System.out.println("Object Created");
	Collections.shuffle(service);
	for(String s:service) {
	System.out.print(s.toString() +" ");
	}
	System.out.println();
}


public static Services getServices() {
	if(Services == null) {
		Services=new Services();
	}
	return Services;
}

}
