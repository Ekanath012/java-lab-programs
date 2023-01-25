import java.io.File;
import java.util.*;
public class FileOp {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the file name:");
		String fname=in.next();
		File f=new File(fname);
		f.setWritable(true);
		System.out.println(f.exists()?"File Exists":"File does not exists");
		System.out.println(f.canWrite()?"File is Writable":"File is not writeable");
		System.out.println(f.canRead()?"File is readable":"File is not readable");
		String filename=f.toString();
		int index=filename.lastIndexOf('.');
		if(index>0){
			String type=filename.substring(index+1);
			System.out.println("File type is :"+type);
		}
		else
			System.out.println("File does not have type");
		System.out.println("File size:"+f.length()+"bytes");
	}
}
