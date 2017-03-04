package pl.lodz.uni.math.java;

public class TeachingConstructor extends BaseConstructor implements GlobalConstructor {
	public OtherConstructor other;

	public TeachingConstructor(int x) {
		System.out.println("Block A");
	};

	public TeachingConstructor() {
		System.out.println("Block B");
		other = new OtherConstructor();
	};

	{
		System.out.println("Block C");
	}

	static {
		System.out.println("Block D");
	}

	public void coolFunction() {
	}

}
