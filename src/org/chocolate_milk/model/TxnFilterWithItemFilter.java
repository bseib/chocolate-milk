/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TxnFilterWithItemFilter.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TxnFilterWithItemFilter.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class TxnFilterWithItemFilter implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _maxReturned.
     */
    private long _maxReturned;

    /**
     * keeps track of state for field: _maxReturned
     */
    private boolean _has_maxReturned;

    /**
     * Field _txnFilterWithItemFilterChoice.
     */
    private org.chocolate_milk.model.TxnFilterWithItemFilterChoice _txnFilterWithItemFilterChoice;

    /**
     * Field _entityFilter.
     */
    private org.chocolate_milk.model.EntityFilter _entityFilter;

    /**
     * Field _accountFilter.
     */
    private org.chocolate_milk.model.AccountFilter _accountFilter;

    /**
     * Field _itemFilter.
     */
    private org.chocolate_milk.model.ItemFilter _itemFilter;

    /**
     * Field _txnFilterWithItemFilterChoice2.
     */
    private org.chocolate_milk.model.TxnFilterWithItemFilterChoice2 _txnFilterWithItemFilterChoice2;


      //----------------/
     //- Constructors -/
    //----------------/

    public TxnFilterWithItemFilter() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteMaxReturned(
    ) {
        this._has_maxReturned= false;
    }

    /**
     * Returns the value of field 'accountFilter'.
     * 
     * @return the value of field 'AccountFilter'.
     */
    public org.chocolate_milk.model.AccountFilter getAccountFilter(
    ) {
        return this._accountFilter;
    }

    /**
     * Returns the value of field 'entityFilter'.
     * 
     * @return the value of field 'EntityFilter'.
     */
    public org.chocolate_milk.model.EntityFilter getEntityFilter(
    ) {
        return this._entityFilter;
    }

    /**
     * Returns the value of field 'itemFilter'.
     * 
     * @return the value of field 'ItemFilter'.
     */
    public org.chocolate_milk.model.ItemFilter getItemFilter(
    ) {
        return this._itemFilter;
    }

    /**
     * Returns the value of field 'maxReturned'.
     * 
     * @return the value of field 'MaxReturned'.
     */
    public long getMaxReturned(
    ) {
        return this._maxReturned;
    }

    /**
     * Returns the value of field 'txnFilterWithItemFilterChoice'.
     * 
     * @return the value of field 'TxnFilterWithItemFilterChoice'.
     */
    public org.chocolate_milk.model.TxnFilterWithItemFilterChoice getTxnFilterWithItemFilterChoice(
    ) {
        return this._txnFilterWithItemFilterChoice;
    }

    /**
     * Returns the value of field 'txnFilterWithItemFilterChoice2'.
     * 
     * @return the value of field 'TxnFilterWithItemFilterChoice2'.
     */
    public org.chocolate_milk.model.TxnFilterWithItemFilterChoice2 getTxnFilterWithItemFilterChoice2(
    ) {
        return this._txnFilterWithItemFilterChoice2;
    }

    /**
     * Method hasMaxReturned.
     * 
     * @return true if at least one MaxReturned has been added
     */
    public boolean hasMaxReturned(
    ) {
        return this._has_maxReturned;
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
     * Sets the value of field 'accountFilter'.
     * 
     * @param accountFilter the value of field 'accountFilter'.
     */
    public void setAccountFilter(
            final org.chocolate_milk.model.AccountFilter accountFilter) {
        this._accountFilter = accountFilter;
    }

    /**
     * Sets the value of field 'entityFilter'.
     * 
     * @param entityFilter the value of field 'entityFilter'.
     */
    public void setEntityFilter(
            final org.chocolate_milk.model.EntityFilter entityFilter) {
        this._entityFilter = entityFilter;
    }

    /**
     * Sets the value of field 'itemFilter'.
     * 
     * @param itemFilter the value of field 'itemFilter'.
     */
    public void setItemFilter(
            final org.chocolate_milk.model.ItemFilter itemFilter) {
        this._itemFilter = itemFilter;
    }

    /**
     * Sets the value of field 'maxReturned'.
     * 
     * @param maxReturned the value of field 'maxReturned'.
     */
    public void setMaxReturned(
            final long maxReturned) {
        this._maxReturned = maxReturned;
        this._has_maxReturned = true;
    }

    /**
     * Sets the value of field 'txnFilterWithItemFilterChoice'.
     * 
     * @param txnFilterWithItemFilterChoice the value of field
     * 'txnFilterWithItemFilterChoice'.
     */
    public void setTxnFilterWithItemFilterChoice(
            final org.chocolate_milk.model.TxnFilterWithItemFilterChoice txnFilterWithItemFilterChoice) {
        this._txnFilterWithItemFilterChoice = txnFilterWithItemFilterChoice;
    }

    /**
     * Sets the value of field 'txnFilterWithItemFilterChoice2'.
     * 
     * @param txnFilterWithItemFilterChoice2 the value of field
     * 'txnFilterWithItemFilterChoice2'.
     */
    public void setTxnFilterWithItemFilterChoice2(
            final org.chocolate_milk.model.TxnFilterWithItemFilterChoice2 txnFilterWithItemFilterChoice2) {
        this._txnFilterWithItemFilterChoice2 = txnFilterWithItemFilterChoice2;
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
     * org.chocolate_milk.model.TxnFilterWithItemFilter
     */
    public static org.chocolate_milk.model.TxnFilterWithItemFilter unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.TxnFilterWithItemFilter) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.TxnFilterWithItemFilter.class, reader);
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
