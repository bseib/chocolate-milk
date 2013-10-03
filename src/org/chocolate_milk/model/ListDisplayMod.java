/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ListDisplayMod.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ListDisplayMod.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class ListDisplayMod implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _listDisplayModType.
     */
    private org.chocolate_milk.model.types.ListDisplayModTypeType _listDisplayModType;

    /**
     * Field _listID.
     */
    private java.lang.String _listID;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListDisplayMod() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'listDisplayModType'.
     * 
     * @return the value of field 'ListDisplayModType'.
     */
    public org.chocolate_milk.model.types.ListDisplayModTypeType getListDisplayModType(
    ) {
        return this._listDisplayModType;
    }

    /**
     * Returns the value of field 'listID'.
     * 
     * @return the value of field 'ListID'.
     */
    public java.lang.String getListID(
    ) {
        return this._listID;
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
     * Sets the value of field 'listDisplayModType'.
     * 
     * @param listDisplayModType the value of field
     * 'listDisplayModType'.
     */
    public void setListDisplayModType(
            final org.chocolate_milk.model.types.ListDisplayModTypeType listDisplayModType) {
        this._listDisplayModType = listDisplayModType;
    }

    /**
     * Sets the value of field 'listID'.
     * 
     * @param listID the value of field 'listID'.
     */
    public void setListID(
            final java.lang.String listID) {
        this._listID = listID;
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
     * org.chocolate_milk.model.ListDisplayMod
     */
    public static org.chocolate_milk.model.ListDisplayMod unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ListDisplayMod) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ListDisplayMod.class, reader);
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
