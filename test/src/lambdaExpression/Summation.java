package lambdaExpression;

@FunctionalInterface
public interface Summation {
	public abstract void sum(int a,int b);
	public  default void sub(int x,int y) {
		System.out.println(x-y);
	}

}
