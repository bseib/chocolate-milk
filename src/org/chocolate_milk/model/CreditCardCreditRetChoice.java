/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: CreditCardCreditRetChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class CreditCardCreditRetChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class CreditCardCreditRetChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _items.
     */
    private java.util.List<org.chocolate_milk.model.CreditCardCreditRetChoiceItem> _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public CreditCardCreditRetChoice() {
        super();
        this._items = new java.util.ArrayList<org.chocolate_milk.model.CreditCardCreditRetChoiceItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vCreditCardCreditRetChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCreditCardCreditRetChoiceItem(
            final org.chocolate_milk.model.CreditCardCreditRetChoiceItem vCreditCardCreditRetChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(vCreditCardCreditRetChoiceItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vCreditCardCreditRetChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addCreditCardCreditRetChoiceItem(
            final int index,
            final org.chocolate_milk.model.CreditCardCreditRetChoiceItem vCreditCardCreditRetChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(index, vCreditCardCreditRetChoiceItem);
    }

    /**
     * Method enumerateCreditCardCreditRetChoiceItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.CreditCardCreditRetChoiceItem> enumerateCreditCardCreditRetChoiceItem(
    ) {
        return java.util.Collections.enumeration(this._items);
    }

    /**
     * Method getCreditCardCreditRetChoiceItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.CreditCardCreditRetChoiceItem at
     * the given index
     */
    public org.chocolate_milk.model.CreditCardCreditRetChoiceItem getCreditCardCreditRetChoiceItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("getCreditCardCreditRetChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.CreditCardCreditRetChoiceItem) _items.get(index);
    }

    /**
     * Method getCreditCardCreditRetChoiceItem.Returns the contents
     * of the collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.CreditCardCreditRetChoiceItem[] getCreditCardCreditRetChoiceItem(
    ) {
        org.chocolate_milk.model.CreditCardCreditRetChoiceItem[] array = new org.chocolate_milk.model.CreditCardCreditRetChoiceItem[0];
        return (org.chocolate_milk.model.CreditCardCreditRetChoiceItem[]) this._items.toArray(array);
    }

    /**
     * Method getCreditCardCreditRetChoiceItemCount.
     * 
     * @return the size of this collection
     */
    public int getCreditCardCreditRetChoiceItemCount(
    ) {
        return this._items.size();
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
     * Method iterateCreditCardCreditRetChoiceItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.CreditCardCreditRetChoiceItem> iterateCreditCardCreditRetChoiceItem(
    ) {
        return this._items.iterator();
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
    public void removeAllCreditCardCreditRetChoiceItem(
    ) {
        this._items.clear();
    }

    /**
     * Method removeCreditCardCreditRetChoiceItem.
     * 
     * @param vCreditCardCreditRetChoiceItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeCreditCardCreditRetChoiceItem(
            final org.chocolate_milk.model.CreditCardCreditRetChoiceItem vCreditCardCreditRetChoiceItem) {
        boolean removed = _items.remove(vCreditCardCreditRetChoiceItem);
        return removed;
    }

    /**
     * Method removeCreditCardCreditRetChoiceItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.CreditCardCreditRetChoiceItem removeCreditCardCreditRetChoiceItemAt(
            final int index) {
        java.lang.Object obj = this._items.remove(index);
        return (org.chocolate_milk.model.CreditCardCreditRetChoiceItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vCreditCardCreditRetChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setCreditCardCreditRetChoiceItem(
            final int index,
            final org.chocolate_milk.model.CreditCardCreditRetChoiceItem vCreditCardCreditRetChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("setCreditCardCreditRetChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        this._items.set(index, vCreditCardCreditRetChoiceItem);
    }

    /**
     * 
     * 
     * @param vCreditCardCreditRetChoiceItemArray
     */
    public void setCreditCardCreditRetChoiceItem(
            final org.chocolate_milk.model.CreditCardCreditRetChoiceItem[] vCreditCardCreditRetChoiceItemArray) {
        //-- copy array
        _items.clear();

        for (int i = 0; i < vCreditCardCreditRetChoiceItemArray.length; i++) {
                this._items.add(vCreditCardCreditRetChoiceItemArray[i]);
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
     * org.chocolate_milk.model.CreditCardCreditRetChoice
     */
    public static org.chocolate_milk.model.CreditCardCreditRetChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.CreditCardCreditRetChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.CreditCardCreditRetChoice.class, reader);
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
