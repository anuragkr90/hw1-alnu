

/* First created by JCasGen Mon Sep 22 22:07:30 EDT 2014 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Tue Sep 23 18:02:10 EDT 2014
 * XML source: /home/anurag/fall2014/11791/hw1-alnu/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class Annotated extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Annotated.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Annotated() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Annotated(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Annotated(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Annotated(JCas jcas, int begin, int end) {
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
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Sentence

  /** getter for Sentence - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSentence() {
    if (Annotated_Type.featOkTst && ((Annotated_Type)jcasType).casFeat_Sentence == null)
      jcasType.jcas.throwFeatMissing("Sentence", "Annotated");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Annotated_Type)jcasType).casFeatCode_Sentence);}
    
  /** setter for Sentence - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentence(String v) {
    if (Annotated_Type.featOkTst && ((Annotated_Type)jcasType).casFeat_Sentence == null)
      jcasType.jcas.throwFeatMissing("Sentence", "Annotated");
    jcasType.ll_cas.ll_setStringValue(addr, ((Annotated_Type)jcasType).casFeatCode_Sentence, v);}    
   
    
  //*--------------*
  //* Feature: SentId

  /** getter for SentId - gets 
   * @generated
   * @return value of the feature 
   */
  public String getSentId() {
    if (Annotated_Type.featOkTst && ((Annotated_Type)jcasType).casFeat_SentId == null)
      jcasType.jcas.throwFeatMissing("SentId", "Annotated");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Annotated_Type)jcasType).casFeatCode_SentId);}
    
  /** setter for SentId - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setSentId(String v) {
    if (Annotated_Type.featOkTst && ((Annotated_Type)jcasType).casFeat_SentId == null)
      jcasType.jcas.throwFeatMissing("SentId", "Annotated");
    jcasType.ll_cas.ll_setStringValue(addr, ((Annotated_Type)jcasType).casFeatCode_SentId, v);}    
  }

    