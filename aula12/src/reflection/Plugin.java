package reflection;

import java.io.File;
import java.util.ArrayList;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

	
abstract class PluginManager {
	public static IPlugin load(String name) throws Exception {
		Class<?> c = Class.forName(name);
		return (IPlugin) c.newInstance();
	}
}
public class Plugin {
	public static void main(String[] args) throws Exception {
		File proxyList = new File("C:/Users/Staples/Desktop/ECT/P3/aula12/src/reflection/plugins"); // relative path nao estava a funcionar
		ArrayList<IPlugin> plgs = new ArrayList<IPlugin>();
		for (String f: proxyList.list()) {
			try {
		plgs.add(PluginManager.load("reflection.plugins."+f.substring(0,f.lastIndexOf('.'))));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		Iterator<IPlugin> it = plgs.iterator();
		while (it.hasNext()) {
			it.next().fazQualQuerCoisa();
		}
	}
	
}