import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentDirectory implements Iterable{
  private List<String> students = new ArrayList<String>();
  private int length;
  public StudentDirectory(String filename){
    try{
      BufferedReader br = new BufferedReader(new FileReader(filename));
      String line = null;
      while((line = br.readLine()) != null){
        this.students.add(line);
      }
      this.length = this.students.size();
    }catch(IOException e){
    }
  }

  public int getLength(){
    return this.length;
  }

  public String getStudentAt(int index){
    return this.students.get(index);
  }

  @Override
  public Iterator iterator(){
    return new StudentDirectoryIterator(this);
  }
}
