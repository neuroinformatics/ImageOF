package behavior.plugin;

import behavior.plugin.executer.BTExecuter;

public class BTOnline extends BehaviorEntryPoint {
	public void run (String args0) {
		//Cage数は1で固定する
		new BTExecuter().run();
	}
}