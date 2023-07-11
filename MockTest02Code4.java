package in.ineuron.com;
interface Drawable{
	void draw();
}

class Circular implements Drawable{
	public void draw() {
		System.out.println("Draw Circle");
	}
}
class Rectangular implements Drawable{
	public void draw() {
		System.out.println("Draw Rectangle");
	}
}
public class MockTest02Code4 {

	public static void main(String[] args) {
		Drawable c = new Circular();
		Drawable r = new Rectangular();
		c.draw();
		r.draw();
	}

}
