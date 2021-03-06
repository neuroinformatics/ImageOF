package behavior.setup.dialog;

import behavior.setup.Program;
import behavior.setup.dialog.DialogManager;

public class BTDialogManager extends DialogManager{

	public BTDialogManager(Program program, int type, int allCage) {
		super(program, type, allCage);
		//this.program = program;
		//TrialNumberの設定を追加
		setSubjectDialog(new BTSubjectDialogPanel(this, allCage));
		setParameterDialog(new BTParameterDialog(this, allCage));
		//MainArea,GoalAreaを設定
		setSetCageDialog(new BTSetCageDialogPanel(this, allCage));
	}
}
