/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ItemGroupLineMod.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ItemGroupLineMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ItemGroupLineMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _txnLineID.
     */
    private java.lang.String _txnLineID;

    /**
     * Field _txnLineGroupCoreMod.
     */
    private org.chocolate_milk.model.TxnLineGroupCoreMod _txnLineGroupCoreMod;

    /**
     * Field _itemLineModList.
     */
    private java.util.List<org.chocolate_milk.model.ItemLineMod> _itemLineModList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemGroupLineMod() {
        super();
        this._itemLineModList = new java.util.ArrayList<org.chocolate_milk.model.ItemLineMod>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vItemLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addItemLineMod(
            final org.chocolate_milk.model.ItemLineMod vItemLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._itemLineModList.add(vItemLineMod);
    }

    /**
     * 
     * 
     * @param index
     * @param vItemLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addItemLineMod(
            final int index,
            final org.chocolate_milk.model.ItemLineMod vItemLineMod)
    throws java.lang.IndexOutOfBoundsException {
        this._itemLineModList.add(index, vItemLineMod);
    }

    /**
     * Method enumerateItemLineMod.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.ItemLineMod> enumerateItemLineMod(
    ) {
        return java.util.Collections.enumeration(this._itemLineModList);
    }

    /**
     * Method getItemLineMod.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.ItemLineMod at the given index
     */
    public org.chocolate_milk.model.ItemLineMod getItemLineMod(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._itemLineModList.size()) {
            throw new IndexOutOfBoundsException("getItemLineMod: Index value '" + index + "' not in range [0.." + (this._itemLineModList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.ItemLineMod) _itemLineModList.get(index);
    }

    /**
     * Method getItemLineMod.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.ItemLineMod[] getItemLineMod(
    ) {
        org.chocolate_milk.model.ItemLineMod[] array = new org.chocolate_milk.model.ItemLineMod[0];
        return (org.chocolate_milk.model.ItemLineMod[]) this._itemLineModList.toArray(array);
    }

    /**
     * Method getItemLineModCount.
     * 
     * @return the size of this collection
     */
    public int getItemLineModCount(
    ) {
        return this._itemLineModList.size();
    }

    /**
     * Returns the value of field 'txnLineGroupCoreMod'.
     * 
     * @return the value of field 'TxnLineGroupCoreMod'.
     */
    public org.chocolate_milk.model.TxnLineGroupCoreMod getTxnLineGroupCoreMod(
    ) {
        return this._txnLineGroupCoreMod;
    }

    /**
     * Returns the value of field 'txnLineID'.
     * 
     * @return the value of field 'TxnLineID'.
     */
    public java.lang.String getTxnLineID(
    ) {
        return this._txnLineID;
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
     * Method iterateItemLineMod.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.ItemLineMod> iterateItemLineMod(
    ) {
        return this._itemLineModList.iterator();
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
    public void removeAllItemLineMod(
    ) {
        this._itemLineModList.clear();
    }

    /**
     * Method removeItemLineMod.
     * 
     * @param vItemLineMod
     * @return true if the object was removed from the collection.
     */
    public boolean removeItemLineMod(
            final org.chocolate_milk.model.ItemLineMod vItemLineMod) {
        boolean removed = _itemLineModList.remove(vItemLineMod);
        return removed;
    }

    /**
     * Method removeItemLineModAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.ItemLineMod removeItemLineModAt(
            final int index) {
        java.lang.Object obj = this._itemLineModList.remove(index);
        return (org.chocolate_milk.model.ItemLineMod) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vItemLineMod
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setItemLineMod(
            final int index,
            final org.chocolate_milk.model.ItemLineMod vItemLineMod)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._itemLineModList.size()) {
            throw new IndexOutOfBoundsException("setItemLineMod: Index value '" + index + "' not in range [0.." + (this._itemLineModList.size() - 1) + "]");
        }

        this._itemLineModList.set(index, vItemLineMod);
    }

    /**
     * 
     * 
     * @param vItemLineModArray
     */
    public void setItemLineMod(
            final org.chocolate_milk.model.ItemLineMod[] vItemLineModArray) {
        //-- copy array
        _itemLineModList.clear();

        for (int i = 0; i < vItemLineModArray.length; i++) {
                this._itemLineModList.add(vItemLineModArray[i]);
        }
    }

    /**
     * Sets the value of field 'txnLineGroupCoreMod'.
     * 
     * @param txnLineGroupCoreMod the value of field
     * 'txnLineGroupCoreMod'.
     */
    public void setTxnLineGroupCoreMod(
            final org.chocolate_milk.model.TxnLineGroupCoreMod txnLineGroupCoreMod) {
        this._txnLineGroupCoreMod = txnLineGroupCoreMod;
    }

    /**
     * Sets the value of field 'txnLineID'.
     * 
     * @param txnLineID the value of field 'txnLineID'.
     */
    public void setTxnLineID(
            final java.lang.String txnLineID) {
        this._txnLineID = txnLineID;
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
     * org.chocolate_milk.model.ItemGroupLineMod
     */
    public static org.chocolate_milk.model.ItemGroupLineMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ItemGroupLineMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ItemGroupLineMod.class, reader);
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
