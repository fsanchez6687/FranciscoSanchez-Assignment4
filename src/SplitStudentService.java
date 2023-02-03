import java.util.Arrays;

public class SplitStudentService {


	
	private Student[] studentArr = new Student[100];
	private FileService fileService = new FileService();
	
	private void loadData (String fileName) {
		studentArr = fileService.readStudentsFromFile(fileName);
		Arrays.sort(studentArr);
	}
	
	public void generateStudentCSVReports() {
		loadData("student-master-list.csv");
		Student[] csArr = new Student[100];
		Student[] apArr = new Student[100];
		Student[] statArr = new Student[100];
		int csCtr = 0; int apCtr = 0; int statCtr = 0;
		
		for (Student s : studentArr) {
			if (s.getStudentCourse().contains("COMPSCI")) {
				csArr[csCtr++] = s;
			}
			if (s.getStudentCourse().contains("APMTH")) {
				apArr[apCtr++] = s;
			}
			if (s.getStudentCourse().contains("STAT")) {
				statArr[statCtr++] = s;
			}
		}
		// Save students to file
		fileService.writeStudentToFile(csArr, "course1.csv");
		fileService.writeStudentToFile(apArr, "course2.csv");
		fileService.writeStudentToFile(statArr, "course3.csv");
		
	}

}