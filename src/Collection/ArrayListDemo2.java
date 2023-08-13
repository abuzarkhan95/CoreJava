package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
	List<Student> listStudent = new ArrayList<>();

	        listStudent.add(new Student(121,"Sufiyan","BCA"));
	        listStudent.add(new Student(122,"abuzar","BCA"));
	        listStudent.add(new Student(123,"anzar","BCA"));
	        listStudent.add(new Student(124,null,null));
	        listStudent.add(new Student(125,"Sufiyan","BCA"));
	        for (Student student : listStudent) {
			System.out.println(student);	
			}
	}

}
