/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: DataExtDefDelRqType.java,v 1.1.1.1 2010-05-04 22:06:00 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class DataExtDefDelRqType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:00 $
 */
@SuppressWarnings("serial")
public abstract class DataExtDefDelRqType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _requestID.
     */
    private java.lang.String _requestID;

    /**
     * Field _dataExtDefDel.
     */
    private org.chocolate_milk.model.DataExtDefDel _dataExtDefDel;


      //----------------/
     //- Constructors -/
    //----------------/

    public DataExtDefDelRqType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'dataExtDefDel'.
     * 
     * @return the value of field 'DataExtDefDel'.
     */
    public org.chocolate_milk.model.DataExtDefDel getDataExtDefDel(
    ) {
        return this._dataExtDefDel;
    }

    /**
     * Returns the value of field 'requestID'.
     * 
     * @return the value of field 'RequestID'.
     */
    public java.lang.String getRequestID(
    ) {
        return this._requestID;
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
     * Sets the value of field 'dataExtDefDel'.
     * 
     * @param dataExtDefDel the value of field 'dataExtDefDel'.
     */
    public void setDataExtDefDel(
            final org.chocolate_milk.model.DataExtDefDel dataExtDefDel) {
        this._dataExtDefDel = dataExtDefDel;
    }

    /**
     * Sets the value of field 'requestID'.
     * 
     * @param requestID the value of field 'requestID'.
     */
    public void setRequestID(
            final java.lang.String requestID) {
        this._requestID = requestID;
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
