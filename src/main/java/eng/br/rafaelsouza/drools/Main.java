package eng.br.rafaelsouza.drools;

import java.io.PrintStream;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 *
 * @author Rafael Souza
 */
public class Main {
	
	 public void go(PrintStream out) {
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();

        KieSession kSession = kContainer.newKieSession("ksession1");
        kSession.setGlobal("out", out);
        kSession.insert(new Match(new Team("Inter", 30), new Team("Gremio", 10), 4, 1));
        kSession.fireAllRules();
    }


    public static void main(String[] args) {
        new Main().go(System.out);
    }
	
}
