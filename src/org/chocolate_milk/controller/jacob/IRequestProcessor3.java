package org.chocolate_milk.controller.jacob;

import com.jacob.com.*;

public class IRequestProcessor3 extends Dispatch {

    //public static final String componentName = "QBXMLRP2ELib.IRequestProcessor3";
    public static final String componentName = "clsid:{45F5708E-3B43-4FA8-BE7E-A5F1849214CB}";

    public IRequestProcessor3() {
        super(componentName);
    }

    /**
     * This constructor is used instead of a case operation to
     * turn a Dispatch object into a wider object - it must exist
     * in every wrapper class whose instances may be returned from
     * method calls wrapped in VT_DISPATCH Variants.
     */
    public IRequestProcessor3(Dispatch d) {
        // take over the IDispatch pointer
        m_pDispatch = d.m_pDispatch;
        // null out the input's pointer
        d.m_pDispatch = 0;
    }

    public IRequestProcessor3(String compName) {
        super(compName);
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     * @param appID an input-parameter of type String
     * @param lastParam an input-parameter of type String
     */
    public void openConnection(String appID, String lastParam) {
        
            Dispatch.call(this, "OpenConnection", appID, lastParam);
       
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     * @param ticket an input-parameter of type String
     * @param lastParam an input-parameter of type String
     * @return the result is of type String
     */
    public String processRequest(String ticket, String lastParam) {
        return Dispatch.call(this, "ProcessRequest", ticket, lastParam).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     */
    public void closeConnection() {
        Dispatch.call(this, "CloseConnection");
        this.finalize();
        
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     * @param qbFileName an input-parameter of type String
     * @param lastParam an input-parameter of type int
     * @return the result is of type String
     */
    public String beginSession(String qbFileName, int lastParam) {
        return Dispatch.call(this, "BeginSession", qbFileName, new Variant(lastParam)).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     * @param lastParam an input-parameter of type String
     */
    public void endSession(String lastParam) {
        Dispatch.call(this, "EndSession", lastParam);
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     * @param lastParam an input-parameter of type String
     * @return the result is of type String
     */
    public String getCurrentCompanyFileName(String lastParam) {
        return Dispatch.call(this, "GetCurrentCompanyFileName", lastParam).toString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     * @return the result is of type short
     */
    public short getMajorVersion() {
        return Dispatch.get(this, "MajorVersion").getShort();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     * @return the result is of type short
     */
    public short getMinorVersion() {
        return Dispatch.get(this, "MinorVersion").getShort();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     * @return the result is of type int
     */
    public int getReleaseLevel() {
        return Dispatch.get(this, "ReleaseLevel").getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     * @return the result is of type short
     */
    public short getReleaseNumber() {
        return Dispatch.get(this, "ReleaseNumber").getShort();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     * @param lastParam an input-parameter of type String
     * @return the result is of type SafeArray
     */
    public SafeArray getQBXMLVersionsForSession(String lastParam) {
        return Dispatch.call(this, "QBXMLVersionsForSession", lastParam).toSafeArray();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     * @return the result is of type int
     */
    public int getConnectionType() {
        return Dispatch.get(this, "ConnectionType").getInt();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     * @param lastParam an input-parameter of type String
     * @return the result is of type String
     */
    public String processSubscription(String lastParam) {
        return Dispatch.call(this, "ProcessSubscription", lastParam).getString();
    }

    /**
     * Wrapper for calling the ActiveX-Method with input-parameter(s).
     * @return the result is of type SafeArray
     */
    public SafeArray getQBXMLVersionsForSubscription() {
        return Dispatch.get(this, "QBXMLVersionsForSubscription").toSafeArray();
    }

    
}
