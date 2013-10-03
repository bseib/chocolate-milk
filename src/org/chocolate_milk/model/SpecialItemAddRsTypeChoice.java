/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SpecialItemAddRsTypeChoice.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SpecialItemAddRsTypeChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class SpecialItemAddRsTypeChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _itemOtherChargeRet.
     */
    private org.chocolate_milk.model.ItemOtherChargeRet _itemOtherChargeRet;

    /**
     * Field _itemSubtotalRet.
     */
    private org.chocolate_milk.model.ItemSubtotalRet _itemSubtotalRet;

    /**
     * Field _itemGroupRet.
     */
    private org.chocolate_milk.model.ItemGroupRet _itemGroupRet;


      //----------------/
     //- Constructors -/
    //----------------/

    public SpecialItemAddRsTypeChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'itemGroupRet'.
     * 
     * @return the value of field 'ItemGroupRet'.
     */
    public org.chocolate_milk.model.ItemGroupRet getItemGroupRet(
    ) {
        return this._itemGroupRet;
    }

    /**
     * Returns the value of field 'itemOtherChargeRet'.
     * 
     * @return the value of field 'ItemOtherChargeRet'.
     */
    public org.chocolate_milk.model.ItemOtherChargeRet getItemOtherChargeRet(
    ) {
        return this._itemOtherChargeRet;
    }

    /**
     * Returns the value of field 'itemSubtotalRet'.
     * 
     * @return the value of field 'ItemSubtotalRet'.
     */
    public org.chocolate_milk.model.ItemSubtotalRet getItemSubtotalRet(
    ) {
        return this._itemSubtotalRet;
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
     * Sets the value of field 'itemGroupRet'.
     * 
     * @param itemGroupRet the value of field 'itemGroupRet'.
     */
    public void setItemGroupRet(
            final org.chocolate_milk.model.ItemGroupRet itemGroupRet) {
        this._itemGroupRet = itemGroupRet;
    }

    /**
     * Sets the value of field 'itemOtherChargeRet'.
     * 
     * @param itemOtherChargeRet the value of field
     * 'itemOtherChargeRet'.
     */
    public void setItemOtherChargeRet(
            final org.chocolate_milk.model.ItemOtherChargeRet itemOtherChargeRet) {
        this._itemOtherChargeRet = itemOtherChargeRet;
    }

    /**
     * Sets the value of field 'itemSubtotalRet'.
     * 
     * @param itemSubtotalRet the value of field 'itemSubtotalRet'.
     */
    public void setItemSubtotalRet(
            final org.chocolate_milk.model.ItemSubtotalRet itemSubtotalRet) {
        this._itemSubtotalRet = itemSubtotalRet;
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
     * org.chocolate_milk.model.SpecialItemAddRsTypeChoice
     */
    public static org.chocolate_milk.model.SpecialItemAddRsTypeChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SpecialItemAddRsTypeChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SpecialItemAddRsTypeChoice.class, reader);
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
