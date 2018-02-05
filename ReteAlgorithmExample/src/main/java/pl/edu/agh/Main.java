package pl.edu.agh;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class Main {
	public static void main(String[] args) {
        try {
            KieServices ks = KieServices.Factory.get();
            KieContainer kContainer = ks.getKieClasspathContainer();
            KieSession kSession = kContainer.newKieSession("ksession-rules");

            Person teenager = new Person(15, 200.0, "beer");
            Person student = new Person(20, 0.0, "beer");
            Person thoughtfulStudent = new Person(20, 20.0, "beer");
            Person juniorDeveloper = new Person(22, 1000.0, "iPhone X");
            Person seniorDeveloper = new Person(30, 10000000.0, "iPhone X");

            kSession.insert(teenager);
            kSession.insert(student);
            kSession.insert(thoughtfulStudent);
            kSession.insert(juniorDeveloper);
            kSession.insert(seniorDeveloper);

            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }

    }
}
