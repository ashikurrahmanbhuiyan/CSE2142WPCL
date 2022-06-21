import java.io.*;
import java.text.*;
import java.util.*;
import static java.lang.Math.*;

public class StudentList {
	public static void main(String[] args) {
			if (args.length == 0) {
				System.out.println("please, put a argument!");
			}
			else if (args[0].equals("c")) {
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
					BufferedReader s = new BufferedReader(
							new InputStreamReader(
									new FileInputStream("students.txt")));
					String r = s.readLine();
					String[] i = r.split(",");
					double z = Math.random() * i.length;
					int y = (int) z;
					System.out.println(i[y]);
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
					BufferedReader s = new BufferedReader(
							new InputStreamReader(
									new FileInputStream("students.txt")));
					String r = s.readLine();
					String i[] = r.split(",");
					boolean done = false;
					String t = args[0].substring(1);
					for (int idx = 0; idx < i.length && !done; idx++) {
						if (i[idx].equals(t)) {
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
					BufferedReader s = new BufferedReader(
							new InputStreamReader(
									new FileInputStream("students.txt")));
					String D = s.readLine();
					char a[] = D.toCharArray();
					boolean in_word = false;
					int count = 0;
					for (char c : a) {
						if (c == 'L') {
							if (!in_word) {
								count++;
								in_word = true;
							}
						}
					}
					System.out.println(count + " word(s) found " + a.length);
				} catch (Exception ignored) {

				}
				System.out.println("Data Loaded.");
			}
			else
				System.out.println("please put a valid argument! like: ");
		}
}