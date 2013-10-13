/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ItemServiceModChoice.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ItemServiceModChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ItemServiceModChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _salesOrPurchaseMod.
     */
    private org.chocolate_milk.model.SalesOrPurchaseMod _salesOrPurchaseMod;

    /**
     * Field _salesAndPurchaseMod.
     */
    private org.chocolate_milk.model.SalesAndPurchaseMod _salesAndPurchaseMod;


      //----------------/
     //- Constructors -/
    //----------------/

    public ItemServiceModChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'salesAndPurchaseMod'.
     * 
     * @return the value of field 'SalesAndPurchaseMod'.
     */
    public org.chocolate_milk.model.SalesAndPurchaseMod getSalesAndPurchaseMod(
    ) {
        return this._salesAndPurchaseMod;
    }

    /**
     * Returns the value of field 'salesOrPurchaseMod'.
     * 
     * @return the value of field 'SalesOrPurchaseMod'.
     */
    public org.chocolate_milk.model.SalesOrPurchaseMod getSalesOrPurchaseMod(
    ) {
        return this._salesOrPurchaseMod;
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
     * Sets the value of field 'salesAndPurchaseMod'.
     * 
     * @param salesAndPurchaseMod the value of field
     * 'salesAndPurchaseMod'.
     */
    public void setSalesAndPurchaseMod(
            final org.chocolate_milk.model.SalesAndPurchaseMod salesAndPurchaseMod) {
        this._salesAndPurchaseMod = salesAndPurchaseMod;
    }

    /**
     * Sets the value of field 'salesOrPurchaseMod'.
     * 
     * @param salesOrPurchaseMod the value of field
     * 'salesOrPurchaseMod'.
     */
    public void setSalesOrPurchaseMod(
            final org.chocolate_milk.model.SalesOrPurchaseMod salesOrPurchaseMod) {
        this._salesOrPurchaseMod = salesOrPurchaseMod;
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
     * org.chocolate_milk.model.ItemServiceModChoice
     */
    public static org.chocolate_milk.model.ItemServiceModChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ItemServiceModChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ItemServiceModChoice.class, reader);
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
