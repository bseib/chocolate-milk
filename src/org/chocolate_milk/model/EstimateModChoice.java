/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: EstimateModChoice.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class EstimateModChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class EstimateModChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _items.
     */
    private java.util.List<org.chocolate_milk.model.EstimateModChoiceItem> _items;


      //----------------/
     //- Constructors -/
    //----------------/

    public EstimateModChoice() {
        super();
        this._items = new java.util.ArrayList<org.chocolate_milk.model.EstimateModChoiceItem>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vEstimateModChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEstimateModChoiceItem(
            final org.chocolate_milk.model.EstimateModChoiceItem vEstimateModChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(vEstimateModChoiceItem);
    }

    /**
     * 
     * 
     * @param index
     * @param vEstimateModChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addEstimateModChoiceItem(
            final int index,
            final org.chocolate_milk.model.EstimateModChoiceItem vEstimateModChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        this._items.add(index, vEstimateModChoiceItem);
    }

    /**
     * Method enumerateEstimateModChoiceItem.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.EstimateModChoiceItem> enumerateEstimateModChoiceItem(
    ) {
        return java.util.Collections.enumeration(this._items);
    }

    /**
     * Method getEstimateModChoiceItem.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.EstimateModChoiceItem at the given
     * index
     */
    public org.chocolate_milk.model.EstimateModChoiceItem getEstimateModChoiceItem(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("getEstimateModChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.EstimateModChoiceItem) _items.get(index);
    }

    /**
     * Method getEstimateModChoiceItem.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.EstimateModChoiceItem[] getEstimateModChoiceItem(
    ) {
        org.chocolate_milk.model.EstimateModChoiceItem[] array = new org.chocolate_milk.model.EstimateModChoiceItem[0];
        return (org.chocolate_milk.model.EstimateModChoiceItem[]) this._items.toArray(array);
    }

    /**
     * Method getEstimateModChoiceItemCount.
     * 
     * @return the size of this collection
     */
    public int getEstimateModChoiceItemCount(
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
     * Method iterateEstimateModChoiceItem.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.EstimateModChoiceItem> iterateEstimateModChoiceItem(
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
    public void removeAllEstimateModChoiceItem(
    ) {
        this._items.clear();
    }

    /**
     * Method removeEstimateModChoiceItem.
     * 
     * @param vEstimateModChoiceItem
     * @return true if the object was removed from the collection.
     */
    public boolean removeEstimateModChoiceItem(
            final org.chocolate_milk.model.EstimateModChoiceItem vEstimateModChoiceItem) {
        boolean removed = _items.remove(vEstimateModChoiceItem);
        return removed;
    }

    /**
     * Method removeEstimateModChoiceItemAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.EstimateModChoiceItem removeEstimateModChoiceItemAt(
            final int index) {
        java.lang.Object obj = this._items.remove(index);
        return (org.chocolate_milk.model.EstimateModChoiceItem) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vEstimateModChoiceItem
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setEstimateModChoiceItem(
            final int index,
            final org.chocolate_milk.model.EstimateModChoiceItem vEstimateModChoiceItem)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._items.size()) {
            throw new IndexOutOfBoundsException("setEstimateModChoiceItem: Index value '" + index + "' not in range [0.." + (this._items.size() - 1) + "]");
        }

        this._items.set(index, vEstimateModChoiceItem);
    }

    /**
     * 
     * 
     * @param vEstimateModChoiceItemArray
     */
    public void setEstimateModChoiceItem(
            final org.chocolate_milk.model.EstimateModChoiceItem[] vEstimateModChoiceItemArray) {
        //-- copy array
        _items.clear();

        for (int i = 0; i < vEstimateModChoiceItemArray.length; i++) {
                this._items.add(vEstimateModChoiceItemArray[i]);
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
     * org.chocolate_milk.model.EstimateModChoice
     */
    public static org.chocolate_milk.model.EstimateModChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.EstimateModChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.EstimateModChoice.class, reader);
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
