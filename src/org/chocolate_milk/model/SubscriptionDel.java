/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: SubscriptionDel.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class SubscriptionDel.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class SubscriptionDel implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _subscriberID.
     */
    private java.lang.String _subscriberID;

    /**
     * Field _subscriptionType.
     */
    private org.chocolate_milk.model.types.SubscriptionTypeType _subscriptionType;


      //----------------/
     //- Constructors -/
    //----------------/

    public SubscriptionDel() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'subscriberID'.
     * 
     * @return the value of field 'SubscriberID'.
     */
    public java.lang.String getSubscriberID(
    ) {
        return this._subscriberID;
    }

    /**
     * Returns the value of field 'subscriptionType'.
     * 
     * @return the value of field 'SubscriptionType'.
     */
    public org.chocolate_milk.model.types.SubscriptionTypeType getSubscriptionType(
    ) {
        return this._subscriptionType;
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
     * Sets the value of field 'subscriberID'.
     * 
     * @param subscriberID the value of field 'subscriberID'.
     */
    public void setSubscriberID(
            final java.lang.String subscriberID) {
        this._subscriberID = subscriberID;
    }

    /**
     * Sets the value of field 'subscriptionType'.
     * 
     * @param subscriptionType the value of field 'subscriptionType'
     */
    public void setSubscriptionType(
            final org.chocolate_milk.model.types.SubscriptionTypeType subscriptionType) {
        this._subscriptionType = subscriptionType;
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
     * org.chocolate_milk.model.SubscriptionDel
     */
    public static org.chocolate_milk.model.SubscriptionDel unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.SubscriptionDel) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.SubscriptionDel.class, reader);
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
