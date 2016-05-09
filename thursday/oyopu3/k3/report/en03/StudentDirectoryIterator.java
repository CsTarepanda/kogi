import java.util.Iterator;

public class StudentDirectoryIterator implements Iterator{
  private StudentDirectory studentDirectory;
  private int index;
  public StudentDirectoryIterator(StudentDirectory studentDirectory){
    this.studentDirectory = studentDirectory;
  }

  @Override
  public boolean hasNext(){
    return this.index < this.studentDirectory.getLength();
  }

  @Override
  public Object next(){
    return this.studentDirectory.getStudentAt(this.index++);
  }
}
