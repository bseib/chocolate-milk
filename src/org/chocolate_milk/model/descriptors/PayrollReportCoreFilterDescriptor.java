/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.1</a>, using an XML
 * Schema.
 * $Id: PayrollReportCoreFilterDescriptor.java,v 1.1.1.1 2010-05-04 22:06:01 ryan Exp $
 */

package org.chocolate_milk.model.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.chocolate_milk.model.PayrollReportCoreFilter;

/**
 * Class PayrollReportCoreFilterDescriptor.
 * 
 * @version $Revision: 1.1.1.1 $ $Date: 2010-05-04 22:06:01 $
 */
public class PayrollReportCoreFilterDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _elementDefinition.
     */
    private boolean _elementDefinition;

    /**
     * Field _nsPrefix.
     */
    private java.lang.String _nsPrefix;

    /**
     * Field _nsURI.
     */
    private java.lang.String _nsURI;

    /**
     * Field _xmlName.
     */
    private java.lang.String _xmlName;

    /**
     * Field _identity.
     */
    private org.exolab.castor.xml.XMLFieldDescriptor _identity;


      //----------------/
     //- Constructors -/
    //----------------/

    public PayrollReportCoreFilterDescriptor() {
        super();
        _xmlName = "PayrollReportCoreFilter";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- initialize element descriptors

        //-- _payrollReportCoreFilterChoice
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.PayrollReportCoreFilterChoice.class, "_payrollReportCoreFilterChoice", "-error-if-this-is-used-", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PayrollReportCoreFilter target = (PayrollReportCoreFilter) object;
                return target.getPayrollReportCoreFilterChoice();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PayrollReportCoreFilter target = (PayrollReportCoreFilter) object;
                    target.setPayrollReportCoreFilterChoice( (org.chocolate_milk.model.PayrollReportCoreFilterChoice) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.chocolate_milk.model.PayrollReportCoreFilterChoice();
            }
        };
        desc.setSchemaType("org.chocolate_milk.model.PayrollReportCoreFilterChoice");
        desc.setHandler(handler);
        desc.setContainer(true);
        desc.setClassDescriptor(new org.chocolate_milk.model.descriptors.PayrollReportCoreFilterChoiceDescriptor());
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _payrollReportCoreFilterChoice
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _reportAccountFilter
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.ReportAccountFilter.class, "_reportAccountFilter", "ReportAccountFilter", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PayrollReportCoreFilter target = (PayrollReportCoreFilter) object;
                return target.getReportAccountFilter();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PayrollReportCoreFilter target = (PayrollReportCoreFilter) object;
                    target.setReportAccountFilter( (org.chocolate_milk.model.ReportAccountFilter) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("org.chocolate_milk.model.ReportAccountFilter");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _reportAccountFilter
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _reportEntityFilter
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.ReportEntityFilter.class, "_reportEntityFilter", "ReportEntityFilter", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PayrollReportCoreFilter target = (PayrollReportCoreFilter) object;
                return target.getReportEntityFilter();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PayrollReportCoreFilter target = (PayrollReportCoreFilter) object;
                    target.setReportEntityFilter( (org.chocolate_milk.model.ReportEntityFilter) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("org.chocolate_milk.model.ReportEntityFilter");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _reportEntityFilter
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _reportItemFilter
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.ReportItemFilter.class, "_reportItemFilter", "ReportItemFilter", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PayrollReportCoreFilter target = (PayrollReportCoreFilter) object;
                return target.getReportItemFilter();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PayrollReportCoreFilter target = (PayrollReportCoreFilter) object;
                    target.setReportItemFilter( (org.chocolate_milk.model.ReportItemFilter) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("org.chocolate_milk.model.ReportItemFilter");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _reportItemFilter
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _reportClassFilter
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.ReportClassFilter.class, "_reportClassFilter", "ReportClassFilter", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PayrollReportCoreFilter target = (PayrollReportCoreFilter) object;
                return target.getReportClassFilter();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PayrollReportCoreFilter target = (PayrollReportCoreFilter) object;
                    target.setReportClassFilter( (org.chocolate_milk.model.ReportClassFilter) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("org.chocolate_milk.model.ReportClassFilter");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _reportClassFilter
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _payrollReportCoreFilterChoice2
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.PayrollReportCoreFilterChoice2.class, "_payrollReportCoreFilterChoice2", "-error-if-this-is-used-", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PayrollReportCoreFilter target = (PayrollReportCoreFilter) object;
                return target.getPayrollReportCoreFilterChoice2();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PayrollReportCoreFilter target = (PayrollReportCoreFilter) object;
                    target.setPayrollReportCoreFilterChoice2( (org.chocolate_milk.model.PayrollReportCoreFilterChoice2) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.chocolate_milk.model.PayrollReportCoreFilterChoice2();
            }
        };
        desc.setSchemaType("org.chocolate_milk.model.PayrollReportCoreFilterChoice2");
        desc.setHandler(handler);
        desc.setContainer(true);
        desc.setClassDescriptor(new org.chocolate_milk.model.descriptors.PayrollReportCoreFilterChoice2Descriptor());
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _payrollReportCoreFilterChoice2
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _reportDetailLevelFilter
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.types.ReportDetailLevelFilterType.class, "_reportDetailLevelFilter", "ReportDetailLevelFilter", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PayrollReportCoreFilter target = (PayrollReportCoreFilter) object;
                return target.getReportDetailLevelFilter();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PayrollReportCoreFilter target = (PayrollReportCoreFilter) object;
                    target.setReportDetailLevelFilter( (org.chocolate_milk.model.types.ReportDetailLevelFilterType) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        handler = new org.exolab.castor.xml.handlers.EnumFieldHandler(org.chocolate_milk.model.types.ReportDetailLevelFilterType.class, handler);
        desc.setImmutable(true);
        desc.setSchemaType("ReportDetailLevelFilterType");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _reportDetailLevelFilter
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _reportPostingStatusFilter
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.chocolate_milk.model.types.ReportPostingStatusFilterType.class, "_reportPostingStatusFilter", "ReportPostingStatusFilter", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                PayrollReportCoreFilter target = (PayrollReportCoreFilter) object;
                return target.getReportPostingStatusFilter();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    PayrollReportCoreFilter target = (PayrollReportCoreFilter) object;
                    target.setReportPostingStatusFilter( (org.chocolate_milk.model.types.ReportPostingStatusFilterType) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        handler = new org.exolab.castor.xml.handlers.EnumFieldHandler(org.chocolate_milk.model.types.ReportPostingStatusFilterType.class, handler);
        desc.setImmutable(true);
        desc.setSchemaType("ReportPostingStatusFilterType");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _reportPostingStatusFilter
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method getAccessMode.
     * 
     * @return the access mode specified for this class.
     */
    @Override()
    public org.exolab.castor.mapping.AccessMode getAccessMode(
    ) {
        return null;
    }

    /**
     * Method getIdentity.
     * 
     * @return the identity field, null if this class has no
     * identity.
     */
    @Override()
    public org.exolab.castor.mapping.FieldDescriptor getIdentity(
    ) {
        return _identity;
    }

    /**
     * Method getJavaClass.
     * 
     * @return the Java class represented by this descriptor.
     */
    @Override()
    public java.lang.Class getJavaClass(
    ) {
        return org.chocolate_milk.model.PayrollReportCoreFilter.class;
    }

    /**
     * Method getNameSpacePrefix.
     * 
     * @return the namespace prefix to use when marshaling as XML.
     */
    @Override()
    public java.lang.String getNameSpacePrefix(
    ) {
        return _nsPrefix;
    }

    /**
     * Method getNameSpaceURI.
     * 
     * @return the namespace URI used when marshaling and
     * unmarshaling as XML.
     */
    @Override()
    public java.lang.String getNameSpaceURI(
    ) {
        return _nsURI;
    }

    /**
     * Method getValidator.
     * 
     * @return a specific validator for the class described by this
     * ClassDescriptor.
     */
    @Override()
    public org.exolab.castor.xml.TypeValidator getValidator(
    ) {
        return this;
    }

    /**
     * Method getXMLName.
     * 
     * @return the XML Name for the Class being described.
     */
    @Override()
    public java.lang.String getXMLName(
    ) {
        return _xmlName;
    }

    /**
     * Method isElementDefinition.
     * 
     * @return true if XML schema definition of this Class is that
     * of a global
     * element or element with anonymous type definition.
     */
    public boolean isElementDefinition(
    ) {
        return _elementDefinition;
    }

}
