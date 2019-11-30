import java.io.*;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FileIO f = new FileProperties();
		try {
			f.readFromFile("D:\\Dev\\JavaDesignPattern\\Chapter2\\src\\file.txt");
			f.setValue("year", "2000");
			f.setValue("month", "11");
			f.setValue("day", "20");
			f.writeToFile("D:\\Dev\\JavaDesignPattern\\Chapter2\\src\\newfile.txt");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
