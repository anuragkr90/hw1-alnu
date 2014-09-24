import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.uima.cas.CAS;
import org.apache.uima.cas.CASException;
import org.apache.uima.cas.FSIterator;
import org.apache.uima.collection.CasConsumer_ImplBase;
import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.resource.ResourceInitializationException;
import org.apache.uima.resource.ResourceProcessException;


public class CASConsumer extends CasConsumer_ImplBase {
  
  

  private BufferedWriter bfrw;
  @Override
  
  public void initialize() throws ResourceInitializationException {
    try {
    bfrw = new BufferedWriter(new FileWriter((String) getConfigParameterValue("outputfilename")));
    } catch (IOException e) {
    e.printStackTrace();
    }
    super.initialize();
  }
  public void processCas(CAS arg0) throws ResourceProcessException {
    // TODO Auto-generated method stub

    try {
      
      JCas jacas = arg0.getJCas();
      FSIterator iter_anno = jacas.getJFSIndexRepository().getAllIndexedFS(Annotated.type);
      
      FSIterator iter_stringN = jacas.getJFSIndexRepository().getAllIndexedFS(stringN.type);
      
      //stringN NE = ((stringN) iterator2.get());
      Annotated senta = ((Annotated) iter_anno.next());
      
      String sentid = senta.getSentId();
      
      while (iter_stringN.hasNext()) {
      stringN NE = ((stringN) iter_stringN.next());
      bfrw.write(sentid + "|" + NE.getBegin() + " " + NE.getEnd() + "|" + NE.getSentence() + '\n');
      }
      bfrw.flush();
      } catch (CASException e) {
      e.printStackTrace();
      } catch (IOException e) {
      e.printStackTrace();
      }
    
    
  }

}
