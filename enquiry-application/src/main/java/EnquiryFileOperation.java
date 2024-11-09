import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EnquiryFileOperation {
	public void writeFile(EnquiryDto dto) {

		File file = new File("Enquiry.txt");
		System.out.println("File: " + file);
		try {
			if (!file.exists()) {
				if (file.createNewFile()) {
					System.out.println("New File Created");
					addObject(dto, file);
				} else {
					addObject(dto, file);
				}

			}
			System.out.println(file.getAbsolutePath());
		} catch (IOException e) {
			System.out.println("File is not Created");
		}

//		Object obj = readObject(file);
//		System.out.println("after saving:" + obj);

	}

	private static Object readObject(File file) {
		try (FileInputStream filein = new FileInputStream(file); ObjectInputStream in = new ObjectInputStream(filein)) {
			System.out.println("Reading Object");
			return in.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
			return new Object();
		}
	}

	private static void addObject(EnquiryDto dto, File file) {
		try (FileOutputStream out = new FileOutputStream(file); ObjectOutputStream in = new ObjectOutputStream(out)) {
			System.out.println("Saving Object");
			in.writeObject(dto);
			System.out.println("File Length: " + file.length());
		} catch (IOException e) {
			System.out.println("File is not present");
		}

	}

}
