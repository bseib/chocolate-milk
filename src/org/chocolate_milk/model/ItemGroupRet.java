/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ItemGroupRet.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ItemGroupRet.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ItemGroupRet implements java.io.Serializable {


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
     * Field _itemDesc.
     */
    private java.lang.String _itemDesc;

    /**
     * Field _unitOfMeasureSetRef.
     */
    private org.chocolate_milk.model.UnitOfMeasureSetRef _unitOfMeasureSetRef;

    /**
     * Field _isPrintItemsInGroup.
     */
    private java.lang.String _isPrintItemsInGroup;

    /**
     * Field _specialItemType.
     */
    private org.chocolate_milk.model.types.SpecialItemTypeType _specialItemType;

    /**
     * Field _externalGUID.
     */
    private java.lang.String _externalGUID;

    /**
     * Field _itemGroupLineList.
     */
    private java.util.List<org.chocolate_milk.model.ItemGroupLine> _itemGroupLineList;

    /**
     * Field _dataExtRetList.
     */
    private java.util.List<org.chocolate_milk.model.DataExtRet> _dataExtRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemGroupRet() {
        super();
        this._itemGroupLineList = new java.util.ArrayList<org.chocolate_milk.model.ItemGroupLine>();
        this._dataExtRetList = new java.util.ArrayList<org.chocolate_milk.model.DataExtRet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vDataExtRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDataExtRet(
            final org.chocolate_milk.model.DataExtRet vDataExtRet)
    throws java.lang.IndexOutOfBoundsException {
        this._dataExtRetList.add(vDataExtRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vDataExtRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addDataExtRet(
            final int index,
            final org.chocolate_milk.model.DataExtRet vDataExtRet)
    throws java.lang.IndexOutOfBoundsException {
        this._dataExtRetList.add(index, vDataExtRet);
    }

    /**
     * 
     * 
     * @param vItemGroupLine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addItemGroupLine(
            final org.chocolate_milk.model.ItemGroupLine vItemGroupLine)
    throws java.lang.IndexOutOfBoundsException {
        this._itemGroupLineList.add(vItemGroupLine);
    }

    /**
     * 
     * 
     * @param index
     * @param vItemGroupLine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addItemGroupLine(
            final int index,
            final org.chocolate_milk.model.ItemGroupLine vItemGroupLine)
    throws java.lang.IndexOutOfBoundsException {
        this._itemGroupLineList.add(index, vItemGroupLine);
    }

    /**
     * Method enumerateDataExtRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.DataExtRet> enumerateDataExtRet(
    ) {
        return java.util.Collections.enumeration(this._dataExtRetList);
    }

    /**
     * Method enumerateItemGroupLine.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.ItemGroupLine> enumerateItemGroupLine(
    ) {
        return java.util.Collections.enumeration(this._itemGroupLineList);
    }

    /**
     * Method getDataExtRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the org.chocolate_milk.model.DataExtRet
     * at the given index
     */
    public org.chocolate_milk.model.DataExtRet getDataExtRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dataExtRetList.size()) {
            throw new IndexOutOfBoundsException("getDataExtRet: Index value '" + index + "' not in range [0.." + (this._dataExtRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.DataExtRet) _dataExtRetList.get(index);
    }

    /**
     * Method getDataExtRet.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.DataExtRet[] getDataExtRet(
    ) {
        org.chocolate_milk.model.DataExtRet[] array = new org.chocolate_milk.model.DataExtRet[0];
        return (org.chocolate_milk.model.DataExtRet[]) this._dataExtRetList.toArray(array);
    }

    /**
     * Method getDataExtRetCount.
     * 
     * @return the size of this collection
     */
    public int getDataExtRetCount(
    ) {
        return this._dataExtRetList.size();
    }

    /**
     * Returns the value of field 'externalGUID'.
     * 
     * @return the value of field 'ExternalGUID'.
     */
    public java.lang.String getExternalGUID(
    ) {
        return this._externalGUID;
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
     * Returns the value of field 'isPrintItemsInGroup'.
     * 
     * @return the value of field 'IsPrintItemsInGroup'.
     */
    public java.lang.String getIsPrintItemsInGroup(
    ) {
        return this._isPrintItemsInGroup;
    }

    /**
     * Returns the value of field 'itemDesc'.
     * 
     * @return the value of field 'ItemDesc'.
     */
    public java.lang.String getItemDesc(
    ) {
        return this._itemDesc;
    }

    /**
     * Method getItemGroupLine.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.ItemGroupLine at the given index
     */
    public org.chocolate_milk.model.ItemGroupLine getItemGroupLine(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._itemGroupLineList.size()) {
            throw new IndexOutOfBoundsException("getItemGroupLine: Index value '" + index + "' not in range [0.." + (this._itemGroupLineList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.ItemGroupLine) _itemGroupLineList.get(index);
    }

    /**
     * Method getItemGroupLine.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.ItemGroupLine[] getItemGroupLine(
    ) {
        org.chocolate_milk.model.ItemGroupLine[] array = new org.chocolate_milk.model.ItemGroupLine[0];
        return (org.chocolate_milk.model.ItemGroupLine[]) this._itemGroupLineList.toArray(array);
    }

    /**
     * Method getItemGroupLineCount.
     * 
     * @return the size of this collection
     */
    public int getItemGroupLineCount(
    ) {
        return this._itemGroupLineList.size();
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
     * Returns the value of field 'specialItemType'.
     * 
     * @return the value of field 'SpecialItemType'.
     */
    public org.chocolate_milk.model.types.SpecialItemTypeType getSpecialItemType(
    ) {
        return this._specialItemType;
    }

    /**
     * Returns the value of field 'unitOfMeasureSetRef'.
     * 
     * @return the value of field 'UnitOfMeasureSetRef'.
     */
    public org.chocolate_milk.model.UnitOfMeasureSetRef getUnitOfMeasureSetRef(
    ) {
        return this._unitOfMeasureSetRef;
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
     * Method iterateDataExtRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.DataExtRet> iterateDataExtRet(
    ) {
        return this._dataExtRetList.iterator();
    }

    /**
     * Method iterateItemGroupLine.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.ItemGroupLine> iterateItemGroupLine(
    ) {
        return this._itemGroupLineList.iterator();
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
    public void removeAllDataExtRet(
    ) {
        this._dataExtRetList.clear();
    }

    /**
     */
    public void removeAllItemGroupLine(
    ) {
        this._itemGroupLineList.clear();
    }

    /**
     * Method removeDataExtRet.
     * 
     * @param vDataExtRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeDataExtRet(
            final org.chocolate_milk.model.DataExtRet vDataExtRet) {
        boolean removed = _dataExtRetList.remove(vDataExtRet);
        return removed;
    }

    /**
     * Method removeDataExtRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.DataExtRet removeDataExtRetAt(
            final int index) {
        java.lang.Object obj = this._dataExtRetList.remove(index);
        return (org.chocolate_milk.model.DataExtRet) obj;
    }

    /**
     * Method removeItemGroupLine.
     * 
     * @param vItemGroupLine
     * @return true if the object was removed from the collection.
     */
    public boolean removeItemGroupLine(
            final org.chocolate_milk.model.ItemGroupLine vItemGroupLine) {
        boolean removed = _itemGroupLineList.remove(vItemGroupLine);
        return removed;
    }

    /**
     * Method removeItemGroupLineAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.ItemGroupLine removeItemGroupLineAt(
            final int index) {
        java.lang.Object obj = this._itemGroupLineList.remove(index);
        return (org.chocolate_milk.model.ItemGroupLine) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vDataExtRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setDataExtRet(
            final int index,
            final org.chocolate_milk.model.DataExtRet vDataExtRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._dataExtRetList.size()) {
            throw new IndexOutOfBoundsException("setDataExtRet: Index value '" + index + "' not in range [0.." + (this._dataExtRetList.size() - 1) + "]");
        }

        this._dataExtRetList.set(index, vDataExtRet);
    }

    /**
     * 
     * 
     * @param vDataExtRetArray
     */
    public void setDataExtRet(
            final org.chocolate_milk.model.DataExtRet[] vDataExtRetArray) {
        //-- copy array
        _dataExtRetList.clear();

        for (int i = 0; i < vDataExtRetArray.length; i++) {
                this._dataExtRetList.add(vDataExtRetArray[i]);
        }
    }

    /**
     * Sets the value of field 'externalGUID'.
     * 
     * @param externalGUID the value of field 'externalGUID'.
     */
    public void setExternalGUID(
            final java.lang.String externalGUID) {
        this._externalGUID = externalGUID;
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
     * Sets the value of field 'isPrintItemsInGroup'.
     * 
     * @param isPrintItemsInGroup the value of field
     * 'isPrintItemsInGroup'.
     */
    public void setIsPrintItemsInGroup(
            final java.lang.String isPrintItemsInGroup) {
        this._isPrintItemsInGroup = isPrintItemsInGroup;
    }

    /**
     * Sets the value of field 'itemDesc'.
     * 
     * @param itemDesc the value of field 'itemDesc'.
     */
    public void setItemDesc(
            final java.lang.String itemDesc) {
        this._itemDesc = itemDesc;
    }

    /**
     * 
     * 
     * @param index
     * @param vItemGroupLine
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setItemGroupLine(
            final int index,
            final org.chocolate_milk.model.ItemGroupLine vItemGroupLine)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._itemGroupLineList.size()) {
            throw new IndexOutOfBoundsException("setItemGroupLine: Index value '" + index + "' not in range [0.." + (this._itemGroupLineList.size() - 1) + "]");
        }

        this._itemGroupLineList.set(index, vItemGroupLine);
    }

    /**
     * 
     * 
     * @param vItemGroupLineArray
     */
    public void setItemGroupLine(
            final org.chocolate_milk.model.ItemGroupLine[] vItemGroupLineArray) {
        //-- copy array
        _itemGroupLineList.clear();

        for (int i = 0; i < vItemGroupLineArray.length; i++) {
                this._itemGroupLineList.add(vItemGroupLineArray[i]);
        }
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
     * Sets the value of field 'specialItemType'.
     * 
     * @param specialItemType the value of field 'specialItemType'.
     */
    public void setSpecialItemType(
            final org.chocolate_milk.model.types.SpecialItemTypeType specialItemType) {
        this._specialItemType = specialItemType;
    }

    /**
     * Sets the value of field 'unitOfMeasureSetRef'.
     * 
     * @param unitOfMeasureSetRef the value of field
     * 'unitOfMeasureSetRef'.
     */
    public void setUnitOfMeasureSetRef(
            final org.chocolate_milk.model.UnitOfMeasureSetRef unitOfMeasureSetRef) {
        this._unitOfMeasureSetRef = unitOfMeasureSetRef;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.ItemGroupRet
     */
    public static org.chocolate_milk.model.ItemGroupRet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ItemGroupRet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ItemGroupRet.class, reader);
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
