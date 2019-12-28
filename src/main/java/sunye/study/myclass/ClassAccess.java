package sunye.study.myclass;

public class ClassAccess {
	
	public String pubVal = "Public access";
	protected String proVal ="Protected access";
	String noVal ="默认  access";
	private String priVal ="Private access";
	
	private void getAccess() {
		
		System.out.println(pubVal);
		System.out.println(proVal);
		System.out.println(noVal);
		System.out.println(priVal);
	}

}
