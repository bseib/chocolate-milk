/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: BillToPayQuery.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class BillToPayQuery.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class BillToPayQuery implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _payeeEntityRef.
     */
    private org.chocolate_milk.model.PayeeEntityRef _payeeEntityRef;

    /**
     * Field _APAccountRef.
     */
    private org.chocolate_milk.model.APAccountRef _APAccountRef;

    /**
     * Field _dueDate.
     */
    private java.lang.String _dueDate;

    /**
     * Field _currencyFilter.
     */
    private org.chocolate_milk.model.CurrencyFilter _currencyFilter;

    /**
     * Field _includeRetElementList.
     */
    private java.util.List<java.lang.String> _includeRetElementList;


      //----------------/
     //- Constructors -/
    //----------------/

    public BillToPayQuery() {
        super();
        this._includeRetElementList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vIncludeRetElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeRetElement(
            final java.lang.String vIncludeRetElement)
    throws java.lang.IndexOutOfBoundsException {
        this._includeRetElementList.add(vIncludeRetElement);
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeRetElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addIncludeRetElement(
            final int index,
            final java.lang.String vIncludeRetElement)
    throws java.lang.IndexOutOfBoundsException {
        this._includeRetElementList.add(index, vIncludeRetElement);
    }

    /**
     * Method enumerateIncludeRetElement.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateIncludeRetElement(
    ) {
        return java.util.Collections.enumeration(this._includeRetElementList);
    }

    /**
     * Returns the value of field 'APAccountRef'.
     * 
     * @return the value of field 'APAccountRef'.
     */
    public org.chocolate_milk.model.APAccountRef getAPAccountRef(
    ) {
        return this._APAccountRef;
    }

    /**
     * Returns the value of field 'currencyFilter'.
     * 
     * @return the value of field 'CurrencyFilter'.
     */
    public org.chocolate_milk.model.CurrencyFilter getCurrencyFilter(
    ) {
        return this._currencyFilter;
    }

    /**
     * Returns the value of field 'dueDate'.
     * 
     * @return the value of field 'DueDate'.
     */
    public java.lang.String getDueDate(
    ) {
        return this._dueDate;
    }

    /**
     * Method getIncludeRetElement.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getIncludeRetElement(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeRetElementList.size()) {
            throw new IndexOutOfBoundsException("getIncludeRetElement: Index value '" + index + "' not in range [0.." + (this._includeRetElementList.size() - 1) + "]");
        }

        return (java.lang.String) _includeRetElementList.get(index);
    }

    /**
     * Method getIncludeRetElement.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getIncludeRetElement(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._includeRetElementList.toArray(array);
    }

    /**
     * Method getIncludeRetElementCount.
     * 
     * @return the size of this collection
     */
    public int getIncludeRetElementCount(
    ) {
        return this._includeRetElementList.size();
    }

    /**
     * Returns the value of field 'payeeEntityRef'.
     * 
     * @return the value of field 'PayeeEntityRef'.
     */
    public org.chocolate_milk.model.PayeeEntityRef getPayeeEntityRef(
    ) {
        return this._payeeEntityRef;
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
     * Method iterateIncludeRetElement.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateIncludeRetElement(
    ) {
        return this._includeRetElementList.iterator();
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
     */
    public void removeAllIncludeRetElement(
    ) {
        this._includeRetElementList.clear();
    }

    /**
     * Method removeIncludeRetElement.
     * 
     * @param vIncludeRetElement
     * @return true if the object was removed from the collection.
     */
    public boolean removeIncludeRetElement(
            final java.lang.String vIncludeRetElement) {
        boolean removed = _includeRetElementList.remove(vIncludeRetElement);
        return removed;
    }

    /**
     * Method removeIncludeRetElementAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeIncludeRetElementAt(
            final int index) {
        java.lang.Object obj = this._includeRetElementList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * Sets the value of field 'APAccountRef'.
     * 
     * @param APAccountRef the value of field 'APAccountRef'.
     */
    public void setAPAccountRef(
            final org.chocolate_milk.model.APAccountRef APAccountRef) {
        this._APAccountRef = APAccountRef;
    }

    /**
     * Sets the value of field 'currencyFilter'.
     * 
     * @param currencyFilter the value of field 'currencyFilter'.
     */
    public void setCurrencyFilter(
            final org.chocolate_milk.model.CurrencyFilter currencyFilter) {
        this._currencyFilter = currencyFilter;
    }

    /**
     * Sets the value of field 'dueDate'.
     * 
     * @param dueDate the value of field 'dueDate'.
     */
    public void setDueDate(
            final java.lang.String dueDate) {
        this._dueDate = dueDate;
    }

    /**
     * 
     * 
     * @param index
     * @param vIncludeRetElement
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setIncludeRetElement(
            final int index,
            final java.lang.String vIncludeRetElement)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._includeRetElementList.size()) {
            throw new IndexOutOfBoundsException("setIncludeRetElement: Index value '" + index + "' not in range [0.." + (this._includeRetElementList.size() - 1) + "]");
        }

        this._includeRetElementList.set(index, vIncludeRetElement);
    }

    /**
     * 
     * 
     * @param vIncludeRetElementArray
     */
    public void setIncludeRetElement(
            final java.lang.String[] vIncludeRetElementArray) {
        //-- copy array
        _includeRetElementList.clear();

        for (int i = 0; i < vIncludeRetElementArray.length; i++) {
                this._includeRetElementList.add(vIncludeRetElementArray[i]);
        }
    }

    /**
     * Sets the value of field 'payeeEntityRef'.
     * 
     * @param payeeEntityRef the value of field 'payeeEntityRef'.
     */
    public void setPayeeEntityRef(
            final org.chocolate_milk.model.PayeeEntityRef payeeEntityRef) {
        this._payeeEntityRef = payeeEntityRef;
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
     * org.chocolate_milk.model.BillToPayQuery
     */
    public static org.chocolate_milk.model.BillToPayQuery unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.BillToPayQuery) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.BillToPayQuery.class, reader);
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
