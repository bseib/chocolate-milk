/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ARRefundCreditCardFilterChoice2.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ARRefundCreditCardFilterChoice2.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ARRefundCreditCardFilterChoice2 implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _refNumberFilter.
     */
    private org.chocolate_milk.model.RefNumberFilter _refNumberFilter;

    /**
     * Field _refNumberRangeFilter.
     */
    private org.chocolate_milk.model.RefNumberRangeFilter _refNumberRangeFilter;


      //----------------/
     //- Constructors -/
    //----------------/

    public ARRefundCreditCardFilterChoice2() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'refNumberFilter'.
     * 
     * @return the value of field 'RefNumberFilter'.
     */
    public org.chocolate_milk.model.RefNumberFilter getRefNumberFilter(
    ) {
        return this._refNumberFilter;
    }

    /**
     * Returns the value of field 'refNumberRangeFilter'.
     * 
     * @return the value of field 'RefNumberRangeFilter'.
     */
    public org.chocolate_milk.model.RefNumberRangeFilter getRefNumberRangeFilter(
    ) {
        return this._refNumberRangeFilter;
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
     * Sets the value of field 'refNumberFilter'.
     * 
     * @param refNumberFilter the value of field 'refNumberFilter'.
     */
    public void setRefNumberFilter(
            final org.chocolate_milk.model.RefNumberFilter refNumberFilter) {
        this._refNumberFilter = refNumberFilter;
    }

    /**
     * Sets the value of field 'refNumberRangeFilter'.
     * 
     * @param refNumberRangeFilter the value of field
     * 'refNumberRangeFilter'.
     */
    public void setRefNumberRangeFilter(
            final org.chocolate_milk.model.RefNumberRangeFilter refNumberRangeFilter) {
        this._refNumberRangeFilter = refNumberRangeFilter;
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
     * org.chocolate_milk.model.ARRefundCreditCardFilterChoice2
     */
    public static org.chocolate_milk.model.ARRefundCreditCardFilterChoice2 unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ARRefundCreditCardFilterChoice2) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ARRefundCreditCardFilterChoice2.class, reader);
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
