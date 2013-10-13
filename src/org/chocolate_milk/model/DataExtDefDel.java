/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DataExtDefDel.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class DataExtDefDel.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public class DataExtDefDel implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _ownerID.
     */
    private java.lang.String _ownerID;

    /**
     * Field _dataExtName.
     */
    private java.lang.String _dataExtName;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataExtDefDel() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dataExtName'.
     * 
     * @return the value of field 'DataExtName'.
     */
    public java.lang.String getDataExtName(
    ) {
        return this._dataExtName;
    }

    /**
     * Returns the value of field 'ownerID'.
     * 
     * @return the value of field 'OwnerID'.
     */
    public java.lang.String getOwnerID(
    ) {
        return this._ownerID;
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
     * Sets the value of field 'dataExtName'.
     * 
     * @param dataExtName the value of field 'dataExtName'.
     */
    public void setDataExtName(
            final java.lang.String dataExtName) {
        this._dataExtName = dataExtName;
    }

    /**
     * Sets the value of field 'ownerID'.
     * 
     * @param ownerID the value of field 'ownerID'.
     */
    public void setOwnerID(
            final java.lang.String ownerID) {
        this._ownerID = ownerID;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled org.chocolate_milk.model.DataExtDefDe
     */
    public static org.chocolate_milk.model.DataExtDefDel unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.DataExtDefDel) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.DataExtDefDel.class, reader);
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
