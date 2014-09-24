
/* First created by JCasGen Tue Sep 23 18:02:07 EDT 2014 */

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
public class stringN_Type extends Annotation_Type {
  /**  
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /**  */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (stringN_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = stringN_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new stringN(addr, stringN_Type.this);
  			   stringN_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new stringN(addr, stringN_Type.this);
  	  }
    };
  /**  */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = stringN.typeIndexID;
  /**  
      */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("stringN");
 
  /**  */
  final Feature casFeat_Begin;
  /**  */
  final int     casFeatCode_Begin;
  /** 
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getBegin(int addr) {
        if (featOkTst && casFeat_Begin == null)
      jcas.throwFeatMissing("Begin", "stringN");
    return ll_cas.ll_getIntValue(addr, casFeatCode_Begin);
  }
  /** 
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setBegin(int addr, int v) {
        if (featOkTst && casFeat_Begin == null)
      jcas.throwFeatMissing("Begin", "stringN");
    ll_cas.ll_setIntValue(addr, casFeatCode_Begin, v);}
    
  
 
  /**  */
  final Feature casFeat_End;
  /**  */
  final int     casFeatCode_End;
  /** 
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public int getEnd(int addr) {
        if (featOkTst && casFeat_End == null)
      jcas.throwFeatMissing("End", "stringN");
    return ll_cas.ll_getIntValue(addr, casFeatCode_End);
  }
  /** 
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setEnd(int addr, int v) {
        if (featOkTst && casFeat_End == null)
      jcas.throwFeatMissing("End", "stringN");
    ll_cas.ll_setIntValue(addr, casFeatCode_End, v);}
    
  
 
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
      jcas.throwFeatMissing("Sentence", "stringN");
    return ll_cas.ll_getStringValue(addr, casFeatCode_Sentence);
  }
  /** 
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setSentence(int addr, String v) {
        if (featOkTst && casFeat_Sentence == null)
      jcas.throwFeatMissing("Sentence", "stringN");
    ll_cas.ll_setStringValue(addr, casFeatCode_Sentence, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * 
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public stringN_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Begin = jcas.getRequiredFeatureDE(casType, "Begin", "uima.cas.Integer", featOkTst);
    casFeatCode_Begin  = (null == casFeat_Begin) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Begin).getCode();

 
    casFeat_End = jcas.getRequiredFeatureDE(casType, "End", "uima.cas.Integer", featOkTst);
    casFeatCode_End  = (null == casFeat_End) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_End).getCode();

 
    casFeat_Sentence = jcas.getRequiredFeatureDE(casType, "Sentence", "uima.cas.String", featOkTst);
    casFeatCode_Sentence  = (null == casFeat_Sentence) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Sentence).getCode();

  }
}



    