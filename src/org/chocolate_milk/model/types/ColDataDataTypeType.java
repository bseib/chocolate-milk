/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: ColDataDataTypeType.java,v 1.1.1.1 2010-05-04 22:06:02 ryan Exp $
 */

package org.chocolate_milk.model.types;

/**
 * Enumeration ColDataDataTypeType.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:02 $
 */
public enum ColDataDataTypeType {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant IDTYPE
     */
    IDTYPE("IDTYPE"),
    /**
     * Constant GUIDTYPE
     */
    GUIDTYPE("GUIDTYPE"),
    /**
     * Constant STRTYPE
     */
    STRTYPE("STRTYPE"),
    /**
     * Constant BOOLTYPE
     */
    BOOLTYPE("BOOLTYPE"),
    /**
     * Constant DATETYPE
     */
    DATETYPE("DATETYPE"),
    /**
     * Constant DATETIMETYPE
     */
    DATETIMETYPE("DATETIMETYPE"),
    /**
     * Constant TIMEINTERVALTYPE
     */
    TIMEINTERVALTYPE("TIMEINTERVALTYPE"),
    /**
     * Constant AMTTYPE
     */
    AMTTYPE("AMTTYPE"),
    /**
     * Constant PRICETYPE
     */
    PRICETYPE("PRICETYPE"),
    /**
     * Constant QUANTYPE
     */
    QUANTYPE("QUANTYPE"),
    /**
     * Constant PERCENTTYPE
     */
    PERCENTTYPE("PERCENTTYPE"),
    /**
     * Constant ENUMTYPE
     */
    ENUMTYPE("ENUMTYPE"),
    /**
     * Constant INTTYPE
     */
    INTTYPE("INTTYPE");

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field value.
     */
    private final java.lang.String value;

    /**
     * Field enumConstants.
     */
    private static final java.util.Map<java.lang.String, ColDataDataTypeType> enumConstants = new java.util.HashMap<java.lang.String, ColDataDataTypeType>();


    static {
        for (ColDataDataTypeType c: ColDataDataTypeType.values()) {
            ColDataDataTypeType.enumConstants.put(c.value, c);
        }

    };


      //----------------/
     //- Constructors -/
    //----------------/

    private ColDataDataTypeType(final java.lang.String value) {
        this.value = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method fromValue.
     * 
     * @param value
     * @return the constant for this value
     */
    public static org.chocolate_milk.model.types.ColDataDataTypeType fromValue(
            final java.lang.String value) {
        ColDataDataTypeType c = ColDataDataTypeType.enumConstants.get(value);
        if (c != null) {
            return c;
        }
        throw new IllegalArgumentException(value);
    }

    /**
     * 
     * 
     * @param value
     */
    public void setValue(
            final java.lang.String value) {
    }

    /**
     * Method toString.
     * 
     * @return the value of this constant
     */
    public java.lang.String toString(
    ) {
        return this.value;
    }

    /**
     * Method value.
     * 
     * @return the value of this constant
     */
    public java.lang.String value(
    ) {
        return this.value;
    }

}
