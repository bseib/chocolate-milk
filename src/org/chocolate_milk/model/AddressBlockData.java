/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: AddressBlockData.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class AddressBlockData.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class AddressBlockData implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _addr1.
     */
    private java.lang.String _addr1;

    /**
     * Field _addr2.
     */
    private java.lang.String _addr2;

    /**
     * Field _addr3.
     */
    private java.lang.String _addr3;

    /**
     * Field _addr4.
     */
    private java.lang.String _addr4;

    /**
     * Field _addr5.
     */
    private java.lang.String _addr5;


      //----------------/
     //- Constructors -/
    //----------------/

    public AddressBlockData() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'addr1'.
     * 
     * @return the value of field 'Addr1'.
     */
    public java.lang.String getAddr1(
    ) {
        return this._addr1;
    }

    /**
     * Returns the value of field 'addr2'.
     * 
     * @return the value of field 'Addr2'.
     */
    public java.lang.String getAddr2(
    ) {
        return this._addr2;
    }

    /**
     * Returns the value of field 'addr3'.
     * 
     * @return the value of field 'Addr3'.
     */
    public java.lang.String getAddr3(
    ) {
        return this._addr3;
    }

    /**
     * Returns the value of field 'addr4'.
     * 
     * @return the value of field 'Addr4'.
     */
    public java.lang.String getAddr4(
    ) {
        return this._addr4;
    }

    /**
     * Returns the value of field 'addr5'.
     * 
     * @return the value of field 'Addr5'.
     */
    public java.lang.String getAddr5(
    ) {
        return this._addr5;
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
     * Sets the value of field 'addr1'.
     * 
     * @param addr1 the value of field 'addr1'.
     */
    public void setAddr1(
            final java.lang.String addr1) {
        this._addr1 = addr1;
    }

    /**
     * Sets the value of field 'addr2'.
     * 
     * @param addr2 the value of field 'addr2'.
     */
    public void setAddr2(
            final java.lang.String addr2) {
        this._addr2 = addr2;
    }

    /**
     * Sets the value of field 'addr3'.
     * 
     * @param addr3 the value of field 'addr3'.
     */
    public void setAddr3(
            final java.lang.String addr3) {
        this._addr3 = addr3;
    }

    /**
     * Sets the value of field 'addr4'.
     * 
     * @param addr4 the value of field 'addr4'.
     */
    public void setAddr4(
            final java.lang.String addr4) {
        this._addr4 = addr4;
    }

    /**
     * Sets the value of field 'addr5'.
     * 
     * @param addr5 the value of field 'addr5'.
     */
    public void setAddr5(
            final java.lang.String addr5) {
        this._addr5 = addr5;
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
     * org.chocolate_milk.model.AddressBlockData
     */
    public static org.chocolate_milk.model.AddressBlockData unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.AddressBlockData) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.AddressBlockData.class, reader);
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
