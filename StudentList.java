import java.io.*;
import java.text.*;
import java.util.*;
import static java.lang.Math.*;

public class StudentList {
	public static void main(String[] args) {
			if (args.length == 0) {
				System.out.println("please, put a argument!");
			}
			else if (args[0].equals("a")) {
				System.out.println("Loading data ...");
				try {
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(
									new FileInputStream("students.txt")));
					String names = reader.readLine();
					String[] studentName = names.split(",");
					for (String student : studentName) {
						System.out.println(student);
					}
				} catch (Exception ignored) {

				}
				System.out.println("Data Loaded.");
			} else if (args[0].equals("r")) {
				System.out.println("Loading data ...");
				try {
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(
									new FileInputStream("students.txt")));
					String students = reader.readLine();
					String[] student = students.split(",");
					double num = Math.random() * student.length;
					int ranNum = (int) num;
					System.out.println(student[ranNum]);
				} catch (Exception ignored) {
				}
				System.out.println("Data Loaded.");
			} else if (args[0].contains("+")) {
				System.out.println("Loading data ...");
				try {
					BufferedWriter s = new BufferedWriter(
							new FileWriter("students.txt", true));
					String t = args[0].substring(1);
					Date d = new Date();
					String df = "dd/mm/yyyy-hh:mm:ss a";
					DateFormat dateFormat = new SimpleDateFormat(df);
					String fd = dateFormat.format(d);
					s.write(", " + t + "\nList last updated on " + fd);
					s.close();
				} catch (Exception ignored) {
				}
				System.out.println("Data Loaded.");
			} else if (args[0].contains("?")) {
				System.out.println("Loading data ...");
				try {
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(
									new FileInputStream("students.txt")));
					String students = reader.readLine();
					String student[] = students.split(",");
					boolean done = false;
					String name = args[0].substring(1);
					for (int idx = 0; idx < student.length && !done; idx++) {
						if (student[idx].equals(name)) {
							System.out.println("We found it!");
							done = true;
						}
					}
				} catch (Exception ignored) {
				}
				System.out.println("Data Loaded.");
			} else if (args[0].contains("c")) {
				System.out.println("Loading data ...");
				try {
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(
									new FileInputStream("students.txt")));
					String students = reader.readLine();
					char student[] = students.toCharArray();
					boolean in_word = false;
					int count = 0;
					for (char c : student) {
						if (c == 'L') {
							if (!in_word) {
								count++;
								in_word = true;
							}
						}
					}
					System.out.println(count + " word(s) found " + student.length);
				} catch (Exception ignored) {
				}
				System.out.println("Data Loaded.");
			}
			else
				System.out.println("please put a valid argument! like: ");
		}
}