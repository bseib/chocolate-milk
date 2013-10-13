/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PayrollItemNonWageRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class PayrollItemNonWageRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class PayrollItemNonWageRet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listCore.
     */
    private org.chocolate_milk.model.ListCore _listCore;

    /**
     * Field _name.
     */
    private java.lang.String _name;

    /**
     * Field _isActive.
     */
    private java.lang.String _isActive;

    /**
     * Field _nonWageType.
     */
    private org.chocolate_milk.model.types.NonWageTypeType _nonWageType;

    /**
     * Field _expenseAccountRef.
     */
    private org.chocolate_milk.model.ExpenseAccountRef _expenseAccountRef;

    /**
     * Field _liabilityAccountRef.
     */
    private org.chocolate_milk.model.LiabilityAccountRef _liabilityAccountRef;


      //----------------/
     //- Constructors -/
    //----------------/

    public PayrollItemNonWageRet() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'expenseAccountRef'.
     * 
     * @return the value of field 'ExpenseAccountRef'.
     */
    public org.chocolate_milk.model.ExpenseAccountRef getExpenseAccountRef(
    ) {
        return this._expenseAccountRef;
    }

    /**
     * Returns the value of field 'isActive'.
     * 
     * @return the value of field 'IsActive'.
     */
    public java.lang.String getIsActive(
    ) {
        return this._isActive;
    }

    /**
     * Returns the value of field 'liabilityAccountRef'.
     * 
     * @return the value of field 'LiabilityAccountRef'.
     */
    public org.chocolate_milk.model.LiabilityAccountRef getLiabilityAccountRef(
    ) {
        return this._liabilityAccountRef;
    }

    /**
     * Returns the value of field 'listCore'.
     * 
     * @return the value of field 'ListCore'.
     */
    public org.chocolate_milk.model.ListCore getListCore(
    ) {
        return this._listCore;
    }

    /**
     * Returns the value of field 'name'.
     * 
     * @return the value of field 'Name'.
     */
    public java.lang.String getName(
    ) {
        return this._name;
    }

    /**
     * Returns the value of field 'nonWageType'.
     * 
     * @return the value of field 'NonWageType'.
     */
    public org.chocolate_milk.model.types.NonWageTypeType getNonWageType(
    ) {
        return this._nonWageType;
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
     * Sets the value of field 'expenseAccountRef'.
     * 
     * @param expenseAccountRef the value of field
     * 'expenseAccountRef'.
     */
    public void setExpenseAccountRef(
            final org.chocolate_milk.model.ExpenseAccountRef expenseAccountRef) {
        this._expenseAccountRef = expenseAccountRef;
    }

    /**
     * Sets the value of field 'isActive'.
     * 
     * @param isActive the value of field 'isActive'.
     */
    public void setIsActive(
            final java.lang.String isActive) {
        this._isActive = isActive;
    }

    /**
     * Sets the value of field 'liabilityAccountRef'.
     * 
     * @param liabilityAccountRef the value of field
     * 'liabilityAccountRef'.
     */
    public void setLiabilityAccountRef(
            final org.chocolate_milk.model.LiabilityAccountRef liabilityAccountRef) {
        this._liabilityAccountRef = liabilityAccountRef;
    }

    /**
     * Sets the value of field 'listCore'.
     * 
     * @param listCore the value of field 'listCore'.
     */
    public void setListCore(
            final org.chocolate_milk.model.ListCore listCore) {
        this._listCore = listCore;
    }

    /**
     * Sets the value of field 'name'.
     * 
     * @param name the value of field 'name'.
     */
    public void setName(
            final java.lang.String name) {
        this._name = name;
    }

    /**
     * Sets the value of field 'nonWageType'.
     * 
     * @param nonWageType the value of field 'nonWageType'.
     */
    public void setNonWageType(
            final org.chocolate_milk.model.types.NonWageTypeType nonWageType) {
        this._nonWageType = nonWageType;
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
     * org.chocolate_milk.model.PayrollItemNonWageRet
     */
    public static org.chocolate_milk.model.PayrollItemNonWageRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.PayrollItemNonWageRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.PayrollItemNonWageRet.class, reader);
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
