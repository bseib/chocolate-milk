/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: BuildAssemblyMod.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class BuildAssemblyMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class BuildAssemblyMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnID.
     */
    private org.chocolate_milk.model.BuildAssemblyModTxnID _txnID;

    /**
     * Field _editSequence.
     */
    private java.lang.String _editSequence;

    /**
     * Field _txnDate.
     */
    private java.lang.String _txnDate;

    /**
     * Field _refNumber.
     */
    private java.lang.String _refNumber;

    /**
     * Field _memo.
     */
    private java.lang.String _memo;

    /**
     * Field _quantityToBuild.
     */
    private java.lang.String _quantityToBuild;

    /**
     * Field _markPendingIfRequired.
     */
    private java.lang.String _markPendingIfRequired;

    /**
     * Field _removePending.
     */
    private java.lang.String _removePending;


      //----------------/
     //- Constructors -/
    //----------------/

    public BuildAssemblyMod() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'editSequence'.
     * 
     * @return the value of field 'EditSequence'.
     */
    public java.lang.String getEditSequence(
    ) {
        return this._editSequence;
    }

    /**
     * Returns the value of field 'markPendingIfRequired'.
     * 
     * @return the value of field 'MarkPendingIfRequired'.
     */
    public java.lang.String getMarkPendingIfRequired(
    ) {
        return this._markPendingIfRequired;
    }

    /**
     * Returns the value of field 'memo'.
     * 
     * @return the value of field 'Memo'.
     */
    public java.lang.String getMemo(
    ) {
        return this._memo;
    }

    /**
     * Returns the value of field 'quantityToBuild'.
     * 
     * @return the value of field 'QuantityToBuild'.
     */
    public java.lang.String getQuantityToBuild(
    ) {
        return this._quantityToBuild;
    }

    /**
     * Returns the value of field 'refNumber'.
     * 
     * @return the value of field 'RefNumber'.
     */
    public java.lang.String getRefNumber(
    ) {
        return this._refNumber;
    }

    /**
     * Returns the value of field 'removePending'.
     * 
     * @return the value of field 'RemovePending'.
     */
    public java.lang.String getRemovePending(
    ) {
        return this._removePending;
    }

    /**
     * Returns the value of field 'txnDate'.
     * 
     * @return the value of field 'TxnDate'.
     */
    public java.lang.String getTxnDate(
    ) {
        return this._txnDate;
    }

    /**
     * Returns the value of field 'txnID'.
     * 
     * @return the value of field 'TxnID'.
     */
    public org.chocolate_milk.model.BuildAssemblyModTxnID getTxnID(
    ) {
        return this._txnID;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'editSequence'.
     * 
     * @param editSequence the value of field 'editSequence'.
     */
    public void setEditSequence(
            final java.lang.String editSequence) {
        this._editSequence = editSequence;
    }

    /**
     * Sets the value of field 'markPendingIfRequired'.
     * 
     * @param markPendingIfRequired the value of field
     * 'markPendingIfRequired'.
     */
    public void setMarkPendingIfRequired(
            final java.lang.String markPendingIfRequired) {
        this._markPendingIfRequired = markPendingIfRequired;
    }

    /**
     * Sets the value of field 'memo'.
     * 
     * @param memo the value of field 'memo'.
     */
    public void setMemo(
            final java.lang.String memo) {
        this._memo = memo;
    }

    /**
     * Sets the value of field 'quantityToBuild'.
     * 
     * @param quantityToBuild the value of field 'quantityToBuild'.
     */
    public void setQuantityToBuild(
            final java.lang.String quantityToBuild) {
        this._quantityToBuild = quantityToBuild;
    }

    /**
     * Sets the value of field 'refNumber'.
     * 
     * @param refNumber the value of field 'refNumber'.
     */
    public void setRefNumber(
            final java.lang.String refNumber) {
        this._refNumber = refNumber;
    }

    /**
     * Sets the value of field 'removePending'.
     * 
     * @param removePending the value of field 'removePending'.
     */
    public void setRemovePending(
            final java.lang.String removePending) {
        this._removePending = removePending;
    }

    /**
     * Sets the value of field 'txnDate'.
     * 
     * @param txnDate the value of field 'txnDate'.
     */
    public void setTxnDate(
            final java.lang.String txnDate) {
        this._txnDate = txnDate;
    }

    /**
     * Sets the value of field 'txnID'.
     * 
     * @param txnID the value of field 'txnID'.
     */
    public void setTxnID(
            final org.chocolate_milk.model.BuildAssemblyModTxnID txnID) {
        this._txnID = txnID;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.chocolate_milk.model.BuildAssemblyMod
     */
    public static org.chocolate_milk.model.BuildAssemblyMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.BuildAssemblyMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.BuildAssemblyMod.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
