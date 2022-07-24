import java.io.*;
import java.util.*;
public class fileopdemo {
public static void main(String[] args) throws IOException {
	File f=new File("c:filedemo.txt");
	if(f.createNewFile()) {
		System.out.println("file created with name:" + f.getName());
	}
	else
		System.out.println("file exists");
	// file information
	System.out.println(f.getAbsolutePath());
	//write operation
	FileWriter fw= new FileWriter(f);
	fw.write("writing to the file");
	fw.close();
	//read operation
	Scanner s=new Scanner(f);
	while(s.hasNextLine()) {
		String a=s.nextLine();
		System.out.println(a);
	}
	s.close();
	//deleting a file
	if(f.delete())
	{
		System.out.println("file deleted: "+f.getName());
	}
	else
		System.out.println("deletion failed");
}
}
