
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.collection.CollectionException;
import org.apache.uima.collection.CollectionReader_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.util.Progress;

public class NewCollectionReader extends CollectionReader_ImplBase {

  BufferedReader bfr =null;
  public void initialize() {
  File file = new File((String)getConfigParameterValue("inputpath"));
  try {
    bfr = new BufferedReader(new FileReader(file));
  } catch (FileNotFoundException e){ 
    e.printStackTrace();
  }
}
  @Override
  public void getNext(CAS aCAS) throws IOException, CollectionException {
    
    JCas jcas;
    try { 
      jcas = aCAS.getJCas();
    } catch (CASException e) {
      throw new CollectionException(e);
    }

    // open input stream to file
    
    try {
      String cline = bfr.readLine(); //read current line
      String cline_seg[] = cline.split(" ",2); //slit on spaces
      
      Annotated a = new Annotated(jcas); //assign to types
      
      a.setSentId(cline_seg[0]);
      a.setSentence(cline_seg[1]);
      a.addToIndexes();
     
    } catch(Exception e) {
      e.printStackTrace();
    }

  }

  @Override
  public void close() throws IOException {
    // TODO Auto-generated method stub

  }

  @Override
  public Progress[] getProgress() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean hasNext() throws IOException, CollectionException {
    // TODO Auto-generated method stub
    return bfr.ready();
  }

}
