package javapractices;

public final class FinalUse {

	public static final String PAN;

	static {
		
		PAN = "AURPT1987M";
	}

	final long accNum = 2929492994923L;

	final long addhar;

	{
		addhar = 123455665656L;
	}

	public static void main(String[] args) {

	}

	public final void testFinalMethod() {
		System.out.println("Final method");
	}

}

//class TestFinal extends FinalUse {
//   public void testFinalMethod()
//   {
//	   
//   }

//}
