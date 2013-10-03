/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: StandardTermsQueryRsType.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class StandardTermsQueryRsType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public abstract class StandardTermsQueryRsType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _requestID.
     */
    private java.lang.String _requestID;

    /**
     * Field _statusCode.
     */
    private long _statusCode;

    /**
     * keeps track of state for field: _statusCode
     */
    private boolean _has_statusCode;

    /**
     * Field _statusSeverity.
     */
    private java.lang.String _statusSeverity;

    /**
     * Field _statusMessage.
     */
    private java.lang.String _statusMessage;

    /**
     * Field _retCount.
     */
    private long _retCount;

    /**
     * keeps track of state for field: _retCount
     */
    private boolean _has_retCount;

    /**
     * Field _standardTermsRetList.
     */
    private java.util.List<org.chocolate_milk.model.StandardTermsRet> _standardTermsRetList;


      //----------------/
     //- Constructors -/
    //----------------/

    public StandardTermsQueryRsType() {
        super();
        this._standardTermsRetList = new java.util.ArrayList<org.chocolate_milk.model.StandardTermsRet>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vStandardTermsRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStandardTermsRet(
            final org.chocolate_milk.model.StandardTermsRet vStandardTermsRet)
    throws java.lang.IndexOutOfBoundsException {
        this._standardTermsRetList.add(vStandardTermsRet);
    }

    /**
     * 
     * 
     * @param index
     * @param vStandardTermsRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addStandardTermsRet(
            final int index,
            final org.chocolate_milk.model.StandardTermsRet vStandardTermsRet)
    throws java.lang.IndexOutOfBoundsException {
        this._standardTermsRetList.add(index, vStandardTermsRet);
    }

    /**
     */
    public void deleteRetCount(
    ) {
        this._has_retCount= false;
    }

    /**
     */
    public void deleteStatusCode(
    ) {
        this._has_statusCode= false;
    }

    /**
     * Method enumerateStandardTermsRet.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends org.chocolate_milk.model.StandardTermsRet> enumerateStandardTermsRet(
    ) {
        return java.util.Collections.enumeration(this._standardTermsRetList);
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
     * Returns the value of field 'retCount'.
     * 
     * @return the value of field 'RetCount'.
     */
    public long getRetCount(
    ) {
        return this._retCount;
    }

    /**
     * Method getStandardTermsRet.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * org.chocolate_milk.model.StandardTermsRet at the given index
     */
    public org.chocolate_milk.model.StandardTermsRet getStandardTermsRet(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._standardTermsRetList.size()) {
            throw new IndexOutOfBoundsException("getStandardTermsRet: Index value '" + index + "' not in range [0.." + (this._standardTermsRetList.size() - 1) + "]");
        }

        return (org.chocolate_milk.model.StandardTermsRet) _standardTermsRetList.get(index);
    }

    /**
     * Method getStandardTermsRet.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public org.chocolate_milk.model.StandardTermsRet[] getStandardTermsRet(
    ) {
        org.chocolate_milk.model.StandardTermsRet[] array = new org.chocolate_milk.model.StandardTermsRet[0];
        return (org.chocolate_milk.model.StandardTermsRet[]) this._standardTermsRetList.toArray(array);
    }

    /**
     * Method getStandardTermsRetCount.
     * 
     * @return the size of this collection
     */
    public int getStandardTermsRetCount(
    ) {
        return this._standardTermsRetList.size();
    }

    /**
     * Returns the value of field 'statusCode'.
     * 
     * @return the value of field 'StatusCode'.
     */
    public long getStatusCode(
    ) {
        return this._statusCode;
    }

    /**
     * Returns the value of field 'statusMessage'.
     * 
     * @return the value of field 'StatusMessage'.
     */
    public java.lang.String getStatusMessage(
    ) {
        return this._statusMessage;
    }

    /**
     * Returns the value of field 'statusSeverity'.
     * 
     * @return the value of field 'StatusSeverity'.
     */
    public java.lang.String getStatusSeverity(
    ) {
        return this._statusSeverity;
    }

    /**
     * Method hasRetCount.
     * 
     * @return true if at least one RetCount has been added
     */
    public boolean hasRetCount(
    ) {
        return this._has_retCount;
    }

    /**
     * Method hasStatusCode.
     * 
     * @return true if at least one StatusCode has been added
     */
    public boolean hasStatusCode(
    ) {
        return this._has_statusCode;
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
     * Method iterateStandardTermsRet.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends org.chocolate_milk.model.StandardTermsRet> iterateStandardTermsRet(
    ) {
        return this._standardTermsRetList.iterator();
    }

    /**
     */
    public void removeAllStandardTermsRet(
    ) {
        this._standardTermsRetList.clear();
    }

    /**
     * Method removeStandardTermsRet.
     * 
     * @param vStandardTermsRet
     * @return true if the object was removed from the collection.
     */
    public boolean removeStandardTermsRet(
            final org.chocolate_milk.model.StandardTermsRet vStandardTermsRet) {
        boolean removed = _standardTermsRetList.remove(vStandardTermsRet);
        return removed;
    }

    /**
     * Method removeStandardTermsRetAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public org.chocolate_milk.model.StandardTermsRet removeStandardTermsRetAt(
            final int index) {
        java.lang.Object obj = this._standardTermsRetList.remove(index);
        return (org.chocolate_milk.model.StandardTermsRet) obj;
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
     * Sets the value of field 'retCount'.
     * 
     * @param retCount the value of field 'retCount'.
     */
    public void setRetCount(
            final long retCount) {
        this._retCount = retCount;
        this._has_retCount = true;
    }

    /**
     * 
     * 
     * @param index
     * @param vStandardTermsRet
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setStandardTermsRet(
            final int index,
            final org.chocolate_milk.model.StandardTermsRet vStandardTermsRet)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._standardTermsRetList.size()) {
            throw new IndexOutOfBoundsException("setStandardTermsRet: Index value '" + index + "' not in range [0.." + (this._standardTermsRetList.size() - 1) + "]");
        }

        this._standardTermsRetList.set(index, vStandardTermsRet);
    }

    /**
     * 
     * 
     * @param vStandardTermsRetArray
     */
    public void setStandardTermsRet(
            final org.chocolate_milk.model.StandardTermsRet[] vStandardTermsRetArray) {
        //-- copy array
        _standardTermsRetList.clear();

        for (int i = 0; i < vStandardTermsRetArray.length; i++) {
                this._standardTermsRetList.add(vStandardTermsRetArray[i]);
        }
    }

    /**
     * Sets the value of field 'statusCode'.
     * 
     * @param statusCode the value of field 'statusCode'.
     */
    public void setStatusCode(
            final long statusCode) {
        this._statusCode = statusCode;
        this._has_statusCode = true;
    }

    /**
     * Sets the value of field 'statusMessage'.
     * 
     * @param statusMessage the value of field 'statusMessage'.
     */
    public void setStatusMessage(
            final java.lang.String statusMessage) {
        this._statusMessage = statusMessage;
    }

    /**
     * Sets the value of field 'statusSeverity'.
     * 
     * @param statusSeverity the value of field 'statusSeverity'.
     */
    public void setStatusSeverity(
            final java.lang.String statusSeverity) {
        this._statusSeverity = statusSeverity;
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
