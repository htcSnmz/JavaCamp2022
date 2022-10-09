package Week_3.Task_1;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{

	@Override
	public void calculate() {
		System.out.println("Öğretmen kredisi hesaplandı.");	
	}
	
	@Override
	public void save() {
		
		//can be another codes
		super.save();
		
		//can be another codes
		}
	
}
