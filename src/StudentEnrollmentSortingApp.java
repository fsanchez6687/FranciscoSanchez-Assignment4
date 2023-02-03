import java.io.FileNotFoundException;
import java.io.IOException;

public class StudentEnrollmentSortingApp {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
	SplitStudentService splitStudents = new SplitStudentService();
		
		splitStudents.generateStudentCSVReports();


	}

}
