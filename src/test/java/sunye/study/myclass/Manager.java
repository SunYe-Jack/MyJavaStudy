package sunye.study.myclass;

public class Manager extends Employee{
	
	private Integer bonus;

	public Integer getBonus() {
		return bonus;
	}

	public void setBonus(Integer bonus) {
		this.bonus = bonus;
	}
	
	public Integer getSalary() {
		
		if (bonus == null) {
			
			return super.getSalary();
		}
		
		return bonus + super.getSalary();
	}

}
