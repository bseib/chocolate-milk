/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: TransactionTypeFilter.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class TransactionTypeFilter.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class TransactionTypeFilter implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnTypeFilterList.
     */
    private java.util.List<org.chocolate_milk.model.types.TxnTypeFilterType> _txnTypeFilterList;


      //----------------/
     //- Constructors -/
    //----------------/

    public TransactionTypeFilter() {
        super();
        this._txnTypeFilterList = new java.util.ArrayList<org.chocolate_milk.model.types.TxnTypeFilterType>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vTxnTypeFilter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTxnTypeFilter(
            final org.chocolate_milk.model.types.TxnTypeFilterType vTxnTypeFilter)
    throws java.lang.IndexOutOfBoundsException {
        this._txnTypeFilterList.add(vTxnTypeFilter);
    }

    /**
     * 
     * 
     * @param index
     * @param vTxnTypeFilter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addTxnTypeFilter(
            final int index,
            final org.chocolate_milk.model.types.TxnTypeFilterType vTxnTypeFilter)
    throws java.lang.IndexOutOfBoundsException {
        this._txnTypeFilterList.add(index, vTxnTypeFilter);
    }

    /**
     * Method enumerateTxnTypeFilter.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.types.TxnTypeFilterType> enumerateTxnTypeFilter(
    ) {
        return java.util.Collections.enumeration(this._txnTypeFilterList);
    }

    /**
     * Method getTxnTypeFilter.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.types.TxnTypeFilterType at the
     * given index
     */
    public org.chocolate_milk.model.types.TxnTypeFilterType getTxnTypeFilter(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._txnTypeFilterList.size()) {
            throw new IndexOutOfBoundsException("getTxnTypeFilter: Index value '" + index + "' not in range [0.." + (this._txnTypeFilterList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.types.TxnTypeFilterType) _txnTypeFilterList.get(index);
    }

    /**
     * Method getTxnTypeFilter.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.types.TxnTypeFilterType[] getTxnTypeFilter(
    ) {
        org.chocolate_milk.model.types.TxnTypeFilterType[] array = new org.chocolate_milk.model.types.TxnTypeFilterType[0];
        return (org.chocolate_milk.model.types.TxnTypeFilterType[]) this._txnTypeFilterList.toArray(array);
    }

    /**
     * Method getTxnTypeFilterCount.
     * 
     * @return the size of this collection
     */
    public int getTxnTypeFilterCount(
    ) {
        return this._txnTypeFilterList.size();
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
     * Method iterateTxnTypeFilter.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.types.TxnTypeFilterType> iterateTxnTypeFilter(
    ) {
        return this._txnTypeFilterList.iterator();
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
    public void removeAllTxnTypeFilter(
    ) {
        this._txnTypeFilterList.clear();
    }

    /**
     * Method removeTxnTypeFilter.
     * 
     * @param vTxnTypeFilter
     * @return true if the object was removed from the collection.
     */
    public boolean removeTxnTypeFilter(
            final org.chocolate_milk.model.types.TxnTypeFilterType vTxnTypeFilter) {
        boolean removed = _txnTypeFilterList.remove(vTxnTypeFilter);
        return removed;
    }

    /**
     * Method removeTxnTypeFilterAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.types.TxnTypeFilterType removeTxnTypeFilterAt(
            final int index) {
        java.lang.Object obj = this._txnTypeFilterList.remove(index);
        return (org.chocolate_milk.model.types.TxnTypeFilterType) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vTxnTypeFilter
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setTxnTypeFilter(
            final int index,
            final org.chocolate_milk.model.types.TxnTypeFilterType vTxnTypeFilter)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._txnTypeFilterList.size()) {
            throw new IndexOutOfBoundsException("setTxnTypeFilter: Index value '" + index + "' not in range [0.." + (this._txnTypeFilterList.size() - 1) + "]");
        }

        this._txnTypeFilterList.set(index, vTxnTypeFilter);
    }

    /**
     * 
     * 
     * @param vTxnTypeFilterArray
     */
    public void setTxnTypeFilter(
            final org.chocolate_milk.model.types.TxnTypeFilterType[] vTxnTypeFilterArray) {
        //-- copy array
        _txnTypeFilterList.clear();

        for (int i = 0; i < vTxnTypeFilterArray.length; i++) {
                this._txnTypeFilterList.add(vTxnTypeFilterArray[i]);
        }
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
     * org.chocolate_milk.model.TransactionTypeFilter
     */
    public static org.chocolate_milk.model.TransactionTypeFilter unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.TransactionTypeFilter) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.TransactionTypeFilter.class, reader);
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
