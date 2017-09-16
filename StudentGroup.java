import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		int i;
		int tmpStu[50];
		if(students.length>0){
            for(i=0;i<students.length;i++)
            {
                tmpStu[i]=students[i];
            }
            return tmpStu;
		}
		else
            return null;

	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		int i;
		String tmp;
		if(students.length>0)
		{
            for(i=0;i<students.length;i++)
            {
                if(i==index)
                {
                    tmp=students[i];
                }
            }
            return tmp;
		}
		else
            return null;

	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		int i,size;
		size=students.length;
		students[size]=students[size]+1;

		int j=size;
		for(i=size;i>0;i--)
		{
            students[j-1]=students[i];
		}
		students[0]=student;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		int size;
		students.length=students.length+1;
		size=students.length;
		students[size-1]=student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		String tmp;
		int i;
		for(i=0;i<students.length;i++)
		{
            for(j=0;j<students.length;j++)
            {
                if(students[i]>students[j])
                {
                    tmp=students[i];
                    students[i]=students[j];
                    students[j]=tmp;
                }

            }
		}

	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		int i;
		String tmp1;
		if(students.length>0)
		{
            for(i=0;i<students.length;i++)
            {
                if(students[i]==student)
                {
                    tmp1=students[i+1];
                }
            }
            return tmp1;
		}
		else
            return null;
	}
}
