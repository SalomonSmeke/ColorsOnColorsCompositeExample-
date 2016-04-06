
public class Demo {
	public static void main(String[] args) {
		Color a = new Color("fff",5);
		a.generateChildren("000");
		a = (Color)a.getChildren().get(1).dumpParent(a);
		a.generateChildren("600050");
	}

}
