package retailstore;

public class App {

	public static void main(String[] args) {

		CellPhone c1 = new CellPhone("iPhone", "6s", 2015, "ZH678KLO9");
		CellPhone c2 = new CellPhone("Samsung", "s5", 2015, "6GH45JJJKK");
		CellPhone c3 = new CellPhone("Huawei", "Wuau", 2014, "KKK4545KJW");

		c1.print();
		c2.print();
		c3.print();

	}

}
