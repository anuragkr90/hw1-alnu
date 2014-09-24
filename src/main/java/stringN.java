

/* First created by JCasGen Tue Sep 23 18:02:07 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 23 18:02:10 EDT 2014
 * XML source: /home/anurag/fall2014/11791/hw1-alnu/src/main/resources/typeSystemDescriptor.xml
 *  */
public class stringN extends Annotation {
  /** 
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(stringN.class);
  /** 
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** 
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   *  */
  protected stringN() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * 
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public stringN(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** 
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public stringN(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public stringN(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   *  modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Begin

  /** getter for Begin - gets 
   * 
   * @return value of the feature 
   */
  public int getBegin() {
    if (stringN_Type.featOkTst && ((stringN_Type)jcasType).casFeat_Begin == null)
      jcasType.jcas.throwFeatMissing("Begin", "stringN");
    return jcasType.ll_cas.ll_getIntValue(addr, ((stringN_Type)jcasType).casFeatCode_Begin);}
    
  /** setter for Begin - sets  
   * 
   * @param v value to set into the feature 
   */
  public void setBegin(int v) {
    if (stringN_Type.featOkTst && ((stringN_Type)jcasType).casFeat_Begin == null)
      jcasType.jcas.throwFeatMissing("Begin", "stringN");
    jcasType.ll_cas.ll_setIntValue(addr, ((stringN_Type)jcasType).casFeatCode_Begin, v);}    
   
    
  //*--------------*
  //* Feature: End

  /** getter for End - gets 
   * 
   * @return value of the feature 
   */
  public int getEnd() {
    if (stringN_Type.featOkTst && ((stringN_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "stringN");
    return jcasType.ll_cas.ll_getIntValue(addr, ((stringN_Type)jcasType).casFeatCode_End);}
    
  /** setter for End - sets  
   * 
   * @param v value to set into the feature 
   */
  public void setEnd(int v) {
    if (stringN_Type.featOkTst && ((stringN_Type)jcasType).casFeat_End == null)
      jcasType.jcas.throwFeatMissing("End", "stringN");
    jcasType.ll_cas.ll_setIntValue(addr, ((stringN_Type)jcasType).casFeatCode_End, v);}    
   
    
  //*--------------*
  //* Feature: Sentence

  /** getter for Sentence - gets 
   * 
   * @return value of the feature 
   */
  public String getSentence() {
    if (stringN_Type.featOkTst && ((stringN_Type)jcasType).casFeat_Sentence == null)
      jcasType.jcas.throwFeatMissing("Sentence", "stringN");
    return jcasType.ll_cas.ll_getStringValue(addr, ((stringN_Type)jcasType).casFeatCode_Sentence);}
    
  /** setter for Sentence - sets  
   * 
   * @param v value to set into the feature 
   */
  public void setSentence(String v) {
    if (stringN_Type.featOkTst && ((stringN_Type)jcasType).casFeat_Sentence == null)
      jcasType.jcas.throwFeatMissing("Sentence", "stringN");
    jcasType.ll_cas.ll_setStringValue(addr, ((stringN_Type)jcasType).casFeatCode_Sentence, v);}    
  }

    