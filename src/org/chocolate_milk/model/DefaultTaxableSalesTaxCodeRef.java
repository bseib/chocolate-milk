/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DefaultTaxableSalesTaxCodeRef.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class DefaultTaxableSalesTaxCodeRef.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class DefaultTaxableSalesTaxCodeRef implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _salesTaxCodeListRef.
     */
    private org.chocolate_milk.model.SalesTaxCodeListRef _salesTaxCodeListRef;


      //----------------/
     //- Constructors -/
    //----------------/

    public DefaultTaxableSalesTaxCodeRef() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'salesTaxCodeListRef'.
     * 
     * @return the value of field 'SalesTaxCodeListRef'.
     */
    public org.chocolate_milk.model.SalesTaxCodeListRef getSalesTaxCodeListRef(
    ) {
        return this._salesTaxCodeListRef;
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
     * Sets the value of field 'salesTaxCodeListRef'.
     * 
     * @param salesTaxCodeListRef the value of field
     * 'salesTaxCodeListRef'.
     */
    public void setSalesTaxCodeListRef(
            final org.chocolate_milk.model.SalesTaxCodeListRef salesTaxCodeListRef) {
        this._salesTaxCodeListRef = salesTaxCodeListRef;
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
     * org.chocolate_milk.model.DefaultTaxableSalesTaxCodeRef
     */
    public static org.chocolate_milk.model.DefaultTaxableSalesTaxCodeRef unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.DefaultTaxableSalesTaxCodeRef) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.DefaultTaxableSalesTaxCodeRef.class, reader);
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
