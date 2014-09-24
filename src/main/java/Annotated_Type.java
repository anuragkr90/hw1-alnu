
/* First created by JCasGen Mon Sep 22 22:07:30 EDT 2014 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Tue Sep 23 18:02:10 EDT 2014
 *  */
public class Annotated_Type extends Annotation_Type {
  /**  
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /**  */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Annotated_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Annotated_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Annotated(addr, Annotated_Type.this);
  			   Annotated_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Annotated(addr, Annotated_Type.this);
  	  }
    };
  /**  */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Annotated.typeIndexID;
  /**  
      */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("Annotated");
 
  /**  */
  final Feature casFeat_Sentence;
  /**  */
  final int     casFeatCode_Sentence;
  /** 
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSentence(int addr) {
        if (featOkTst && casFeat_Sentence == null)
      jcas.throwFeatMissing("Sentence", "Annotated");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Sentence);
  }
  /** 
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentence(int addr, String v) {
        if (featOkTst && casFeat_Sentence == null)
      jcas.throwFeatMissing("Sentence", "Annotated");
    ll_cas.ll_setStringValue(addr, casFeatCode_Sentence, v);}
    
  
 
  /**  */
  final Feature casFeat_SentId;
  /**  */
  final int     casFeatCode_SentId;
  /** 
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getSentId(int addr) {
        if (featOkTst && casFeat_SentId == null)
      jcas.throwFeatMissing("SentId", "Annotated");
    return ll_cas.ll_getStringValue(addr, casFeatCode_SentId);
  }
  /** 
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentId(int addr, String v) {
        if (featOkTst && casFeat_SentId == null)
      jcas.throwFeatMissing("SentId", "Annotated");
    ll_cas.ll_setStringValue(addr, casFeatCode_SentId, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * 
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Annotated_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Sentence = jcas.getRequiredFeatureDE(casType, "Sentence", "uima.cas.String", featOkTst);
    casFeatCode_Sentence  = (null == casFeat_Sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Sentence).getCode();

 
    casFeat_SentId = jcas.getRequiredFeatureDE(casType, "SentId", "uima.cas.String", featOkTst);
    casFeatCode_SentId  = (null == casFeat_SentId) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_SentId).getCode();

  }
}



    