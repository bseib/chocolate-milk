/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ReportCoreFilterChoice.java,v 1.1.1.1 2010-05-04 22:05:59 ryan Exp $
 */

package org.chocolate_milk.model;

/**
 * Class ReportCoreFilterChoice.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:05:59 $
 */
@SuppressWarnings("serial")
public class ReportCoreFilterChoice implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _reportPeriod.
     */
    private org.chocolate_milk.model.ReportPeriod _reportPeriod;

    /**
     * Field _reportDateMacro.
     */
    private org.chocolate_milk.model.types.ReportDateMacroType _reportDateMacro;


      //----------------/
     //- Constructors -/
    //----------------/

    public ReportCoreFilterChoice() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'reportDateMacro'.
     * 
     * @return the value of field 'ReportDateMacro'.
     */
    public org.chocolate_milk.model.types.ReportDateMacroType getReportDateMacro(
    ) {
        return this._reportDateMacro;
    }

    /**
     * Returns the value of field 'reportPeriod'.
     * 
     * @return the value of field 'ReportPeriod'.
     */
    public org.chocolate_milk.model.ReportPeriod getReportPeriod(
    ) {
        return this._reportPeriod;
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
     * Sets the value of field 'reportDateMacro'.
     * 
     * @param reportDateMacro the value of field 'reportDateMacro'.
     */
    public void setReportDateMacro(
            final org.chocolate_milk.model.types.ReportDateMacroType reportDateMacro) {
        this._reportDateMacro = reportDateMacro;
    }

    /**
     * Sets the value of field 'reportPeriod'.
     * 
     * @param reportPeriod the value of field 'reportPeriod'.
     */
    public void setReportPeriod(
            final org.chocolate_milk.model.ReportPeriod reportPeriod) {
        this._reportPeriod = reportPeriod;
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
     * org.chocolate_milk.model.ReportCoreFilterChoice
     */
    public static org.chocolate_milk.model.ReportCoreFilterChoice unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.chocolate_milk.model.ReportCoreFilterChoice) org.exolab.castor.xml.Unmarshaller.unmarshal(org.chocolate_milk.model.ReportCoreFilterChoice.class, reader);
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
