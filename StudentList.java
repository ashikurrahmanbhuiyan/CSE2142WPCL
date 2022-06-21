import java.io.*;
import java.text.*;
import java.util.*;
import static java.lang.Math.*;

public class StudentList {
	public static void main(String[] args) {
			if (args.length == 0) {
				System.out.println(constant.argmuString);
			}
			else if (args[0].equals(constant.arga)) {
				System.out.println(constant.load);
				try {
					String[] studentName = Student();
					for (String student : studentName) {
						System.out.println(student);
					}
				} catch (IOException ignored) {
				}
				System.out.println(constant.loaded);
			} else if (args[0].equals(constant.argr)) {
				System.out.println(constant.load);
				try {
					String[] student = Student();
					double num = Math.random() * student.length;
					int ranNum = (int) num;
					System.out.println(student[ranNum]);
				} catch (Exception ignored) {
				}
				System.out.println(constant.loaded);
			} else if (args[0].contains(constant.plus)) {
				System.out.println(constant.load);
				try {
					BufferedWriter s = new BufferedWriter(
							new FileWriter(constant.StudentList, true));
					String t = args[0].substring(1);
					Date d = new Date();
					String df = constant.df;
					DateFormat dateFormat = new SimpleDateFormat(df);
					String fd = dateFormat.format(d);
					s.write(Br+constant.comma + t + constant.update + fd);
					s.close();
				} catch (Exception ignored) {
				}
				System.out.println(constant.loaded);
			} else if (args[0].contains(constant.argq)) {
				System.out.println(constant.load);
				try {
					String[] student = Student();
					boolean done = false;
					String name = args[0].substring(1);
					for (int idx = 0; idx < student.length && !done; idx++) {
						if (student[idx].equals(name)) {
							System.out.println(constant.found);
							done = true;
						}
					}
				} catch (Exception ignored) {
				}
				System.out.println(constant.loaded);
			} else if (args[0].contains(constant.argc)) {
				System.out.println(constant.load);
				try {
					 int count = 0;
					String[] studentName = Student();
					for (String student : studentName) {
						count++;
					 }
					System.out.println(count + constant.wordF);
				} catch (Exception ignored) {
				}
				System.out.println(constant.loaded);
			}
			else
				System.out.println(constant.argV);
		}

	private static String[] Student() throws FileNotFoundException, IOException {
		BufferedReader reader = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(constant.StudentList)));
		String names = reader.readLine();
		String[] studentName = names.split(constant.comma);
		return studentName;
	}
}