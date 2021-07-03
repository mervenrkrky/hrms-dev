package kodlamaio.hrms1.core.utilities.result;

public class SuccessResult extends Result{

	SuccessResult() {
		super(true);
	
	}
	SuccessResult(String message) {
		super(true,message);
	
	}

}
